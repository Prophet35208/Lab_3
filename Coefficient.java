public class Coefficient {
	public int hard_coefficient;
	public int soft_coefficient;

	public Coefficient(){
        this.soft_coefficient = 0;
	    this.hard_coefficient = 1;
    }
	public Coefficient(int hard_coefficient){
        this.hard_coefficient = hard_coefficient;
	    this.soft_coefficient = 0;
    }
	public Coefficient(int soft_coefficient, int hard_coefficient){
        this.soft_coefficient = soft_coefficient;
	    this.hard_coefficient = hard_coefficient;
    }

    public void Set_Coefficient(int hard_coefficient, int soft_coefficient){
        this.soft_coefficient = soft_coefficient;
	    this.hard_coefficient = hard_coefficient;
    }
    public int Get_Soft_Coefficient(){
        return this.soft_coefficient;
    }
	public int Get_Hard_Coefficient(){
        return this.hard_coefficient;
    }
}
