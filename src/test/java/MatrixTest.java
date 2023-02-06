import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MatrixTest {

    @ParameterizedTest
    @CsvSource({"5,5", "10,20", "9384,12384"})
    void getWidth_OK(int width, int height) {
        Matrix m = new Matrix(width, height);
        Assertions.assertEquals(width, m.getWidth());
    }

    @ParameterizedTest
    @CsvSource({"-1,5", "10,-20", "-9384,-12384"})
    void getWidth_NEGATIVE(int width, int height) {
        Assertions.assertThrows(NegativeArraySizeException.class, () -> {
            new Matrix(width, height);

        });
    }

    @ParameterizedTest
    @CsvSource({"5,5", "10,20", "9384,12384"})
    void getHeight_OK(int width, int height) {
        Matrix m = new Matrix(width, height);
        Assertions.assertEquals(height, m.getHeight());
    }

    @CsvSource({"5,5", "10,20", "9384,12384"})
    @ParameterizedTest
    void fill(int width, int height) {
        Matrix m = new Matrix(width,height);
        m.Fill(width,height);
        Assertions.assertNotNull(m);
    }

    @ParameterizedTest
    @CsvSource({"5,5", "10,20", "9384,12384"})
    void count() {

    }

    @ParameterizedTest
    @CsvSource({"5,5", "10,20", "9384,12384"})
    void found() {
    }

    @ParameterizedTest
    @CsvSource({"5,5", "10,20", "100,232"})
    void _toString(int width, int height) {
        Matrix m = new Matrix(width,height);
        m.Fill(width,height);
        Assertions.assertNotNull(m.ToString());
    }
}