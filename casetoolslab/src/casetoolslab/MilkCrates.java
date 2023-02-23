package casetoolslab;

public class MilkCrates {
	
	int num_crtes;
	int bottles_per_crates;
	double cost_per_crate;
	double total_cost;
	
	double unit_cost_bottle;
	
	MilkCrates(int num_crates,double unit_cost_bottle)
	{
		this.num_crates =num_crates;
		this.unit_cost_bottle =unit_cost_bottle;
		bottles_per_crates = 25;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MilkCrates mk =new MilkCrates(10,20);

	}

}
