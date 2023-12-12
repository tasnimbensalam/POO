package examentprvv;

public class AjoutInterditException extends Exception {
	private String msg;
	public AjoutInterditException(String msg){
	this.setMsg(msg);
}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
