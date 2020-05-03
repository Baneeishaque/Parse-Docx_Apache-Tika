import org.apache.tika.Tika;
import org.apache.tika.exception.TikaException;

import java.io.IOException;
import java.io.InputStream;

public class TikaUtils {

    public String parseToStringExample() {

        Tika tika = new Tika();
        try (InputStream stream = ParsingExample.class.getResourceAsStream("test.doc")) {
            return tika.parseToString(stream);
        } catch (TikaException e) {
            return;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
