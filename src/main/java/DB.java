import org.sql2o.Sql2o;

public class DB {

//    String connectionString = "jdbc:postgresql://localhost:5432/organization_api"; //!
//    Sql2o sql2o = new Sql2o(connectionString, "simon", "simonalex"); //!
   
   String connectionString = "jdbc:postgresql://\n" +
           "ec2-34-240-75-196.eu-west-1.compute.amazonaws.com/\n" +
           "d17jl56esc99c3"; //!
   Sql2o sql2o = new Sql2o(connectionString, "\n" +
           "fpbqzndntbkonx", "8ce73b18fc819ee6eb1dff35c953c13742cfc290d301665f8249f6fb9a8c998f"); //!
}
