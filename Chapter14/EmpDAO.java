import java.util.List;

interface EmpDAO {
    EmpPOJO read();
    void write(EmpPOJO emp);
    List<EmpPOJO> getAllEmp();
}