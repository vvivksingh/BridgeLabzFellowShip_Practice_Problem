import java.util.*;

    public class Employee{

        public interface IComputeEmpWage{

            public void addEmployeeWage(String company,int emprate,int wrkingdays, int wrkinghrs);
            public void computeCompanyWage();
            public int gettotalwage(String company);
        }


        public static class CompWage{


            public String company;
            public int emprate;
            public int wrkingdays;
            public int wrkinghrs;
            public int totalwage;

            public CompWage(String company,int emprate,int wrkingdays, int wrkinghrs)
            {
                this.company=company;
                this.emprate=emprate;
                this.wrkingdays=wrkingdays;
                this.wrkinghrs=wrkinghrs;
            }
            public void setTotalWage(int totalwage)
            {
                this.totalwage=totalwage;
            }
            public String toString()
            {
                return "Total emp wage for company: "+company+" is "+totalwage;
            }
        }

        public static class EmpBuilder implements IComputeEmpWage
        {
            static final int IS_FULL_TIME=2;
            static final int IS_PART_TIME=1;
            public ArrayList<CompWage> compempwagelist;
            public HashMap<String,CompWage> compwagemap;
            private int n=0;

            public EmpBuilder()
            {
                compempwagelist= new ArrayList();
                compwagemap=new HashMap();

            }
            public void addEmployeeWage(String company,int emprate,int wrkingdays, int wrkinghrs)
            {
                CompWage c = new CompWage(company,emprate,wrkingdays,wrkinghrs);
                compempwagelist.add(c);
                compwagemap.put(company,c);
            }
            public void computeCompanyWage()
            {
                for(int i=0;i<compempwagelist.size();i++)
                {
                    CompWage c1=compempwagelist.get(i);
                    c1.setTotalWage(this.ComputeWage(c1));
                    System.out.println(c1.totalwage);
                }
            }
            public int ComputeWage(CompWage c)
            {
                int employeehrs=0;
                int totalworkdays=0;
                int totalemphrs=0;
                //int totalwage=0;

                while(totalemphrs<=c.wrkinghrs&&totalworkdays<c.wrkingdays)
                {
                    totalworkdays++;
                    int empcheck=(int) Math.floor(Math.random()*10)%3;

                    switch(empcheck)
                    {
                        case 1:
                            employeehrs=4;
                            break;
                        case 2:
                            employeehrs=8;
                            break;
                        default:
                            employeehrs=0;
                    }



                    totalemphrs+=employeehrs;
                    System.out.println("Emp hrs for day "+totalworkdays+" is: "+employeehrs);
                    System.out.println("Daily wage for employee is: "+ employeehrs*c.emprate);


                }
                return totalemphrs* c.emprate;


            }
            public int gettotalwage(String company)
            {
                return compwagemap.get(company).totalwage;
            }


        }



        public static void main(String[] args) {

            System.out.println("Welcome to EmployeeWage");
            EmpBuilder e= new EmpBuilder();
            e.addEmployeeWage("Master Card",30,7,100);
            e.addEmployeeWage("BridgeLabz",60,9,120);
            e.computeCompanyWage();
            System.out.println("Total wage for company BridgeLabz is "+e.gettotalwage("BridgeLabz"));

        }

    }

