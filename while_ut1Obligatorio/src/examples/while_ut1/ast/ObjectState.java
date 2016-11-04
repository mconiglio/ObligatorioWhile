package examples.while_ut1.ast;

public class ObjectState {

	public String tipo = "";
	public boolean assigned = false;
	public boolean used = false;
	public int queEs = 0; // 1=function o 2=variable
	public Object astNode = null;
	
	public ObjectState(String tipo, boolean assigned, int queEs, Object astNode){
		this.tipo = tipo;
		this.assigned = assigned;
		this.queEs = queEs;
		this.astNode = astNode;
	}
	
	@Override
	public ObjectState clone(){
		ObjectState objectState=new ObjectState();
		objectState.assigned=new Boolean(this.assigned);
		objectState.tipo=new String(this.tipo);
		return objectState;
	}
}




