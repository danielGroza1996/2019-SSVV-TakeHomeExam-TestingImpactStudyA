
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class Test_ListEmotions {


    // Sample test case for the functionality "predominantEmotion"
    @Test
    public void Test_PredominantJoy_predominantEmotion(){
        System.out.println("Test .... Test_PredominantJoy_predominantEmotion ... ");
        List<Emotion> testLstEmotions = new ArrayList<Emotion>();
        List lEmotions = new ArrayList<Emotion>();
        Emotion eA = new Emotion("Anger", EmotionType.Anger);
        lEmotions.add(eA);
        Emotion eS = new Emotion("Sadness", EmotionType.Sadness);
        lEmotions.add(eS);
        Emotion eJ = new Emotion("Joy", EmotionType.Joy);
        lEmotions.add(eJ);
        Emotion eD = new Emotion("Fear", EmotionType.Fear);
        lEmotions.add(eD);
        Emotion eF = new Emotion("Joy", EmotionType.Joy);
        lEmotions.add(eF);
        ListEmotions le = new ListEmotions(lEmotions);

        List<Emotion> lstPE = le.predominantEmotion();
        assertEquals(lstPE.size(), 1);
    }

    @Test
    public void Test_AllJoy_predominantEmotion(){
        System.out.println("Test .... Test_AllJoy_predominantEmotion ... ");
        List<Emotion> testLstEmotions = new ArrayList<Emotion>();
        List lEmotions = new ArrayList<Emotion>();
        Emotion eA = new Emotion("Joy", EmotionType.Anger);
        lEmotions.add(eA);
        Emotion eS = new Emotion("Joy", EmotionType.Sadness);
        lEmotions.add(eS);
        Emotion eJ = new Emotion("Joy", EmotionType.Joy);
        lEmotions.add(eJ);
        Emotion eF = new Emotion("Joy", EmotionType.Joy);
        lEmotions.add(eF);
        ListEmotions le = new ListEmotions(lEmotions);

        List<Emotion> lstPE = le.predominantEmotion();
        assertEquals(lstPE.size(), 1);
    }

    @Test
    public void Test_PredominantJoyAndAnger_predominantEmotion(){
        System.out.println("Test .... Test_PredominantJoyAndAnger_predominantEmotion ... ");
        List<Emotion> testLstEmotions = new ArrayList<Emotion>();
        List lEmotions = new ArrayList<Emotion>();
        Emotion eA = new Emotion("Anger", EmotionType.Anger);
        lEmotions.add(eA);
        Emotion eS = new Emotion("Sadness", EmotionType.Sadness);
        lEmotions.add(eS);
        Emotion eJ = new Emotion("Anger", EmotionType.Anger);
        lEmotions.add(eJ);
        Emotion eF = new Emotion("Joy", EmotionType.Joy);
        lEmotions.add(eF);
        Emotion eG = new Emotion("Joy", EmotionType.Joy);
        lEmotions.add(eG);
        ListEmotions le = new ListEmotions(lEmotions);

        List<Emotion> lstPE = le.predominantEmotion();
        assertEquals(lstPE.size(), 2);
    }

    @Test
    public void Test_NoPredominantEmotions_predominantEmotion(){
        System.out.println("Test .... Test_NoPredominantEmotions_predominantEmotion ... ");
        List<Emotion> testLstEmotions = new ArrayList<Emotion>();
        List lEmotions = new ArrayList<Emotion>();
        Emotion eA = new Emotion("Anger", EmotionType.Anger);
        lEmotions.add(eA);
        Emotion eS = new Emotion("Sadness", EmotionType.Sadness);
        lEmotions.add(eS);
        Emotion eJ = new Emotion("Joy", EmotionType.Joy);
        lEmotions.add(eJ);
        Emotion eF = new Emotion("Fear", EmotionType.Fear);
        lEmotions.add(eF);
        Emotion eG = new Emotion("Disgust", EmotionType.Disgust);
        lEmotions.add(eG);
        ListEmotions le = new ListEmotions(lEmotions);

        List<Emotion> lstPE = le.predominantEmotion();
        assertEquals(lstPE.size(), 0);
    }

    @Test
    public void Test_ThreePredominantEmotions_predominantEmotion(){
        System.out.println("Test .... Test_ThreePredominantEmotions_predominantEmotion ... ");
        List<Emotion> testLstEmotions = new ArrayList<Emotion>();
        List lEmotions = new ArrayList<Emotion>();
        Emotion eA = new Emotion("Anger", EmotionType.Anger);
        lEmotions.add(eA);
        Emotion eS = new Emotion("Sadness", EmotionType.Sadness);
        lEmotions.add(eS);
        Emotion eJ = new Emotion("Joy", EmotionType.Joy);
        lEmotions.add(eJ);
        Emotion eF = new Emotion("Anger", EmotionType.Anger);
        lEmotions.add(eF);
        Emotion eG = new Emotion("Disgust", EmotionType.Disgust);
        lEmotions.add(eG);
        Emotion eH = new Emotion("Disgust", EmotionType.Disgust);
        lEmotions.add(eH);
        Emotion eI = new Emotion("Joy", EmotionType.Joy);
        lEmotions.add(eI);
        ListEmotions le = new ListEmotions(lEmotions);

        List<Emotion> lstPE = le.predominantEmotion();
        assertEquals(lstPE.size(), 3);
    }

    @Test
    public void emotionLevelGerman_predominantEmotion(){
        System.out.println("Test .... Test_emotionLevelGerman_predominantEmotion ... ");
        List<Emotion> testLstEmotions = new ArrayList<Emotion>();
        List lEmotions = new ArrayList<Emotion>();

        ListEmotions le = new ListEmotions(lEmotions);

        List<Emotion> lstPE = le.predominantEmotion();
        assertEquals(lstPE.size(), 0);
    }

    @Test
    public void Test_EliminateOne_eliminateAllProvidedEmotion(){
        System.out.println("Test .... Test_EliminateOne_eliminateAllProvidedEmotion ... ");
        List<Emotion> testLstEmotions = new ArrayList<Emotion>();
        List lEmotions = new ArrayList<Emotion>();
        Emotion eA = new Emotion("Anger", EmotionType.Anger);
        lEmotions.add(eA);
        Emotion eS = new Emotion("Sadness", EmotionType.Sadness);
        lEmotions.add(eS);
        Emotion eJ = new Emotion("Joy", EmotionType.Joy);
        lEmotions.add(eJ);
        Emotion eD = new Emotion("Disgust", EmotionType.Disgust);
        lEmotions.add(eD);
        Emotion eF = new Emotion("Fear", EmotionType.Fear);
        lEmotions.add(eF);

        ListEmotions le = new ListEmotions(lEmotions);
        //System.out.println("Number of  Emotions="+le.getNumberOfEmotions());
        le.eliminateAllProvidedEmotion(EmotionType.Joy);
        assertEquals(le.getNumberOfEmotions(), 4);
    }
    @Test
    public void Test_EliminateAll_eliminateAllProvidedEmotion(){
        System.out.println("Test .... Test_EliminateAll_eliminateAllProvidedEmotion ... ");
        List<Emotion> testLstEmotions = new ArrayList<Emotion>();
        List lEmotions = new ArrayList<Emotion>();
        Emotion eJ = new Emotion("Joy", EmotionType.Joy);
        lEmotions.add(eJ);
        Emotion eA = new Emotion("Anger", EmotionType.Anger);
        lEmotions.add(eA);
        Emotion eJ2 = new Emotion("Joy", EmotionType.Joy);
        lEmotions.add(eJ2);
        Emotion eS = new Emotion("Sadness", EmotionType.Sadness);
        lEmotions.add(eS);
        Emotion eJ3 = new Emotion("Joy", EmotionType.Joy);
        lEmotions.add(eJ3);
        Emotion eD = new Emotion("Digust", EmotionType.Disgust);
        lEmotions.add(eD);
        Emotion eF = new Emotion("Fear", EmotionType.Fear);
        lEmotions.add(eF);
        Emotion eJ4 = new Emotion("Joy", EmotionType.Joy);
        lEmotions.add(eJ4);

        ListEmotions le = new ListEmotions(lEmotions);
        //System.out.println("Number of  Emotions="+le.getNumberOfEmotions());
        le.eliminateAllProvidedEmotion(EmotionType.Joy);
        //System.out.println("Number of Emotions after elimination="+le.getNumberOfEmotions());
        assertEquals(le.getNumberOfEmotions(), 4);
    }
    @Test
    public void Test_EliminateAllElements_eliminateAllProvidedEmotion(){
        System.out.println("Test .... Test_EliminateAllElements_eliminateAllProvidedEmotion ... ");
        List<Emotion> testLstEmotions = new ArrayList<Emotion>();
        List lEmotions = new ArrayList<Emotion>();
        Emotion eJ = new Emotion("Joy", EmotionType.Joy);
        lEmotions.add(eJ);
        Emotion eJ2 = new Emotion("Joy", EmotionType.Joy);
        lEmotions.add(eJ2);
        Emotion eJ3 = new Emotion("Joy", EmotionType.Joy);
        lEmotions.add(eJ3);
        Emotion eJ4 = new Emotion("Joy", EmotionType.Joy);
        lEmotions.add(eJ4);

        ListEmotions le = new ListEmotions(lEmotions);
        //System.out.println("Number of  Emotions="+le.getNumberOfEmotions());
        le.eliminateAllProvidedEmotion(EmotionType.Joy);
        assertEquals(le.getNumberOfEmotions(), 0);
    }

    @Test
    public void Test_EliminateZeroElements_eliminateAllProvidedEmotion(){
        System.out.println("Test .... Test_EliminateZeroElements_eliminateAllProvidedEmotion ... ");
        List<Emotion> testLstEmotions = new ArrayList<Emotion>();
        List lEmotions = new ArrayList<Emotion>();
        Emotion eA = new Emotion("Anger", EmotionType.Anger);
        lEmotions.add(eA);
        Emotion eS = new Emotion("Sadness", EmotionType.Sadness);
        lEmotions.add(eS);
        Emotion eD = new Emotion("Digust", EmotionType.Disgust);
        lEmotions.add(eD);
        Emotion eF = new Emotion("Fear", EmotionType.Fear);
        lEmotions.add(eF);

        ListEmotions le = new ListEmotions(lEmotions);
        //System.out.println("Number of  Emotions="+le.getNumberOfEmotions());
        le.eliminateAllProvidedEmotion(EmotionType.Joy);
        assertEquals(le.getNumberOfEmotions(), 4);
    }
    @Test
    public void Test_EliminateFirstLast_eliminateAllProvidedEmotion(){
        System.out.println("Test .... Test_EliminateFirstLast_eliminateAllProvidedEmotion ... ");
        List<Emotion> testLstEmotions = new ArrayList<Emotion>();
        List lEmotions = new ArrayList<Emotion>();
        Emotion eJ = new Emotion("Joy", EmotionType.Joy);
        lEmotions.add(eJ);
        Emotion eA = new Emotion("Anger", EmotionType.Anger);
        lEmotions.add(eA);
        Emotion eS = new Emotion("Sadness", EmotionType.Sadness);
        lEmotions.add(eS);
        Emotion eD = new Emotion("Digust", EmotionType.Disgust);
        lEmotions.add(eD);
        Emotion eF = new Emotion("Fear", EmotionType.Fear);
        lEmotions.add(eF);
        Emotion eJ4 = new Emotion("Joy", EmotionType.Joy);
        lEmotions.add(eJ4);

        ListEmotions le = new ListEmotions(lEmotions);
        //System.out.println("Number of  Emotions="+le.getNumberOfEmotions());
        le.eliminateAllProvidedEmotion(EmotionType.Joy);
        assertEquals(le.getNumberOfEmotions(), 4);
    }
}
