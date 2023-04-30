/*@Sql({""})
public class SpringBootInitialLoadIntegrationTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void testLoadDataForTestClass() {
        assertEquals(3, employeeRepository.findAll().size());
    }
}*/