package ficheros_objetos;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MiOjectOutputStream extends ObjectOutputStream {

    public MiOjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }



    @Override
    protected void writeStreamHeader() throws IOException {

    }
}
