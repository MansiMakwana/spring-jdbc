package Com.lti.pojo;

public class Mobile 
{
	private int imeno;
	private String modelName;
	private String manufac;
	public int getImeno() {
		return imeno;
	}
	public void setImeno(int imeno) {
		this.imeno = imeno;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getManufac() {
		return manufac;
	}
	public void setManufac(String manufac) {
		this.manufac = manufac;
	}
	@Override
	public String toString() {
		return "Mobile [imeno=" + imeno + ", modelName=" + modelName + ", manufac=" + manufac + "]";
	}
	public Mobile(int imeno, String modelName, String manufac) {
		super();
		this.imeno = imeno;
		this.modelName = modelName;
		this.manufac = manufac;
	}
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
