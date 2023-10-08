package sample.cafekiosk.spring;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.StoredProcedureParameter;

@Transactional
@ActiveProfiles("test")
@SpringBootTest
public class IntegrationTestSupport {
}
