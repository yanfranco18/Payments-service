package app.payments;

import app.payments.controlles.PaymentsController;
import app.payments.models.Payment;
import app.payments.service.PaymentsServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Mono;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@WebFluxTest(PaymentsController.class)
class PaymentsServiceApplicationTests {

	@Autowired
	private WebTestClient webTestClient;

	@MockBean
	private PaymentsServiceImpl service;

	@Test
	void savePaymentThirdTest() throws Exception{
		Payment pay = DataPayments.savePaymentThird();

		when(service.savePaymentThird(pay)).thenReturn(Mono.just(pay));

		webTestClient.post().uri("/payments")
				.accept(MediaType.APPLICATION_JSON)
				.body(Mono.just(pay), Payment.class)
				.exchange()
				.expectStatus().isCreated();
	}

}
