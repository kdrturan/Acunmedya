public class Developer extends Employee{
    private String about;
    public Developer(int id, String name, int salary, String department,String about)
    {
        super(id, name, salary, department);
        this.about = about;
    }

    @Override
    public double CalculateBonus() {
        return (this.getSalary() * 0.10);
    }
    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }


}
