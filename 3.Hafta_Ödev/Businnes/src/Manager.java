public class Manager extends Employee{
    private int teamSize;
    public Manager(int id, String name, int salary, String department,int teamSize)
    {
        super(id, name, salary, department);
        this.teamSize = teamSize;
    }

    @Override
    public double CalculateBonus() {
        return (this.getSalary() * 0.20);
    }
    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }


}
