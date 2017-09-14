package shallowCopy;

public class ShallowCopy {
	private String i;
	private String j;
	
	public String toString(){
		return "value of i and j is(" +i+ "," +j+ ")";
	
	      }
public static void main(String[] args){
// TODO Auto-generated method stub
			ShallowCopy color=new ShallowCopy();
			ShallowCopy color2=color;
			color.i="red";
			color.j="green";
			color2.i="blue";
			System.out.println(color);
			System.out.println(color2);
		}
      }

