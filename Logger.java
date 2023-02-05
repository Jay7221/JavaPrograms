public class Logger{
	private String format;
	public String getFormat(){
		return this.format;
	}
	public void setFormat(String format){
		this.format = format;
	}
	public static void main(String args[])
	{
		Logger l = new Logger();
		l.setFormat("This is the format");
		System.out.println(l.getFormat());
	}
}
