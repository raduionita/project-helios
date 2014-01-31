package project.helios.v01a3.framework.main;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface FileIO
{ 
  public InputStream  readAsset(final String filename)  throws IOException;
  
  public InputStream  readFile(final String filename)   throws IOException;
  
  public OutputStream writeFile(final String finlename) throws IOException;
}
