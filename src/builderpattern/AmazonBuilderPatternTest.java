package builderpattern;

public class AmazonBuilderPatternTest {

	public static void main (String [] args)
	{
		AmazonBuilderPattern bp = new AmazonBuilderPattern();
		bp.login()
			.searchProducts("Mac Book Pro", 87000)
				.selectProd("MAc Book pro")
					.payment(87000, null)
						.getOrderid(545)
							.logout()
								.login()
									.getOrderid(545)
										.logout();
		
		AmazonBuilderPattern sc1 = new AmazonBuilderPattern();
		sc1.login()
			.selectProd("Kindle book")
				.payment("sekar@okaxis", "12500")
					.getOrderid(5445)
						.logout();
						
		
	}
}
