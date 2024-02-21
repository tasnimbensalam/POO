package examentptesnimbensalem;

public class AccesInterditException extends Exception {
	private String msg;
	public AccesInterditException(String msg){
	this.setMsg(msg);
}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}


}
