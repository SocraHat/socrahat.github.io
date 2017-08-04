public class Test{
	
	static class A<E>{
		private E e;
		
		public A(){	}
		
		public A(E e){
			this.e = e;
		}
		
		public void setE(E e){
			this.e = e;
		}
		
		public E getE(){
			return e;
		}
	}	

	public static void main(String[] args){
		A<String> a = new A<String>();
		a.setE("socra");
		String str = a.getE();
	}
}