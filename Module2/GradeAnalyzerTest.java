import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.*; 
import java.util.ArrayList; 
import java.util.Arrays; 
 
public class GradeAnalyzerTest { 
 
    @Test
    void calculateAverage_returnsZero_whenListIsEmpty() { 
        ArrayList<Integer> scores = new ArrayList<>(); 
        assertEquals(0.0, GradeAnalyzer.calculateAverage(scores)); 
    } 
 
    @Test
    void calculateAverage_returnsCorrectAverage_forTypicalScores() { 
        ArrayList<Integer> scores = new ArrayList<>(Arrays.asList(80, 90, 100)); 
        assertEquals(90.0, GradeAnalyzer.calculateAverage(scores));
    }
 
    @Test
    void calculateAverage_returnsSingleValue_whenListHasOneItem() { 
        ArrayList<Integer> scores = new ArrayList<>(Arrays.asList(75)); 
        assertEquals(75.0, GradeAnalyzer.calculateAverage(scores));
    } 
 
    @Test
    void calculateAverage_returnsDouble_notInteger() { 
        // 1 + 2 = 3, divided by 2 = 1.5, not 1
        ArrayList<Integer> scores = new ArrayList<>(Arrays.asList(1, 2)); 
        assertEquals(1.5, GradeAnalyzer.calculateAverage(scores)); 
    } 
 
    @Test
    void calculateAverage_handlesAllSameValues() {
        ArrayList<Integer> scores = new ArrayList<>(Arrays.asList(88, 88, 88));
        assertEquals(88.0, GradeAnalyzer.calculateAverage(scores));
    }

    @Test
    void calculateAverage_returnsExactAverage_forTenScores() {
        ArrayList<Integer> scores = new ArrayList<>(Arrays.asList(70, 75, 80, 85, 90, 95, 100, 65, 88, 92));
        // sum = 840, count = 10
        assertEquals(84.0, GradeAnalyzer.calculateAverage(scores));
    }

    @Test
    void calculateAverage_doesNotModifyInputList() {
        ArrayList<Integer> scores = new ArrayList<>(Arrays.asList(60, 70, 80));
        GradeAnalyzer.calculateAverage(scores);
        assertEquals(3, scores.size());
        assertEquals(60, scores.get(0));
        assertEquals(70, scores.get(1));
        assertEquals(80, scores.get(2));
    }
}