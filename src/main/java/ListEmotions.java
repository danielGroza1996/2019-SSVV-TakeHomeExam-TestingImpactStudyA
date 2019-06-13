import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class ListEmotions {

    private List<Emotion> lstEmotions;

    public ListEmotions(List<Emotion> newLstEmotions){
        this.lstEmotions = newLstEmotions;
    }

    public int getNumberOfEmotions(){
        return lstEmotions.size();
    }

    // Task A_1
    // return the number of emotion of the given EmotionType et
    // Remark: No test cases are going to be created.
    public int howGivenManyEmotionTypeInListEmotions(EmotionType et){
        int nJE=0;
       //Add code here
        for (Emotion e: lstEmotions)
            if (e.getEmotionType().equals(et))
                nJE++;
        return nJE;
    }

    // Task A_2
    // return the list of predominant emotions
    // Remark: Create a set of test cases to assess the correctness of your code.
    //         Create a class to test this method, several test cases are needed.
    //         One sample test case is provided in cladd Test_ListEmotions.
    public List<Emotion> predominantEmotion(){
        List<Emotion> lstEPredominant = new ArrayList<>();
        //Add code here
        if (lstEmotions.isEmpty())
            return lstEPredominant;

        Map<String, Integer> map = new HashMap<>();

        for (Emotion e : lstEmotions) {
            Integer val = map.get(e.getEmotionType().toString());
            map.put(e.getEmotionType().toString(), val == null ? 1 : val + 1);
        }

        Map.Entry<String, Integer> max = null;

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (max == null || e.getValue() > max.getValue())
                max = e;
        }

        if (lstEmotions.size() == map.size())
            return lstEPredominant; //All emotions are equal in value, so none is predominant

        for(Map.Entry<String, Integer> e: map.entrySet())
            if (e.getValue() == max.getValue()) {
                boolean aux = false;
                for (Emotion em : lstEmotions)
                    if (em.getEmotionType().toString() == e.getKey() && !aux) {
                        lstEPredominant.add(em);
                        aux = true;
                    }
            }

        return  lstEPredominant;
    }

    // Task A_3
    // Eliminate the emotions that are of given type EmotionType et
    // Remark: A set of test cases to assess the correctness of your code is provided.
    //         A class to test this method was created, several test cases were added.
    //         Use the test cases to check for your code.
    public void eliminateAllProvidedEmotion(EmotionType et) {
        //Add code here
        List<Emotion> el = new ArrayList<>();
        for (Emotion e: lstEmotions)
            if (!e.getEmotionType().equals(et))
                el.add(e);
        lstEmotions.clear();
        lstEmotions.addAll(el);
    }
}
