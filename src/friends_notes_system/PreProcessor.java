/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package friends_notes_system;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class PreProcessor {
    String getSpecialSymbolRemoved(String query){
        char spsymbol[]={'`','!','@','#','$','%','^','&','*','(',')','<','>','?','-','.',',','"'};
        for (int i = 0; i < spsymbol.length; i++) {
            char sp=spsymbol[i];
            if(query.contains(String.valueOf(sp))){
                query=query.replace(sp,  ' ');
            }
        }
        return query;
    }
    
    String getStopWordRemoved(String query){
        ArrayList<String> sw=new ArrayList<String>();
    sw.add("a");
    sw.add("able");
    sw.add("about");
    sw.add("above");
    sw.add("according");
    sw.add("accordingly");
    sw.add("across");
    sw.add("actually");
    sw.add("after");
    sw.add("afterwards");
    sw.add("again");
    sw.add("against");
    sw.add("all");
    sw.add("allow");
    sw.add("allows");
    sw.add("almost");
    sw.add("alone");
    sw.add("along");
    sw.add("already");
    sw.add("also");
    sw.add("although");
    sw.add("always");
    sw.add("am");
    sw.add("among");
    sw.add("amongst");
    sw.add("an");
    sw.add("and");
    sw.add("another");
    sw.add("any");
    sw.add("anybody");
    sw.add("anyhow");
    sw.add("anyone");
    sw.add("anything");
    sw.add("anyway");
    sw.add("anyways");
    sw.add("anywhere");
    sw.add("apart");
    sw.add("appear");
    sw.add("appreciate");
    sw.add("appropriate");
    sw.add("are");
    sw.add("around");
    sw.add("as");
    sw.add("aside");
    sw.add("ask");
    sw.add("asking");
    sw.add("associated");
    sw.add("at");
    sw.add("available");
    sw.add("away");
    sw.add("awfully");
    sw.add("b");
    sw.add("be");
    sw.add("became");
    sw.add("because");
    sw.add("become");
    sw.add("becomes");
    sw.add("becoming");
    sw.add("been");
    sw.add("before");
    sw.add("beforehand");
    sw.add("behind");
    sw.add("being");
    sw.add("believe");
    sw.add("below");
    sw.add("beside");
    sw.add("besides");
    sw.add("best");
    sw.add("better");
    sw.add("between");
    sw.add("beyond");
    sw.add("both");
    sw.add("brief");
    sw.add("but");
    sw.add("by");
    sw.add("c");
    sw.add("came");
    sw.add("can");
    sw.add("cannot");
    sw.add("cant");
    sw.add("cause");
    sw.add("causes");
    sw.add("certain");
    sw.add("certainly");
    sw.add("changes");
    sw.add("clearly");
    sw.add("co");
    sw.add("com");
    sw.add("come");
    sw.add("comes");
    sw.add("concerning");
    sw.add("consequently");
    sw.add("consider");
    sw.add("considering");
    sw.add("contain");
    sw.add("containing");
    sw.add("contains");
    sw.add("corresponding");
    sw.add("could");
    sw.add("course");
    sw.add("currently");
    sw.add("d");
    sw.add("definitely");
    sw.add("described");
    sw.add("despite");
    sw.add("did");
    sw.add("different");
    sw.add("do");
    sw.add("does");
    sw.add("doing");
    sw.add("done");
    sw.add("down");
    sw.add("downwards");
    sw.add("during");
    sw.add("e");
    sw.add("each");
    sw.add("edu");
    sw.add("eg");
    sw.add("eight");
    sw.add("either");
    sw.add("else");
    sw.add("elsewhere");
    sw.add("enough");
    sw.add("entirely");
    sw.add("especially");
    sw.add("et");
    sw.add("etc");
    sw.add("even");
    sw.add("ever");
    sw.add("every");
    sw.add("everybody");
    sw.add("everyone");
    sw.add("everything");
    sw.add("everywhere");
    sw.add("ex");
    sw.add("exactly");
    sw.add("example");
    sw.add("except");
    sw.add("f");
    sw.add("far");
    sw.add("few");
    sw.add("fifth");
    sw.add("first");
    sw.add("five");
    sw.add("followed");
    sw.add("following");
    sw.add("follows");
    sw.add("for");
    sw.add("former");
    sw.add("formerly");
    sw.add("forth");
    sw.add("four");
    sw.add("from");
    sw.add("further");
    sw.add("furthermore");
    sw.add("g");
    sw.add("get");
    sw.add("gets");
    sw.add("getting");
    sw.add("given");
    sw.add("gives");
    sw.add("go");
    sw.add("goes");
   // sw.add("going");
    sw.add("gone");
    sw.add("got");
    sw.add("gotten");
    sw.add("greetings");
    sw.add("h");
    sw.add("had");
    sw.add("happens");
    sw.add("hardly");
    sw.add("has");
    sw.add("have");
    sw.add("having");
    sw.add("he");
    sw.add("hello");
    sw.add("help");
    sw.add("hence");
    sw.add("her");
    sw.add("here");
    sw.add("hereafter");
    sw.add("hereby");
    sw.add("herein");
    sw.add("hereupon");
    sw.add("hers");
    sw.add("herself");
    sw.add("hi");
    sw.add("him");
    sw.add("himself");
    sw.add("his");
    sw.add("hither");
    sw.add("hopefully");
    sw.add("how");
    sw.add("howbeit");
    sw.add("however");
    sw.add("i");
    sw.add("ie");
    sw.add("if");
    sw.add("ignored");
    sw.add("immediate");
    sw.add("in");
    sw.add("inasmuch");
    sw.add("inc");
    sw.add("indeed");
    sw.add("indicate");
    sw.add("indicated");
    sw.add("indicates");
    sw.add("inner");
    sw.add("insofar");
    sw.add("instead");
    sw.add("into");
    sw.add("inward");
    sw.add("is");
    sw.add("it");
    sw.add("its");
    sw.add("itself");
    sw.add("j");
    sw.add("just");
    sw.add("k");
    sw.add("keep");
    sw.add("keeps");
    sw.add("kept");
    sw.add("know");
    sw.add("knows");
    sw.add("known");
    sw.add("l");
  //  sw.add("last");
    sw.add("lately");
    sw.add("later");
    sw.add("latter");
    sw.add("latterly");
    sw.add("least");
    sw.add("less");
    sw.add("lest");
    sw.add("let");
    sw.add("like");
    sw.add("liked");
    sw.add("likely");
    sw.add("little");
    sw.add("ll"); 
    sw.add("look");
    sw.add("looking");
    sw.add("looks");
    sw.add("ltd");
    sw.add("m");
    sw.add("mainly");
    sw.add("many");
    sw.add("may");
    sw.add("maybe");
    sw.add("me");
    sw.add("mean");
    sw.add("meanwhile");
    sw.add("merely");
    sw.add("might");
    sw.add("more");
    sw.add("moreover");
    sw.add("most");
    sw.add("mostly");
    sw.add("much");
    sw.add("must");
    sw.add("my");
    sw.add("myself");
    sw.add("n");
    sw.add("name");
    sw.add("namely");
    sw.add("nd");
    sw.add("near");
    sw.add("nearly");
    sw.add("necessary");
    sw.add("need");
    sw.add("needs");
    sw.add("neither");
    sw.add("never");
    sw.add("nevertheless");
    sw.add("new");
    sw.add("next");
    sw.add("nine");
    sw.add("no");
    sw.add("nobody");
    sw.add("non");
    sw.add("none");
    sw.add("noone");
    sw.add("nor");
    sw.add("normally");
    sw.add("not");
    sw.add("nothing");
    sw.add("novel");
    sw.add("now");
    sw.add("nowhere");
    sw.add("o");
    sw.add("obviously");
    sw.add("of");
    sw.add("off");
    sw.add("often");
    sw.add("oh");
    sw.add("ok");
    sw.add("okay");
    sw.add("old");
    sw.add("on");
    sw.add("once");
    sw.add("one");
    sw.add("ones");
    sw.add("only");
    sw.add("onto");
    sw.add("or");
    sw.add("other");
    sw.add("others");
    sw.add("otherwise");
    sw.add("ought");
    sw.add("our");
    sw.add("ours");
    sw.add("ourselves");
    sw.add("out");
    sw.add("outside");
    sw.add("over");
    sw.add("overall");
    sw.add("own");
    sw.add("p");
    sw.add("particular");
    sw.add("particularly");
    sw.add("per");
    sw.add("perhaps");
    sw.add("placed");
    sw.add("please");
    sw.add("plus");
    sw.add("possible");
    sw.add("presumably");
    sw.add("probably");
    sw.add("provides");
    sw.add("q");
    sw.add("que");
    sw.add("quite");
    sw.add("qv");
    sw.add("r");
    sw.add("rather");
    sw.add("rd");
    sw.add("re");
    sw.add("really");
    sw.add("reasonably");
    sw.add("regarding");
    sw.add("regardless");
    sw.add("regards");
    sw.add("relatively");
    sw.add("respectively");
    sw.add("right");
    sw.add("s");
    sw.add("said");
    sw.add("same");
    sw.add("saw");
    sw.add("say");
    sw.add("saying");
    sw.add("says");
    sw.add("second");
    sw.add("secondly");
    sw.add("see");
    sw.add("seeing");
    sw.add("seem");
    sw.add("seemed");
    sw.add("seeming");
    sw.add("seems");
    sw.add("seen");
    sw.add("self");
    sw.add("selves");
    sw.add("sensible");
    sw.add("sent");
    sw.add("serious");
    sw.add("seriously");
    sw.add("seven");
    sw.add("several");
    sw.add("shall");
    sw.add("she");
    sw.add("should");
    sw.add("since");
    sw.add("six");
    sw.add("so");
    sw.add("some");
    sw.add("somebody");
    sw.add("somehow");
    sw.add("someone");
    sw.add("something");
    sw.add("sometime");
    sw.add("sometimes");
    sw.add("somewhat");
    sw.add("somewhere");
    sw.add("soon");
    sw.add("sorry");
    sw.add("specified");
    sw.add("specify");
    sw.add("specifying");
    sw.add("still");
    sw.add("sub");
    sw.add("such");
    sw.add("sup");
    sw.add("sure");
    sw.add("t");
    sw.add("take");
    sw.add("taken");
    sw.add("tell");
    sw.add("tends");
    sw.add("th");
    sw.add("than");
    sw.add("thank");
    sw.add("thanks");
    sw.add("thanx");
    sw.add("that");
    sw.add("thats");
    sw.add("the");
    sw.add("their");
    sw.add("theirs");
    sw.add("them");
    sw.add("themselves");
    sw.add("then");
    sw.add("thence");
    sw.add("there");
    sw.add("thereafter");
    sw.add("thereby");
    sw.add("therefore");
    sw.add("therein");
    sw.add("theres");
    sw.add("thereupon");
    sw.add("these");
    sw.add("they");
    sw.add("think");
    sw.add("third");
    sw.add("this");
    sw.add("thorough");
    sw.add("thoroughly");
    sw.add("those");
    sw.add("though");
    sw.add("three");
    sw.add("through");
    sw.add("throughout");
    sw.add("thru");
    sw.add("thus");
    sw.add("to");
    sw.add("together");
    sw.add("too");
    sw.add("took");
    sw.add("toward");
    sw.add("towards");
    sw.add("tried");
    sw.add("tries");
    sw.add("truly");
    sw.add("try");
    sw.add("trying");
    sw.add("twice");
    sw.add("two");
    sw.add("u");
    sw.add("un");
    sw.add("under");
    sw.add("unfortunately");
    sw.add("unless");
    sw.add("unlikely");
    sw.add("until");
    sw.add("unto");
    sw.add("up");
    sw.add("upon");
    sw.add("us");
    sw.add("use");
    sw.add("used");
    sw.add("useful");
    sw.add("uses");
    sw.add("using");
    sw.add("usually");
    sw.add("uucp");
    sw.add("v");
    sw.add("value");
    sw.add("various");
    sw.add("ve"); //sw.added to avoid words like I've,you've etc.
    sw.add("very");
    sw.add("via");
    sw.add("viz");
    sw.add("vs");
    sw.add("w");
    sw.add("want");
    sw.add("wants");
    sw.add("was");
    sw.add("way");
    sw.add("we");
    sw.add("welcome");
    sw.add("well");
    sw.add("went");
    sw.add("were");
    sw.add("what");
    sw.add("whatever");
    sw.add("when");
    sw.add("whence");
    sw.add("whenever");
    sw.add("where");
    sw.add("whereafter");
    sw.add("whereas");
    sw.add("whereby");
    sw.add("wherein");
    sw.add("whereupon");
    sw.add("wherever");
    sw.add("whether");
    sw.add("which");
    sw.add("while");
    sw.add("whither");
    sw.add("who");
    sw.add("whoever");
    sw.add("whole");
    sw.add("whom");
    sw.add("whose");
    sw.add("why");
    sw.add("will");
    sw.add("willing");
    sw.add("wish");
    sw.add("with");
    sw.add("within");
    sw.add("without");
    sw.add("wonder");
    sw.add("would");
    sw.add("would");
    sw.add("x");
    sw.add("y");
    sw.add("yes");
    sw.add("yet");
    sw.add("you");
    sw.add("your");
    sw.add("yours");
    sw.add("yourself");
    sw.add("yourselves");
    sw.add("z");
    sw.add("zero"); 
    
    
        String words[]=query.split(" ");
        
        String newquery="";
        for(int i=0;i<words.length;i++){
            String singleword=words[i];
            singleword=singleword.trim();
            if(singleword.length()>0){
                //System.out.println("Single word is:"+singleword);
                boolean flag=false;
                for (int j = 0; j < sw.size(); j++) {
                    String stopword=sw.get(j);
                    stopword=stopword.toLowerCase();
                    if(singleword.equals(stopword)){
                        
                        flag=true;
                        break;
                    }
                }
                if(!flag){
                    newquery=newquery+" "+singleword;
                }
            }
        }    
        newquery=newquery.trim();
        return newquery;
    }
}
