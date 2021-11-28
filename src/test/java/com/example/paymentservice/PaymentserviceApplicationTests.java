package com.example.paymentservice;

import com.example.paymentservice.constants.OrderType;
import com.example.paymentservice.model.*;
import com.example.paymentservice.service.ProcessPaymentService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
class PaymentserviceApplicationTests {

	@Autowired
	private ProcessPaymentService processPaymentService;

	@Test
    public  void  ProcessPaymentBookTest() throws Exception{

		PaymentRequest paymentRequest = new PaymentRequest();
		paymentRequest.setOrderId("1");
		paymentRequest.setOrderType(OrderType.Book);

		List<Item> itemList = new ArrayList();
		Item item = new Item();
		item.setItemNumber("1234");
		item.setItemDescription("TestJUNIT");
		itemList.add(item);
		paymentRequest.setOrderDetails(itemList);

		Customer customer = new Customer();
		customer.setAddress("123 Main Street");
		customer.setEmail("testuser@email.com");
        paymentRequest.setCustomerDetails(customer);

		PaymentDetails paymentDetails = new PaymentDetails();
		paymentDetails.setPaymentMode("card");
		paymentDetails.setCardDetails(14678);
		paymentRequest.setPaymentDetails(paymentDetails);

		String result = processPaymentService.execute(paymentRequest);
		String expected = "PaymentFactory processed successfully for order type Book";
		assertEquals(expected, result);

	}

	@Test
	public  void  ProcessPaymentPhysicalTest() throws Exception{

		PaymentRequest paymentRequest = new PaymentRequest();
		paymentRequest.setOrderId("2");
		paymentRequest.setOrderType(OrderType.Physical);

		List<Item> itemList = new ArrayList();
		Item item = new Item();
		item.setItemNumber("1234");
		item.setItemDescription("Test In store purchase");
		itemList.add(item);
		paymentRequest.setOrderDetails(itemList);

		Customer customer = new Customer();
		customer.setAddress("234 Main Street");
		customer.setEmail("testuser@email.com");
		paymentRequest.setCustomerDetails(customer);

		PaymentDetails paymentDetails = new PaymentDetails();
		paymentDetails.setPaymentMode("card");
		paymentDetails.setCardDetails(14678);
		paymentRequest.setPaymentDetails(paymentDetails);

		String result = processPaymentService.execute(paymentRequest);
		String expected = "PaymentFactory processed successfully for order type Physical";
		assertEquals(expected, result);

	}

	@Test
	public  void  ProcessPaymentMembershipTest() throws Exception{

		PaymentRequest paymentRequest = new PaymentRequest();
		paymentRequest.setOrderId("3");
		paymentRequest.setOrderType(OrderType.Upgrade);

		List<Item> itemList = new ArrayList();
		Item item = new Item();
		item.setItemNumber("1234");
		item.setItemDescription("Test membership purchase");
		itemList.add(item);
		paymentRequest.setOrderDetails(itemList);

		Customer customer = new Customer();
		customer.setAddress("234 Main Street");
		customer.setEmail("testuser@email.com");
		paymentRequest.setCustomerDetails(customer);

		PaymentDetails paymentDetails = new PaymentDetails();
		paymentDetails.setPaymentMode("card");
		paymentDetails.setCardDetails(14678);
		paymentRequest.setPaymentDetails(paymentDetails);

		String result = processPaymentService.execute(paymentRequest);
		String expected = "PaymentFactory processed successfully :Upgrade Membership";
		assertEquals(expected, result);

	}

	@Test
	public  void  ProcessPaymentLearningTest() throws Exception{

		PaymentRequest paymentRequest = new PaymentRequest();
		paymentRequest.setOrderId("5");
		paymentRequest.setOrderType(OrderType.Learning);

		List<Item> itemList = new ArrayList();
		Item item = new Item();
		item.setItemNumber("1234");
		item.setItemDescription("Test Learning material purchase");
		itemList.add(item);
		paymentRequest.setOrderDetails(itemList);

		Customer customer = new Customer();
		customer.setAddress("234 Main Street");
		customer.setEmail("testuser@email.com");
		paymentRequest.setCustomerDetails(customer);

		PaymentDetails paymentDetails = new PaymentDetails();
		paymentDetails.setPaymentMode("card");
		paymentDetails.setCardDetails(14678);
		paymentRequest.setPaymentDetails(paymentDetails);

		String result = processPaymentService.execute(paymentRequest);
		String expected = "PaymentFactory processed successfully for order type Learning material";
		assertEquals(expected, result);

	}

}





