package friends_notes_system;
import db.DBDriver;
import static friends_notes_system.StudentOPFrame.studentname;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author User
 */
public class SearchInit 
{
   public static ArrayList uploaded_preprocessed_data = new ArrayList();
    public static ArrayList getUploadeddata()
    {
        ArrayList data = new ArrayList();
        
        
        try{
            DBDriver dbd =new DBDriver();
            Statement st1 = dbd.getStatement();
            
            String query = "select * from uploadinfo where username = '"+studentname+"'"; 
            System.out.println("Query: "+ query);
            ResultSet rs1 = st1.executeQuery(query);
            //username, filename, description, date_time
            
            while(rs1.next())
            {
                ArrayList row = new ArrayList();
                for (int i = 1; i < 5; i++) 
                    row.add(rs1.getString(i)); 
                data.add(row);
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception at getFileInfo() in class UploadOP: "+e);
        }
        
        
        return data;
    }
    
    public static String getPreProcessedQuery(String query)
    {
        PreProcessor ps=new PreProcessor();
        String query1 = ps.getSpecialSymbolRemoved(query);
        String preProcessedquery = ps.getStopWordRemoved(query1).trim();
        //System.out.println("Final query: "+ preProcessedquery);
        return preProcessedquery;
    }
   public static String[][] getSearchinfo(String query) {
    String sorteddata[][] = new String[3][3]; 
    ArrayList termweight_Description = new ArrayList();
    
    String preProcessedquery = getPreProcessedQuery(query);
       System.out.println("PreProcessed query: " +preProcessedquery);
       System.out.println("uploaded_preprocessed_data: "+uploaded_preprocessed_data);
    for (int i = 0; i < uploaded_preprocessed_data.size(); i++) {
        ArrayList row = (ArrayList) uploaded_preprocessed_data.get(i);
        String description = (String) row.get(2);
        double tweight = getTermWeight(preProcessedquery, description);
        
        ArrayList tempRow = new ArrayList(row); // Copy original row
        tempRow.add(tweight); // Add term weight as the 5th element
        termweight_Description.add(tempRow);
    }
       System.out.println("termweight_Description: "+termweight_Description);
    for (int i = 0; i < termweight_Description.size()-1; i++) 
        {
            for (int j = i+1; j < termweight_Description.size(); j++) 
            {
                ArrayList temp1 = (ArrayList) termweight_Description.get(i);
                ArrayList temp2 = (ArrayList) termweight_Description.get(j);
                double p1 = ((Number) temp1.get(4)).doubleValue();
                double p2 = ((Number) temp2.get(4)).doubleValue();

                
                if(p1 < p2)
                {
                    termweight_Description.set(i, temp2);
                    termweight_Description.set(j, temp1);
               }
            }
        }
   
    for (int i = 0; i < 3; i++) {
        ArrayList temp = (ArrayList) termweight_Description.get(i);
        for (int j = 0; j < 3; j++) { // Only copy username, filename, description, datetime
            sorteddata[i][j] = String.valueOf(temp.get(j+1));
        }
    }

    return sorteddata;
}

    
    
    public static double getTermWeight(String query, String description)
    {
        double termweight = 0;
        String qa[] = query.split(" ");
        ArrayList querywords =new ArrayList();
        ArrayList questionwords =new ArrayList();
        for (int i = 0; i < qa.length; i++) 
        {
        String singleword = qa[i];
        singleword = singleword.trim().toLowerCase();
        if(singleword.length()>0)
            querywords.add(singleword);
        }
        String qua[] = description.split(" ");
        
        for (int i = 0; i < qua.length; i++) 
        {
        String singleword = qua[i];
        singleword = singleword.trim().toLowerCase();
        if(singleword.length()>0)
            questionwords.add(singleword);
        }
        double count = 0;
        for (int i = 0; i < querywords.size(); i++) {
            String queryword = (String) querywords.get(i);
            for (int j = 0; j < questionwords.size(); j++) {
                if(queryword.equals(questionwords.get(j)))
                {
                    count++;
                    break;
                }
            }
        }
        termweight = (double)count / querywords.size();
        return termweight;
    }
}
