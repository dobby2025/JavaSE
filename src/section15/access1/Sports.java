package section15.access1;

public class Sports implements Cloneable {
	public String name;
	public boolean isTeam;
	
	public Sports(String name, boolean isTeam) {
		this.name = name;
		this.isTeam = isTeam;
	}
	
	@Override
	public String toString() {
		String strTeam = "개인스포츠";
		if(isTeam) {
			strTeam = "팀스포츠";
		}
		
		return name + "@" + strTeam;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public Object callClone() throws CloneNotSupportedException {
		return clone();
	}
	
}





