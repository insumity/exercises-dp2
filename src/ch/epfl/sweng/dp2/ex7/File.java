package ch.epfl.sweng.dp2.ex7;

public interface File {

    public String read(String fileName);
    public void write(String fileName, String data);
}
