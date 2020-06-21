public class TestModule{

@jdk.internal.vm.annotation.Contended
private long longValue;

public void setLongValue(long v){
	this.longValue = v;
}

public long getLongValue(){
	return this.longValue;
}


/**

	TO COMPILE: javac --add-exports java.base/jdk.internal.vm.annotation=ALL-UNAMED TestModule.java

*/


public static void main(String...args){
	TestModule obj = new TestModule();
	obj.setLongValue(2l);
	System.out.println(obj.getLongValue());
}


}