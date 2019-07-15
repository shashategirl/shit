import java.util.Scanner;

/**
 * 
 * 吃屎联盟
 * 
 */
public class Eat_Shit_League {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int num4 = -1;
			boolean isExit = false;
			
			// 数据主体
			// 姓名
			String[] names = new String[4]; // 订屎人姓名
			// 菜名和份数
			String[] shitNames = new String[4]; // 美屎名 份数
			// 地址
			String[] addresses = new String[4]; // 送屎地址
			// 送餐时间
			int[] times = new int[4]; // 送屎时间
			// 订单状态
			int[] states = new int[4]; // 保存屎单状态
			// 点餐的总金额
			double[] money = new double[4];// 总金额
			// 菜品的点赞数
			int likes[] = new int[4];
			double[] prices = { 8, 7, 99, 12 };
			// 菜品名称
			String[] menus = { "清蒸猪屎", "宫爆鸡屎", "凉拌羊粪", "麻辣人屎 " };
			String str = "￥";
			String str2 = "软妹币";
		
			// 欢迎界面
			System.out.println("欢迎使用吃屎联盟订屎马桶");
			System.out.println("************************************");
	
			System.out.println("亲亲！请选择对应序号进行操作 哦！");
			do {
				// 用户进入界面的初始界面
				System.out.println("1、我要订屎" + "\n2、查看屎袋" + "\n3、签收屎单" + "\n4、扔掉屎单" + "\n5、我要点赞 " + "\n6、盖上马桶盖");
				System.out.println("************************************");
				
				// 接收用户选择的序号
				
				System.out.print("请选择：");
				int num = sc.nextInt();
				//1
				// 用switch语句进行匹配
				switch (num) {
				// 选择1，
				case 1:
					// 进入点餐界面
					System.out.println("******亲亲！本马桶有各种各样的屎供您选择哦******");
					// 订餐前，需要判断 订单有没有满4个订单
					boolean isAdd = false;// 监视是否可以订屎
					System.out.println("输入序号选择您喜欢的屎肴哦");
					System.out.println("输入0可以返回哦");
					// 菜品价格
					// 循环
					for (int i = 0; i < names.length; i++) {
						// 判断 订餐人姓名 数列 中，是否还有空位
						if (names[i] == null) {
							// 如果有，把true赋给inAdd
							isAdd = true;
							// 并提示用户输入姓名，以继续订餐
							System.out.print("输入订屎人姓名：");
							String name = sc.next();
							
							// 输入完成后，输出菜品名，价格 和 点赞数
							System.out.println("序号 \t 美屎名 \t\t 单价 \t\t点赞数");
							// 因为前面用于保存菜品名，价格和点赞数的是数列，
							// 所以这里用for循环来遍历数组里的各个元素
							for (int c = 0; c < menus.length; c++) {
								// 三目运算符判断点赞数，如果 likes[i]
								// 这个元素大于0，则把likes[i]这个（元素值赋和赞）这个字符串给like，如果小于0，说明没有点赞数，此时吧0这个字符串赋给like
								String like = (likes[i]) > 0 ? likes[i] + "赞" : "0";
								// 循环遍历输出序号、菜品名、价格、点赞数
								System.out.println((c + 1) + "\t " + menus[c] + "\t\t" + str + prices[c] + str2 + "\t" + like);
							}
							
						
						// 遍历输出完毕，用户已经能看到 所有菜品的信息
						// 此时，提示用户输入他选择则的菜品的编号
						System.out.print("请您选择要点的屎品编号");
						int chocse = sc.nextInt();
						while (chocse < 1 || chocse > 4) { 
							System.out.println("给老子看清楚再输入：");
							chocse = sc.nextInt();
						}
						
						// 和需要的数量
						System.out.print("请选择您需要的份数");
						int chocse2 = sc.nextInt();
						while (chocse2 < 0) { 
							System.out.println("给老子看清楚再输入：");
							chocse2 = sc.nextInt();
						}
						// 定义一个变量，用户选完菜后存储选的菜名和数量
						String menu = menus[chocse - 1] + "  " + chocse2 + " 份";
						// 存储用户输入的菜名和数量
						
						// 定义一个用于接收菜品价格*数量的变量
						double money2 = prices[chocse - 1] * chocse2;
						// 利用三目运算符，判断并计算 用户订的餐的钱是否超过50，如果超过，就不用配送费，如果不超过，就需要另外加5元配送费
						// 配送费
						double money3 = (money2 > 50) ? 0 : 5;
						// 存储总金额
						
						// 相关信息保存完毕后，提示用户输入配送时间
						System.out.print("请输入配送时间(送餐时间是10点至20点间整点送餐)：");
						// 接收用户输入的时间
						int time = sc.nextInt();
						// 循环判断 用户输入的时间是否有误
						while (time < 10 || time > 20) { // 如果用户输入的时间不在范围内，则循环提示用户输入时间
							System.out.println("给老子看清楚再输入：");
							time = sc.nextInt();
						}
						
						// 保存好相关信息，并接收到用户输入的时间后，提示用户输入送餐地址
						System.out.print("请输入送餐地址：");
						// 接收用户输入的送餐地址
						String address = sc.next();
						// 存储用户输入的地址
						// 接收完毕，输出用户的订单信息
						System.out.println("订屎成功！\n" + "您订的屎是		" + menu + "\n" + "送餐时间：" + time + "点" + "\n" + "餐费：" + money2
								+ "软妹币，送餐费：" + money3 + "软妹币");
						System.out.println("总计：" + (money2 + money3) + "软妹币");
						names[i] = name;
						addresses[i] = address;
						times[i] = time;
						money[i] = money2 + money3;
						shitNames[i] = menu;
						break;
						
						}	
					}
					if (!isAdd) {
						System.out.println("抱歉哦 亲！您的屎袋已经装不下了呢！");
					}
					break;
					
				case 2:
					System.out.println("******亲亲！这是您的屎袋，请您认真核对哦******");
					System.out.println("序号 \t 订屎人 \t 美屎信息 \t \t 送屎时间\t 送屎地址 \t\t 总金额 \t 订屎状态");
					for (int i = 0; i < names.length; i++) {
						if (names[i] != null) {
							String state = (states[i] == 0) ? "已经预订" : "已经完成订单";
							String time = times[i] + "点";
							String money1 = money[i] + "软妹币";
							System.out.println((i + 1) + " \t " + names[i] + " \t\t " + shitNames[i] + " \t \t\t " + time+ "\t\t " + addresses[i] + " \t \t\t " + money1+ " \t\t " + state);
						}
					}
					break;
					
				case 3:
					System.out.println("******亲亲！如果收到屎了就可以签收了哟******");
					//寻找要签收的订单
					boolean shitOrder = false;
					System.out.print("请选择要签收的屎单号：");
					//接收用户输入的订单号
					int shit = sc.nextInt();
					while(shit <0 || shit>4) {
						System.out.println("请给老子看清楚了再输入");
						shit = sc.nextInt();
					}
					//循环遍历
					for(int i = 0;i<names.length;i++) {
						if(names[i] != null && states[i] ==0 && shit == i+1 ) {//在用户型名不为空且订单状态为0也就是已经预定的情况下，如果用户输入的数字等于循环遍历的次数+1，就是通过循环遍历能找到用户的订单号，
							//就把1 赋给states[i] ，从而实现 改变订单状态的功能
							states[i] = 1;
							System.out.println("屎单签收成功");
							//并把true赋给shitOrder  说明存在用户输入的订单
							shitOrder = true;
						}else if(names[i] != null && states[i] ==1 && shit == i+1) {//在用户型名不为空且订单状态为1也就是已签收的情况下
							System.out.println("您的屎单已经签收过了，不能再重复签收了哟");
							//并把true赋给shitOrder  说明存在用户输入的订单
							shitOrder = true;
						}
					}
					if(!shitOrder) {
						System.out.println("您要求签收的屎单不存在哟");
					}
					break;
					
				case 4:
					//因为此系统点完四次餐后，就满了 无法再点单，这时候就需要用户先删除订单
					System.out.println("******亲亲！以下是您的屎单******");
					//标记手否找到要删除 的屎单
					boolean shitOrder2 = false;
					//提示用输入 要删除的屎单编号
					System.out.print("请输入您要删除的屎单的编号哟：");
					//接收用户输入的屎单编号
					int shit2 = sc.nextInt();
					for(int i = 0;i<names.length;i++) {
						if(names[i] != null && states[i] ==1 && shit2 == i+1) {
							shitOrder2 = true;//标志找到了这个订单
							//循环把最后一个元素的值赋给前一位，这样就空出了最后一位，
							for(int c =shit2 ;c<names.length-1;c++) {  //需要删除的内容有：姓名、菜名+份数、时间、地址、订单状态、餐费,先把他们前移
								names[c] = names[c+1];
								shitNames[c] = shitNames[c+1];
								times[i] = times[i+1];
								addresses[i] = addresses[i+1];
								states[i] = states[i+1];
								money[i] = money[i+1];
							}
							//然后清空
							//确定最后一个元素的下标
							int endIndex = names.length-1;
							names[endIndex] = null;
							shitNames[endIndex] = null;
							times[endIndex] = 0;
							addresses[endIndex] = null;
							states[endIndex] = 0;
							money[endIndex] = 0;
							System.out.println("删除屎单成功");
							break;
						}else if(names[i] != null && states[i] ==0 && shit2 == i+1) {
							System.out.println("对不起亲亲！您选择的屎单还未签收哦，不能删除哟");
							shitOrder2 = true;//标志找到了这个订单
							break;
						}
					}
					if(!shitOrder2) {
						System.out.println("您要删除的屎单不存在哟");
					}
					break;
					
				case 5:
					System.out.println("******亲亲！这里可以给你喜爱的美屎点赞哟******");
					//输出点赞列表
					System.out.println("序号 \t 美屎名 \t\t 单价 \t\t点赞数");
					for (int i = 0; i < menus.length; i++) {
						String price = "￥"+ prices[i] + "软妹币";
						System.out.println((i + 1) + "\t " + menus[i] + "\t\t" + price  + "\t" + likes[i] + "赞");
					}
					//提示用户输入要点赞的编号
					System.out.print("请选择您要点赞的屎品序号");
					int like2 = sc.nextInt();
					while(like2 <0 || like2>4) {
						System.out.println("请给老子看清楚了再输入");
						like2 = sc.nextInt();
						}
					likes[like2-1]++;//如果用户输入1，那就说明用户想要给1号菜点赞，所以likes这个数列对应存储的点赞数的位置是下标为0 的位置
					System.out.println("点赞成功！");
					break;
					
				case 6:
					isExit = true;
					break;
				default:
					isExit = true;
					break;
				}
				
				if(!isExit) {
					System.out.print("输入0返回：");
					num4 = sc.nextInt();
					while(num4 != 0) {
						System.out.println("请给老子看清楚了再输入");
						System.out.print("输入0返回：");
						num4 = sc.nextInt();
					}
				}else {
					break;
				}
			
		}while(num4 ==0);
		
	}

}

	
	
	
	
	
	