package st.businessmanagement.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import st.businessmanagement.entity.Employee;

public interface EmployeeRepository extends ElasticsearchRepository<Employee, Integer> {
}
