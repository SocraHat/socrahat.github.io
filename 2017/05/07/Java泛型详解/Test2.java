 public class Test2{
     static class A{
         private Object obj;
		
		public A(){	}
		
		public A(Object obj){
			this.obj = obj;
		}
		
		public void setObject(Object obj){
			this.obj = obj;
		}
		
		public Object getObject(){
			return obj;
		}
     } 

    public static void main(String[] args){
		A a = new A();
		a.setObject("socra");
		String str = (String)a.getObject();
	}
 }