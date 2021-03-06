package com.fc.test;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@SpringBootTest
public class MailTest {
    //java邮件发送器
    @Autowired
    private JavaMailSender sender;
    @Test
    public void testSimple(){
        //简单的邮件对象
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        //设置邮件的发送人
        mailMessage.setFrom("1376055937@qq.com");
        //邮件接受人
        mailMessage.setTo("2295280288@qq.com","2365306582@qq.com","453203081@qq.com","2559265773@qq.com");
        //邮件的主题
        mailMessage.setSubject("创业计划书三千六百字");
        //设置邮件的内容
        mailMessage.setText("**一、项目背景**\n" +
                "\n" +
                "　　千姿百态的花儿述说着千言万语，每一句都述说着\"美好\"，特别是现在。随着人们的生活水平不断地进步，生活质量不断地提高和对生活的追求。鲜花已经是人们生活不可缺少的点缀!花卉消费近些年来呈越来越旺的趋势，除了花卉本身所具俏丽姿容，让人们赏心悦目，美化家居等功效外，它还可以开发人们的想象力，使人们在相互交流时更含蓄，更有品位。\n" +
                "\n" +
                "　　这样我们创办网上校园花店以鲜花专递为市场切入点，兼顾网站长期市场占有率和短期资金回报率以抢占市场，以满足个性消费为主题，以鲜花为试点带动其他产品，最终能形成具有\"xx大学青鸟花店\"品牌优势的市场。是十分可行的。\n" +
                "\n" +
                "　　**二、公司项目策化**\n" +
                "\n" +
                "　　1、提供鲜明，公司使命有效，畅通的销售渠道，提供产品服务为根本，促进鲜花市场的大发展。我们的青鸟将成为一个可爱的信使，把祝愿和幸福送到千家万户。为人类创造最佳生活环境\n" +
                "\n" +
                "　　2、公司目标\n" +
                "\n" +
                "　　立足地大，服务武汉，辐射华中。创建网上花店一流的公司。本公司将用一年的时间在武汉的消费者中建立起一定的知名度，并努力实现收支平衡。在投入期仅选择网站总站所在xx大学西校区作为试点市场，该区市场容量在3000人以上，较有代表性，试点时间为一个半月。当模式成功后，以asp的形式在分站推广。经过3到6个月的运营后再扩张到其余的市场\n" +
                "\n" +
                "　　**三、经营环境与客户分析**\n" +
                "\n" +
                "　　1、行业分析\n" +
                "\n" +
                "　　\"xx大学xx花店\"网站是由在校大学生推出的面向650万在校大学生的垂直网站，因此目标消费者定位为在校大学生。该网站除xx大学的总站外，在湖北各高校设有分站，因此，暂定的目标消费群以湖北各高校大学生为重点，将来逐步扩大市场，以xx大学为例，各类在校生近2万人，则投入8校共有近20万的目标消费者，而最新的统计表明，全国在校大学生有650万左右，这样的市场规模是相当庞大的，而且考虑到将来在校生毕业后仍将成为网站的忠诚客户这一现实，目标市场的容量将是相当可观的\n" +
                "\n" +
                "　　2、调查结果分析\n" +
                "\n" +
                "　　本公司对武汉的各高校大学生为重点进行客户分析，主要采取问卷调查(问卷调查表见附录一)和个别访谈的方式。此次我们共发出问卷50份，收回37份。由于时间有限，问卷数量不多，但还是从一定程度上反映了广大消费朋友的消费心理和需求：\n" +
                "\n" +
                "　　⑴有明显的好奇心理，在创新方面有趋同性，听同学或朋友介绍产生购买行为;\n" +
                "\n" +
                "　　⑵购买行为基本上是感性的，但由于受自身经济收入的影响其购买行为又带有理性色彩，一般选择价位较低但浪漫色彩较浓的品种;\n" +
                "\n" +
                "　　⑶在校大学生没有固定的购买模式，购买行为往往随心所欲;\n" +
                "\n" +
                "　　⑷接受和吸收新事物的能力强，追求时尚，崇尚个性;\n" +
                "\n" +
                "　　⑸影响产品购买的因素依次为：价格，品种，包装，服务等;\n" +
                "\n" +
                "　　⑹购买行为节日性很强，一般集中在教师节，情人节，圣诞节及朋友生日前后。\n" +
                "\n" +
                "　　3、目标客户分析\n" +
                "\n" +
                "　　在校大学生购买一般不问价格，但从网上定单来看侧重于中档价位。在定单数量上倾向于能表达心声，如大多数订购1支(你是我的唯一)，3支(我爱你)，19支(爱情路上久久长久)，21支(最爱)等等，在教师节这一天往往以班级人数为单位订购鲜花。包装一般倾向于要求高档化，有向个性化方向发展的趋势，对鲜花的质量要求比较苛刻，如不允许有打蔫现象等。\n" +
                "\n" +
                "　　2、营销策略分析\n" +
                "\n" +
                "　　2.1品牌策略\n" +
                "\n" +
                "　　网站建设初始，我们便非常重视品牌。在品牌包装上，由美工人员根据详细的市场调查和大胆预测，采取动态与静态页面相结合的设计方案，从视觉形象和文字字体都经过精心规划，力求具有独特创新\n" +
                "\n" +
                "　　2.2价格策略\n" +
                "\n" +
                "　　xx网上花店在原料，包装，服务等方面力求尽善尽美，努力给客户最大限度的享受和心理满足。既走价格路线，又走质量路线，满足不同层次消费者的需求。\n" +
                "\n" +
                "　　2.3促销策略\n" +
                "\n" +
                "　　⑴宣传策略\n" +
                "\n" +
                "　　利用学校广播站，报栏，宣传栏免费宣传另外利用网站本身信息流优势宣传和突出形象，并与各大报社，地方电台与电视台建立良好的关系，采取互惠互利双赢的战略模式。\n" +
                "\n" +
                "　　⑵服务方面\n" +
                "\n" +
                "　　网上花店的服务必须是一流的，对于配送队员而言，只要有定单，就必须按照定单要求按时按地送到，并且是微笑服务。\n" +
                "\n" +
                "　　在售后服务方面，由客户服务部负责采取以下几种方式：\n" +
                "\n" +
                "　　①打感谢电话或发e-mail进行友情提醒服务，并在客户重大节日时发电子贺卡。\n" +
                "\n" +
                "　　②无条件接受客户退货，集中受理客户投诉。\n" +
                "\n" +
                "　　③设立消费者调查表，附赠礼品，掌握消费者需求的第一手资料。\n" +
                "\n" +
                "　　④第一次订购的客户将收到随花赠送的花瓶，并享受价格优惠，成为会员后享受会员价格。\n" +
                "\n" +
                "　　⑤不定期的在网上或离线召开会员沙龙，交流信息，沟通感情，并解答客户最感兴趣的问题。\n" +
                "\n" +
                "　　⑥建立客户数据库档案，客户重复订购时只要输入名字，客户的其他信息便自动调入系统。\n" +
                "\n" +
                "　　2.4渠道建设\n" +
                "\n" +
                "　　就目前来看，网上花店主要是与一级批发商建立业务关系。选择批发商时，一般考察其经营业绩，信誉，合作态度，供货是否及时等方面，要求此批发商在同一城市有位于不同区域的几家营销网点，以便于各高校配送成员就地取花。通常与批发商签订合作协议，就价格与产品质量等问题达成一致意见。\n" +
                "\n" +
                "　　3、网上花店策略实施\n" +
                "\n" +
                "　　1.市场范围选择，在投入期仅选择网站总站所在xx大学西校区作为试点市场，该区市场容量在3000人以上，较有代表性，试点时间为一个半月。该模式成功后，以asp的形式在分站推广。先在已经建成的另外7个分站试运营，经过3到6个月的运营后再扩张到其余的市场。\n" +
                "\n" +
                "　　2.重点宣传客户，宣传对象以在校学生为主，他们对流行感兴趣，往往容易领导潮流，而对于逻辑思维较强的工科学生，我们利用先期的受众进行传播达到宣传效果。\n" +
                "\n" +
                "　　3.现场促销选择每年9月8日和9月9日两天为重点宣传日期，在此之前，将宣传单分发至学生宿舍。宣传内容包括。\n" +
                "\n" +
                "　　⑴悬挂统一的彩色横幅，位于校园主干道上，数量为3-5条，以\"xx花店\"网址和\"校园花店隆重推出\"为题搭配悬挂。\n" +
                "\n" +
                "　　⑵在校园人流量较高的位置如宿舍门口和食堂附近搭一宣传台，摆放3-5台微机，可以上网查询并订购;放置一宣传板详细介绍花店内容，并摆放实物鲜花，在宣传当天将配送礼品现场送出。\n" +
                "\n" +
                "　　⑶请学校广播站播发\"xx花店\"宣传部门拟定的宣传材料，在早，中，晚各一次，连续数日。\n" +
                "\n" +
                "　　⑷为营造气氛，安排两名小姐佩带写有\"xx花店\"网址的绶带，进行解说，并组织抽奖活动，中奖者可以现场订购20元以下的鲜花，由网站付款。\n" +
                "\n" +
                "　　⑸在宣传当天，请与学校有关的媒体到现场报道，如武汉晚报，各地方电视台等。\n" +
                "\n" +
                "　　**五，营销效果预测与分析**\n" +
                "\n" +
                "　　1、营业额收入\n" +
                "\n" +
                "　　据调查分析，我们可以预测在主要节假日，每天销售额在1000元以上。\n" +
                "\n" +
                "　　2、支付方式\n" +
                "\n" +
                "　　根据有关材料网上在线支付将会达到20%，我们正积极与招商银行等金融单位联系建立业务合作关系，促进在线支付。\n" +
                "\n" +
                "　　3、订货方式\n" +
                "\n" +
                "　　e-mail定单，直接进入\"xx花店\"网站校园花店订购，电话订购。另外，我们重点推出倍受学生喜欢的短信订购。\n" +
                "\n" +
                "　　4、客户特点\n" +
                "\n" +
                "　　年轻化，100%为青年人，以男性学生为主;他们信誉高，文化素质高，无坏帐现象。\n" +
                "\n" +
                "　　5、消费特点\n" +
                "\n" +
                "　　60元以下的鲜花最受欢迎。\n" +
                "\n" +
                "　　6、信息基础设施\n" +
                "\n" +
                "　　公司网站主要是以虚拟主机的形式存在的，故公司暂时不需要具备信息方面的硬件设施。对于信息软件的开发和网站的建设，公司将通过内部成员中计算机较好的同学和招聘有这方面特长的成员来共同完成。b2c网站虽然在理论上可以实现零库存，但是现实中要达到这一点却很困难。\n" +
                "\n" +
                "　　**六、经营成本预估**\n" +
                "\n" +
                "　　1、原则\n" +
                "\n" +
                "　　把每一分钱用在刀刃上，充分发挥每一分钱的价值。\n" +
                "\n" +
                "　　2、初期投资\n" +
                "\n" +
                "　　这一时期，资金主要用于外购整体网络服务(虚拟主机)，产品采购，系统开发和维护，前期宣传，物流配送等方面上。预计需要人民币2万元左右。从网站建立到网站正常运作起来大约需要一个月的时间。\n" +
                "\n" +
                "　　3、第二期投资\n" +
                "\n" +
                "　　这一阶段我们的服务将辐射各大高校和武汉市区。服务的内容会有很大的扩展，服务的质量也将有进一步的提高。其资金来源主要是公司前期盈利的积累和外来资金的引入，如银行的信贷。\n" +
                "\n" +
                "　　七、系统开发计划\n" +
                "\n" +
                "　　1、系统开发计划\n" +
                "\n" +
                "　　根据公司创建初期资金缺乏的情况和我们开发小组的实际情况，我们决定选择虚拟主机的方式来建立我们公司的网站。当然随着业务的扩大，资金的充裕，我们会考虑建立公司自己的网站。在系统初具雏形后，公司将根据预定的系统功能要求来逐步进行实时测试。系统的完备无疑是一个测试，完善，再测试，再完善的过程，直至系统功能达到公司预期的要求。\n" +
                "\n" +
                "　　2、系统逻辑方案\n" +
                "\n" +
                "　　系统逻辑方案是实现电子商城的经营目标，策略和方式的总体框架。下面结合本公司实际情况做出图解说明六大模块：系统商务活动流程，系统总体逻辑结构，系统数据分布，信息处理模块和安全控制模块。\n" +
                "\n" +
                "　　**八、项目小结**\n" +
                "\n" +
                "　　1、主要工作完成情况调查\n" +
                "\n" +
                "　　了解到广大大学生朋友的真实需求，而且公司从实现目标，运营机制，项目策略等方面都进行了总体规划。另外，在系统开发计划方面，公司也结合我国的实际情况，参阅了大量的关于网站服务方面的文献，也结合了课堂上所学的电子商务的知识，做出了适合公司的网站运作流程和设计流程，以及适合我们公司的系统逻辑方案。最重要的是，针对目前鲜花市场上适合大学生朋友特殊要求的情况，我们自行设计了一系列服务产品，如短信订购鲜花，附带祝福卡片，电话传情等并且制定了合理的价位。与此同时，我们还设立了论坛，不仅满足了广大青年学生等切实需要，也可以满足社会不同年龄层次消费者的需求。\n" +
                "\n" +
                "　　2、不足与困难之处\n" +
                "\n" +
                "　　由于我们企业刚刚开始计划，资金方面存在严重不足，同时由于时间紧迫，整个计划书难免有些欠缺，不过我们会尽量地去充实，完善之。在网站设计，制作方面，由于我们小组成员对与此相关的知识了解得不够多，致使我们在网站设计时有很大的困难，但是经过我们的共同努力和协作，xx花店网站已初具规模，送人玫瑰之手，终久留有余香。我们相信，在以后的努力中，本网站一定会得到进一步的完善。");
//        //超送人
//        mailMessage.setCc("2295280288@qq.com");
//        //秘密抄送
//        mailMessage.setBcc("2295280288@qq.com");

            sender.send(mailMessage);


    }
    @Test
    void testHtmlMail() {
        String content = "<img src='https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fweixin.sanbiaoge.com%2Fcunchu5%2F2021-02-07%2F4_16126366717967458.jpg&refer=http%3A%2F%2Fweixin.sanbiaoge.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1653634723&t=3453e2ae22329ffc6faa90a98f73a147' alt='图片'>" +
                "<font align='center' color='red'>" +
                "我叫肖某龙，因太沙雕，找不到对象..." +
                "</font>";

        // html类型邮件
        MimeMessage mimeMessage = sender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);

        try {
            helper.setFrom("1376055937@qq.com");

            helper.setTo(new String[] {
                    "2365306582@qq.com",
                    "3445248034@qq.com",
            });

            helper.setCc("3445248034@qq.com");

            helper.setBcc("3445248034@qq.com");

            helper.setSubject("找对象");

            helper.setText(content, true);
        } catch (MessagingException e) {
            e.printStackTrace();
        }

        sender.send(mimeMessage);
    }

}
