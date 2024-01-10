public class Resource
{
  private String fileName;
  private String extension;
  public Resource(String fileName, String extension){
    this.fileName = fileName;
    this.extension = extension;
  }
  public boolean isPDF(){
    if(extension.equals("PDF")){
      return true;
    }
    return false;
  }
  public boolean equals(Object obj){
    if(obj == null || getClass() != obj.getClass()){
      return false;
    }
    Resource other = (Resource) obj;
    return fileName.equals(other.fileName) && extension.equals(other.extension);
  }
  public String toString(){
    return fileName + "." + extension;
  }
}
