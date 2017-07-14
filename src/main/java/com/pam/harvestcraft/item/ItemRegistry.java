package com.pam.harvestcraft.item;

import static com.pam.harvestcraft.HarvestCraft.config;

import java.util.HashMap;
import java.util.HashSet;

import com.pam.harvestcraft.HarvestCraft;
import com.pam.harvestcraft.blocks.BlockRegistry;
import com.pam.harvestcraft.blocks.blocks.BlockPamCake;
import com.pam.harvestcraft.item.items.ItemPamBee;
import com.pam.harvestcraft.item.items.ItemPamCakeFood;
import com.pam.harvestcraft.item.items.ItemPamFood;
import com.pam.harvestcraft.item.items.ItemPamPotionFood;
import com.pam.harvestcraft.item.items.ItemPamTool;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ItemRegistry {
	public static final HashMap<String, Item> items = new HashMap<String, Item>();

	public static final HashSet<Item> allFishRaw = new HashSet<Item>();
	public static final HashSet<Item> allFood = new HashSet<Item>();
	public static final HashSet<Item> allJuice = new HashSet<Item>();

	// Items
	public static Item cuttingboardItem;
	public static Item potItem;
	public static Item skilletItem;
	public static Item saucepanItem;
	public static Item bakewareItem;
	public static Item mortarandpestleItem;
	public static Item mixingbowlItem;
	public static Item juicerItem;
	public static Item honeyItem;
	public static Item saltItem;
	public static Item wovencottonItem;
	public static Item freshwaterItem;
	public static Item freshmilkItem;
	public static Item calamarirawItem;
	public static Item calamaricookedItem;

	public static Item grilledasparagusItem;
	public static Item bakedsweetpotatoItem;
	public static Item teaItem;
	public static Item coffeeItem;
	public static Item popcornItem;
	public static Item grilledeggplantItem;
	public static Item raisinsItem;
	public static Item ricecakeItem;
	public static Item toastedcoconutItem;
	public static Item vanillaItem;
	public static Item toastedsesameseedsItem;
	public static Item flourItem;
	public static Item doughItem;
	public static Item toastItem;
	public static Item pastaItem;
	public static Item heavycreamItem;
	public static Item butterItem;
	public static Item cheeseItem;
	public static Item icecreamItem;
	public static Item grilledcheeseItem;
	public static Item applesauceItem;
	public static Item applepieItem;
	public static Item caramelappleItem;
	public static Item pumpkinbreadItem;
	public static Item roastedpumpkinseedsItem;
	public static Item pumpkinsoupItem;
	public static Item melonsmoothieItem;

	public static Item carrotsoupItem;
	public static Item glazedcarrotsItem;
	public static Item butteredpotatoItem;
	public static Item loadedbakedpotatoItem;
	public static Item mashedpotatoesItem;
	public static Item potatosaladItem;
	public static Item potatosoupItem;
	public static Item friesItem;
	public static Item grilledmushroomItem;
	public static Item stuffedmushroomItem;
	public static Item chickensandwichItem;
	public static Item chickennoodlesoupItem;
	public static Item chickenpotpieItem;
	public static Item breadedporkchopItem;
	public static Item hotdogItem;
	public static Item bakedhamItem;
	public static Item hamburgerItem;
	public static Item cheeseburgerItem;
	public static Item baconcheeseburgerItem;
	public static Item potroastItem;
	public static Item fishsandwichItem;
	public static Item fishsticksItem;
	public static Item fishandchipsItem;
	public static Item mayoItem;
	public static Item friedeggItem;
	public static Item scrambledeggItem;
	public static Item boiledeggItem;
	public static Item eggsaladItem;
	public static Item caramelItem;
	public static Item taffyItem;
	public static Item spidereyesoupItem;
	public static Item zombiejerkyItem;
	public static Item cocoapowderItem;
	public static Item chocolatebarItem;
	public static Item hotchocolateItem;
	public static Item chocolateicecreamItem;
	public static Item vegetablesoupItem;
	public static Item stockItem;
	public static Item fruitsaladItem;
	public static Item spagettiItem;
	public static Item spagettiandmeatballsItem;
	public static Item tomatosoupItem;
	public static Item ketchupItem;
	public static Item chickenparmasanItem;
	public static Item pizzaItem;
	public static Item springsaladItem;
	public static Item porklettucewrapItem;
	public static Item fishlettucewrapItem;
	public static Item bltItem;
	public static Item leafychickensandwichItem;
	public static Item leafyfishsandwichItem;
	public static Item deluxecheeseburgerItem;
	public static Item delightedmealItem;
	public static Item onionsoupItem;
	public static Item potatocakesItem;
	public static Item hashItem;
	public static Item braisedonionsItem;
	public static Item heartybreakfastItem;
	public static Item cornonthecobItem;
	public static Item cornmealItem;
	public static Item cornbreadItem;
	public static Item tortillaItem;
	public static Item nachoesItem;
	public static Item tacoItem;
	public static Item fishtacoItem;
	public static Item creamedcornItem;
	public static Item strawberrysmoothieItem;
	public static Item strawberrypieItem;
	public static Item strawberrysaladItem;
	public static Item chocolatestrawberryItem;
	public static Item peanutbutterItem;
	public static Item trailmixItem;
	public static Item pbandjItem;
	public static Item peanutbuttercookiesItem;
	public static Item vinegarItem;
	public static Item grapejellyItem;
	public static Item grapesaladItem;
	public static Item raisincookiesItem;
	public static Item picklesItem;
	public static Item cucumbersaladItem;
	public static Item cucumbersoupItem;
	public static Item vegetarianlettucewrapItem;
	public static Item marinatedcucumbersItem;
	public static Item ricesoupItem;
	public static Item friedriceItem;
	public static Item mushroomrisottoItem;
	public static Item curryItem;
	public static Item rainbowcurryItem;
	public static Item refriedbeansItem;
	public static Item bakedbeansItem;
	public static Item beansandriceItem;
	public static Item chiliItem;
	public static Item beanburritoItem;
	public static Item stuffedpepperItem;
	public static Item veggiestirfryItem;
	public static Item grilledskewersItem;
	public static Item supremepizzaItem;
	public static Item omeletItem;
	public static Item hotwingsItem;
	public static Item chilipoppersItem;
	public static Item extremechiliItem;
	public static Item chilichocolateItem;
	public static Item lemonaideItem;
	public static Item lemonbarItem;
	public static Item fishdinnerItem;
	public static Item lemonsmoothieItem;
	public static Item lemonmeringueItem;
	public static Item candiedlemonItem;
	public static Item lemonchickenItem;
	public static Item blueberrysmoothieItem;
	public static Item blueberrypieItem;
	public static Item blueberrymuffinItem;
	public static Item pancakesItem;
	public static Item blueberrypancakesItem;
	public static Item cherrypieItem;
	public static Item chocolatecherryItem;
	public static Item cherrysmoothieItem;

	public static Item stuffedeggplantItem;
	public static Item eggplantparmItem;
	public static Item raspberryicedteaItem;
	public static Item chaiteaItem;
	public static Item espressoItem;
	public static Item coffeeconlecheItem;
	public static Item mochaicecreamItem;
	public static Item pickledbeetsItem;
	public static Item beetsaladItem;
	public static Item beetsoupItem;
	public static Item bakedbeetsItem;
	public static Item broccolimacItem;
	public static Item broccolindipItem;
	public static Item creamedbroccolisoupItem;
	public static Item sweetpotatopieItem;
	public static Item candiedsweetpotatoesItem;
	public static Item mashedsweetpotatoesItem;
	public static Item steamedpeasItem;
	public static Item splitpeasoupItem;

	public static Item pineapplehamItem;
	public static Item pineappleyogurtItem;
	public static Item turnipsoupItem;
	public static Item roastedrootveggiemedleyItem;
	public static Item bakedturnipsItem;
	public static Item gingerbreadItem;
	public static Item gingersnapsItem;
	public static Item candiedgingerItem;
	public static Item mustardItem;
	public static Item softpretzelandmustardItem;
	public static Item spicymustardporkItem;
	public static Item spicygreensItem;
	public static Item garlicbreadItem;
	public static Item garlicmashedpotatoesItem;
	public static Item garlicchickenItem;
	public static Item summerradishsaladItem;
	public static Item summersquashwithradishItem;
	public static Item celeryandpeanutbutterItem;
	public static Item chickencelerycasseroleItem;
	public static Item peasandceleryItem;
	public static Item celerysoupItem;
	public static Item zucchinibreadItem;
	public static Item zucchinifriesItem;
	public static Item zestyzucchiniItem;
	public static Item zucchinibakeItem;
	public static Item asparagusquicheItem;
	public static Item asparagussoupItem;
	public static Item walnutraisinbreadItem;
	public static Item candiedwalnutsItem;
	public static Item brownieItem;
	public static Item papayasmoothieItem;
	public static Item papayayogurtItem;
	public static Item starfruitsmoothieItem;
	public static Item starfruityogurtItem;
	public static Item guacamoleItem;
	public static Item creamofavocadosoupItem;
	public static Item avocadoburritoItem;
	public static Item poachedpearItem;
	public static Item fruitcrumbleItem;
	public static Item pearyogurtItem;
	public static Item plumyogurtItem;
	public static Item bananasplitItem;
	public static Item banananutbreadItem;
	public static Item bananasmoothieItem;
	public static Item bananayogurtItem;
	public static Item coconutmilkItem;
	public static Item chickencurryItem;
	public static Item coconutshrimpItem;
	public static Item coconutyogurtItem;
	public static Item orangechickenItem;
	public static Item orangesmoothieItem;
	public static Item orangeyogurtItem;
	public static Item peachcobblerItem;
	public static Item peachsmoothieItem;
	public static Item peachyogurtItem;
	public static Item keylimepieItem;
	public static Item limesmoothieItem;
	public static Item limeyogurtItem;
	public static Item mangosmoothieItem;
	public static Item mangoyogurtItem;
	public static Item pomegranatesmoothieItem;
	public static Item pomegranateyogurtItem;
	public static Item vanillayogurtItem;
	public static Item cinnamonrollItem;
	public static Item frenchtoastItem;
	public static Item marshmellowsItem;
	public static Item donutItem;
	public static Item chocolatedonutItem;
	public static Item powdereddonutItem;
	public static Item jellydonutItem;
	public static Item frosteddonutItem;
	public static Item cactussoupItem;
	public static Item wafflesItem;
	public static Item seedsoupItem;
	public static Item softpretzelItem;
	public static Item jellybeansItem;
	public static Item biscuitItem;
	public static Item creamcookieItem;
	public static Item jaffaItem;
	public static Item friedchickenItem;

	public static Item footlongItem;
	public static Item blueberryyogurtItem;
	public static Item lemonyogurtItem;
	public static Item cherryyogurtItem;
	public static Item strawberryyogurtItem;
	public static Item grapeyogurtItem;
	public static Item chocolateyogurtItem;
	public static Item blackberrycobblerItem;
	public static Item blackberrysmoothieItem;
	public static Item blackberryyogurtItem;
	public static Item chocolatemilkItem;
	public static Item pumpkinyogurtItem;
	public static Item raspberrypieItem;
	public static Item raspberrysmoothieItem;
	public static Item raspberryyogurtItem;
	public static Item cinnamonsugardonutItem;
	public static Item melonyogurtItem;
	public static Item kiwismoothieItem;
	public static Item kiwiyogurtItem;
	public static Item plainyogurtItem;
	public static Item appleyogurtItem;
	public static Item saltedsunflowerseedsItem;
	public static Item sunflowerwheatrollsItem;
	public static Item sunflowerbroccolisaladItem;
	public static Item cranberrysauceItem;
	public static Item cranberrybarItem;
	public static Item peppermintItem;
	public static Item blackpepperItem;
	public static Item groundcinnamonItem;
	public static Item groundnutmegItem;
	public static Item oliveoilItem;
	public static Item baklavaItem;
	public static Item gummybearsItem;
	public static Item baconmushroomburgerItem;
	public static Item fruitpunchItem;
	public static Item meatystewItem;
	public static Item mixedsaladItem;
	public static Item pinacoladaItem;
	public static Item saladdressingItem;
	public static Item shepardspieItem;
	public static Item eggnogItem;
	public static Item custardItem;
	public static Item sushiItem;
	public static Item gardensoupItem;
	public static Item applejellyItem;
	public static Item applejellysandwichItem;
	public static Item blackberryjellyItem;
	public static Item blackberryjellysandwichItem;
	public static Item blueberryjellyItem;
	public static Item blueberryjellysandwichItem;
	public static Item cherryjellyItem;
	public static Item cherryjellysandwichItem;
	public static Item cranberryjellyItem;
	public static Item cranberryjellysandwichItem;
	public static Item kiwijellyItem;
	public static Item kiwijellysandwichItem;
	public static Item lemonjellyItem;
	public static Item lemonjellysandwichItem;
	public static Item limejellyItem;
	public static Item limejellysandwichItem;
	public static Item mangojellyItem;
	public static Item mangojellysandwichItem;
	public static Item orangejellyItem;
	public static Item orangejellysandwichItem;
	public static Item papayajellyItem;
	public static Item papayajellysandwichItem;
	public static Item peachjellyItem;
	public static Item peachjellysandwichItem;
	public static Item pomegranatejellyItem;
	public static Item pomegranatejellysandwichItem;
	public static Item raspberryjellyItem;
	public static Item raspberryjellysandwichItem;
	public static Item starfruitjellyItem;
	public static Item starfruitjellysandwichItem;
	public static Item strawberryjellyItem;
	public static Item strawberryjellysandwichItem;
	public static Item watermelonjellyItem;
	public static Item watermelonjellysandwichItem;
	public static Item bubblywaterItem;
	public static Item cherrysodaItem;
	public static Item colasodaItem;
	public static Item gingersodaItem;
	public static Item grapesodaItem;
	public static Item lemonlimesodaItem;
	public static Item orangesodaItem;
	public static Item rootbeersodaItem;
	public static Item strawberrysodaItem;
	public static Item caramelicecreamItem;
	public static Item mintchocolatechipicemcreamItem;
	public static Item strawberryicecreamItem;
	public static Item vanillaicecreamItem;
	public static Item gingerchickenItem;
	public static Item oldworldveggiesoupItem;
	public static Item spicebunItem;
	public static Item gingeredrhubarbtartItem;
	public static Item lambbarleysoupItem;
	public static Item honeylemonlambItem;
	public static Item pumpkinoatsconesItem;
	public static Item beefjerkyItem;
	public static Item ovenroastedcauliflowerItem;
	public static Item leekbaconsoupItem;
	public static Item herbbutterparsnipsItem;
	public static Item scallionbakedpotatoItem;
	public static Item soymilkItem;
	public static Item firmtofuItem;
	public static Item silkentofuItem;
	public static Item bamboosteamedriceItem;
	public static Item roastedchestnutItem;
	public static Item sweetpotatosouffleItem;
	public static Item cashewchickenItem;
	public static Item apricotyogurtItem;
	public static Item apricotglazedporkItem;
	public static Item apricotjellyItem;
	public static Item apricotjellysandwichItem;
	public static Item apricotsmoothieItem;
	public static Item figbarItem;
	public static Item figjellyItem;
	public static Item figjellysandwichItem;
	public static Item figsmoothieItem;
	public static Item figyogurtItem;
	public static Item grapefruitjellyItem;
	public static Item grapefruitjellysandwichItem;
	public static Item grapefruitsmoothieItem;
	public static Item grapefruityogurtItem;
	public static Item grapefruitsodaItem;
	public static Item citrussaladItem;
	public static Item pecanpieItem;
	public static Item pralinesItem;
	public static Item persimmonyogurtItem;
	public static Item persimmonsmoothieItem;
	public static Item persimmonjellyItem;
	public static Item persimmonjellysandwichItem;
	public static Item pistachiobakedsalmonItem;
	public static Item baconwrappeddatesItem;
	public static Item datenutbreadItem;
	public static Item maplesyruppancakesItem;
	public static Item maplesyrupwafflesItem;
	public static Item maplesausageItem;
	public static Item mapleoatmealItem;
	public static Item peachesandcreamoatmealItem;
	public static Item cinnamonappleoatmealItem;
	public static Item maplecandiedbaconItem;
	public static Item toastsandwichItem;
	public static Item potatoandcheesepirogiItem;
	public static Item zeppoleItem;
	public static Item sausageinbreadItem;
	public static Item chocolatecaramelfudgeItem;
	public static Item lavendershortbreadItem;
	public static Item beefwellingtonItem;
	public static Item epicbaconItem;
	public static Item manjuuItem;
	public static Item chickengumboItem;
	public static Item generaltsochickenItem;
	public static Item californiarollItem;
	public static Item futomakiItem;
	public static Item beansontoastItem;
	public static Item vegemiteItem;
	public static Item honeycombchocolatebarItem;
	public static Item cherrycoconutchocolatebarItem;
	public static Item fairybreadItem;

	public static Item timtamItem;
	public static Item meatpieItem;
	public static Item chikorollItem;
	public static Item damperItem;
	public static Item beetburgerItem;

	public static Item gherkinItem;
	public static Item mcpamItem;
	public static Item ceasarsaladItem;
	public static Item chaoscookieItem;
	public static Item chocolatebaconItem;
	public static Item lambkebabItem;
	public static Item nutellaItem;
	public static Item snickersbarItem;
	public static Item spinachpieItem;
	public static Item steamedspinachItem;
	public static Item vegemiteontoastItem;
	public static Item anchovyrawItem;
	public static Item bassrawItem;
	public static Item carprawItem;
	public static Item catfishrawItem;
	public static Item charrrawItem;
	public static Item clamrawItem;
	public static Item crabrawItem;
	public static Item crayfishrawItem;
	public static Item eelrawItem;
	public static Item frograwItem;
	public static Item grouperrawItem;
	public static Item herringrawItem;
	public static Item jellyfishrawItem;
	public static Item mudfishrawItem;
	public static Item octopusrawItem;
	public static Item perchrawItem;
	public static Item scalloprawItem;
	public static Item shrimprawItem;
	public static Item snailrawItem;
	public static Item snapperrawItem;
	public static Item tilapiarawItem;
	public static Item troutrawItem;
	public static Item tunarawItem;
	public static Item turtlerawItem;
	public static Item walleyerawItem;

	public static Item clamcookedItem;
	public static Item crabcookedItem;
	public static Item crayfishcookedItem;
	public static Item frogcookedItem;
	public static Item octopuscookedItem;
	public static Item scallopcookedItem;
	public static Item shrimpcookedItem;
	public static Item snailcookedItem;
	public static Item turtlecookedItem;
	public static Item appleciderItem;
	public static Item bangersandmashItem;
	public static Item batteredsausageItem;
	public static Item batterItem;
	public static Item chorizoItem;
	public static Item coleslawItem;
	public static Item energydrinkItem;
	public static Item friedonionsItem;
	public static Item meatfeastpizzaItem;
	public static Item mincepieItem;
	public static Item onionhamburgerItem;
	public static Item pepperoniItem;
	public static Item pickledonionsItem;
	public static Item porksausageItem;
	public static Item raspberrytrifleItem;

	public static Item pumpkinmuffinItem;
	public static Item suaderoItem;
	public static Item randomtacoItem;
	public static Item turkeyrawItem;
	public static Item turkeycookedItem;
	public static Item venisonrawItem;
	public static Item venisoncookedItem;
	public static Item strawberrymilkshakeItem;
	public static Item chocolatemilkshakeItem;
	public static Item bananamilkshakeItem;
	public static Item cornflakesItem;
	public static Item coleslawburgerItem;
	public static Item roastchickenItem;
	public static Item roastpotatoesItem;
	public static Item sundayroastItem;
	public static Item bbqpulledporkItem;
	public static Item lambwithmintsauceItem;
	public static Item steakandchipsItem;
	public static Item cherryicecreamItem;
	public static Item pistachioicecreamItem;
	public static Item neapolitanicecreamItem;
	public static Item spumoniicecreamItem;
	public static Item almondbutterItem;
	public static Item cashewbutterItem;
	public static Item chestnutbutterItem;
	public static Item cornishpastyItem;
	public static Item cottagepieItem;
	public static Item croissantItem;
	public static Item currypowderItem;
	public static Item dimsumItem;
	public static Item friedpecanokraItem;
	public static Item gooseberryjellyItem;
	public static Item gooseberryjellysandwichItem;
	public static Item gooseberrymilkshakeItem;
	public static Item gooseberrypieItem;
	public static Item gooseberrysmoothieItem;
	public static Item gooseberryyogurtItem;
	public static Item greenheartfishItem;
	public static Item hamsweetpicklesandwichItem;
	public static Item hushpuppiesItem;
	public static Item kimchiItem;
	public static Item mochiItem;
	public static Item museliItem;
	public static Item naanItem;
	public static Item okrachipsItem;
	public static Item okracreoleItem;
	public static Item pistachiobutterItem;
	public static Item ploughmanslunchItem;
	public static Item porklomeinItem;
	public static Item salmonpattiesItem;
	public static Item sausageItem;
	public static Item sausagerollItem;
	public static Item sesameballItem;
	public static Item sesamesnapsItem;
	public static Item shrimpokrahushpuppiesItem;
	public static Item soysauceItem;
	public static Item sweetpickleItem;
	public static Item veggiestripsItem;
	public static Item vindalooItem;

	public static Item applesmoothieItem;
	public static Item cheeseontoastItem;
	public static Item chocolaterollItem;
	public static Item coconutcreamItem;
	public static Item coconutsmoothieItem;
	public static Item crackerItem;
	public static Item cranberrysmoothieItem;
	public static Item cranberryyogurtItem;
	public static Item deluxechickencurryItem;
	public static Item garammasalaItem;
	public static Item grapesmoothieItem;
	public static Item gravyItem;
	public static Item honeysandwichItem;
	public static Item jamrollItem;
	public static Item mangochutneyItem;
	public static Item marzipanItem;
	public static Item paneerItem;
	public static Item paneertikkamasalaItem;
	public static Item peaandhamsoupItem;
	public static Item pearjellyItem;
	public static Item pearjellysandwichItem;
	public static Item pearsmoothieItem;
	public static Item plumjellyItem;
	public static Item plumjellysandwichItem;
	public static Item plumsmoothieItem;
	public static Item potatoandleeksoupItem;
	public static Item toadintheholeItem;
	public static Item tunapotatoItem;
	public static Item yorkshirepuddingItem;
	public static Item ediblerootItem;
	public static Item sunflowerseedsItem;
	public static Item sesameoilItem;
	public static Item hotandsoursoupItem;
	public static Item noodlesItem;
	public static Item chickenchowmeinItem;
	public static Item kungpaochickenItem;
	public static Item hoisinsauceItem;
	public static Item fivespiceItem;
	public static Item charsiuItem;
	public static Item sweetandsoursauceItem;
	public static Item sweetandsourchickenItem;
	public static Item baconandeggsItem;
	public static Item biscuitsandgravyItem;
	public static Item applefritterItem;
	public static Item sweetteaItem;
	public static Item creepercookieItem;
	public static Item patreonpieItem;

	public static Item honeybreadItem;
	public static Item honeybunItem;
	public static Item honeyglazedcarrotsItem;
	public static Item honeyglazedhamItem;
	public static Item honeysoyribsItem;

	public static Item rawtofeakItem;
	public static Item rawtofaconItem;
	public static Item rawtofishItem;
	public static Item rawtofeegItem;
	public static Item rawtofuttonItem;
	public static Item rawtofickenItem;
	public static Item rawtofabbitItem;
	public static Item rawtofurkeyItem;
	public static Item rawtofenisonItem;

	public static Item cookedtofeakItem;
	public static Item cookedtofaconItem;
	public static Item cookedtofishItem;
	public static Item cookedtofeegItem;
	public static Item cookedtofuttonItem;
	public static Item cookedtofickenItem;
	public static Item cookedtofabbitItem;
	public static Item cookedtofurkeyItem;
	public static Item cookedtofenisonItem;

	public static Item carrotcakeItem;
	public static Item cheesecakeItem;
	public static Item cherrycheesecakeItem;
	public static Item pineappleupsidedowncakeItem;
	public static Item chocolatesprinklecakeItem;
	public static Item redvelvetcakeItem;
	public static Item holidaycakeItem;
	public static Item pumpkincheesecakeItem;
	public static Item lamingtonItem;
	public static Item pavlovaItem;

	public static Item queenbeeItem;
	public static Item grubItem;
	public static Item honeycombItem;
	public static Item waxcombItem;
	public static Item royaljellyItem;
	public static Item beeswaxItem;
	public static Item fruitbaitItem;
	public static Item grainbaitItem;
	public static Item veggiebaitItem;
	public static Item fishtrapbaitItem;

	public static Item hardenedleatherItem;
	public static Item hardenedleatherhelmItem;
	public static Item hardenedleatherchestItem;
	public static Item hardenedleatherleggingsItem;
	public static Item hardenedleatherbootsItem;

	public static ArmorMaterial armorHardenedLeather = EnumHelper
			.addArmorMaterial("HARDENEDLEATHER", "harvestcraft:hardenedleather",
					15, new int[] { 2, 6, 5, 2 }, 9,
					SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);

	public static Item applejuiceItem;
	public static Item melonjuiceItem;
	public static Item carrotjuiceItem;
	public static Item strawberryjuiceItem;
	public static Item grapejuiceItem;
	public static Item blueberryjuiceItem;
	public static Item cherryjuiceItem;
	public static Item papayajuiceItem;
	public static Item starfruitjuiceItem;
	public static Item orangejuiceItem;
	public static Item peachjuiceItem;
	public static Item limejuiceItem;
	public static Item mangojuiceItem;
	public static Item pomegranatejuiceItem;
	public static Item blackberryjuiceItem;
	public static Item raspberryjuiceItem;
	public static Item kiwijuiceItem;
	public static Item cranberryjuiceItem;
	public static Item cactusfruitjuiceItem;
	public static Item plumjuiceItem;
	public static Item pearjuiceItem;
	public static Item apricotjuiceItem;
	public static Item figjuiceItem;
	public static Item grapefruitjuiceItem;
	public static Item persimmonjuiceItem;

	public static boolean initialized = false;

	public static void registerItems() {
		registerFoodItems();
		registerBeesItems();
		registerTools();
		registerArmorItems();
		initialized = true;
	}

	private static void registerArmorItems() {
		hardenedleatherItem = registerGenericItem("hardenedleatherItem");
		hardenedleatherhelmItem = registerItemArmor("hardenedleatherhelmItem",
				EntityEquipmentSlot.HEAD);
		hardenedleatherchestItem = registerItemArmor("hardenedleatherchestItem",
				EntityEquipmentSlot.CHEST);
		hardenedleatherleggingsItem = registerItemArmor(
				"hardenedleatherleggingsItem", EntityEquipmentSlot.LEGS);
		hardenedleatherbootsItem = registerItemArmor("hardenedleatherbootsItem",
				EntityEquipmentSlot.FEET);
	}

	private static void registerBeesItems() {
		queenbeeItem = registerItem(new ItemPamBee(), "queenbeeItem");
		grubItem = registerGenericItem("grubItem");
		honeycombItem = registerGenericItem("honeycombItem");
		honeyItem = registerItemFood("honeyItem", 4, 0.6F);
		waxcombItem = registerGenericItem("waxcombItem");
		royaljellyItem = registerGenericItem("royaljellyItem");

		beeswaxItem = registerGenericItem("beeswaxItem");
		fruitbaitItem = registerGenericItem("fruitbaitItem");
		grainbaitItem = registerGenericItem("grainbaitItem");
		veggiebaitItem = registerGenericItem("veggiebaitItem");
		fishtrapbaitItem = registerGenericItem("fishtrapbaitItem");
	}

	private static void registerFoodItems() {
		ediblerootItem = registerItemFood("ediblerootItem",
				config.cropfoodRestore, config.cropsaturationRestore);
		sunflowerseedsItem = registerItemFood("sunflowerseedsItem",
				config.cropfoodRestore, config.cropsaturationRestore);

		calamarirawItem = registerItemFood("calamarirawItem", 2,
				config.snacksaturation);
		calamaricookedItem = registerItemFood("calamaricookedItem", 5,
				config.mealsaturation);

		saltItem = registerGenericItem("saltItem");
		wovencottonItem = registerGenericItem("wovencottonItem");
		freshwaterItem = registerGenericItem("freshwaterItem");
		freshmilkItem = registerGenericItem("freshmilkItem");

		grilledasparagusItem = registerItemFood("grilledasparagusItem", 4,
				config.mealsaturation);
		bakedsweetpotatoItem = registerItemFood("bakedsweetpotatoItem", 4,
				config.mealsaturation);
		grilledeggplantItem = registerItemFood("grilledeggplantItem", 4,
				config.mealsaturation);
		toastItem = registerItemFood("toastItem", 7, config.mealsaturation);
		cheeseItem = registerItemFood("cheeseItem", 2, config.mealsaturation);
		icecreamItem = registerItemFood("icecreamItem", 8,
				config.mealsaturation);
		grilledcheeseItem = registerItemFood("grilledcheeseItem", 9,
				config.mealsaturation);
		applesauceItem = registerItemFood("applesauceItem", 6,
				config.mealsaturation);
		pumpkinbreadItem = registerItemFood("pumpkinbreadItem", 8,
				config.mealsaturation);
		caramelappleItem = registerItemFood("caramelappleItem", 7,
				config.mealsaturation);

		applepieItem = registerItemFood("applepieItem", 8,
				config.meatymealsaturation);

		teaItem = registerPotionFood("teaItem", 4, config.snacksaturation);
		coffeeItem = registerPotionFood("coffeeItem", 4,
				config.snacksaturation);
		popcornItem = registerItemFood("popcornItem", 4,
				config.snacksaturation);
		raisinsItem = registerItemFood("raisinsItem", 4,
				config.snacksaturation);
		ricecakeItem = registerItemFood("ricecakeItem", 4,
				config.snacksaturation);
		toastedcoconutItem = registerItemFood("toastedcoconutItem", 4,
				config.snacksaturation);
		roastedpumpkinseedsItem = registerItemFood("roastedpumpkinseedsItem", 2,
				config.snacksaturation);

		vanillaItem = registerGenericItem("vanillaItem");
		toastedsesameseedsItem = registerGenericItem("toastedsesameseedsItem");
		flourItem = registerGenericItem("flourItem");

		doughItem = registerGenericItem("doughItem");

		pastaItem = registerGenericItem("pastaItem");
		heavycreamItem = registerGenericItem("heavycreamItem");
		butterItem = registerGenericItem("butterItem");

		registerJuices();

		pumpkinsoupItem = registerItemFood("pumpkinsoupItem", 8,
				config.meatymealsaturation);
		melonsmoothieItem = registerPotionFood("melonsmoothieItem", 5,
				config.mealsaturation);

		carrotsoupItem = registerItemFood("carrotsoupItem", 8,
				config.meatymealsaturation);
		glazedcarrotsItem = registerItemFood("glazedcarrotsItem", 7,
				config.mealsaturation);
		butteredpotatoItem = registerItemFood("butteredpotatoItem", 7,
				config.mealsaturation);
		loadedbakedpotatoItem = registerItemFood("loadedbakedpotatoItem", 11,
				config.meatymealsaturation);
		mashedpotatoesItem = registerItemFood("mashedpotatoesItem", 9,
				config.mealsaturation);
		potatosaladItem = registerItemFood("potatosaladItem", 7,
				config.meatymealsaturation);
		potatosoupItem = registerItemFood("potatosoupItem", 6,
				config.meatymealsaturation);
		friesItem = registerItemFood("friesItem", 4, config.snacksaturation);
		grilledmushroomItem = registerItemFood("grilledmushroomItem", 2,
				config.mealsaturation);
		stuffedmushroomItem = registerItemFood("stuffedmushroomItem", 6,
				config.meatymealsaturation);
		chickensandwichItem = registerItemFood("chickensandwichItem", 9,
				config.meatymealsaturation);
		chickennoodlesoupItem = registerItemFood("chickennoodlesoupItem", 9,
				config.meatymealsaturation);
		chickenpotpieItem = registerItemFood("chickenpotpieItem", 10,
				config.meatymealsaturation);
		breadedporkchopItem = registerItemFood("breadedporkchopItem", 5,
				config.mealsaturation);
		hotdogItem = registerItemFood("hotdogItem", 8,
				config.meatymealsaturation);
		bakedhamItem = registerItemFood("bakedhamItem", 9,
				config.meatymealsaturation);
		hamburgerItem = registerItemFood("hamburgerItem", 8,
				config.mealsaturation);
		cheeseburgerItem = registerItemFood("cheeseburgerItem", 9,
				config.mealsaturation);
		baconcheeseburgerItem = registerItemFood("baconcheeseburgerItem", 14,
				config.meatymealsaturation);
		potroastItem = registerItemFood("potroastItem", 10,
				config.meatymealsaturation);
		fishsandwichItem = registerItemFood("fishsandwichItem", 8,
				config.mealsaturation);
		fishsticksItem = registerItemFood("fishsticksItem", 5,
				config.mealsaturation);
		fishandchipsItem = registerItemFood("fishandchipsItem", 9,
				config.meatymealsaturation);
		mayoItem = registerGenericItem("mayoItem");
		friedeggItem = registerItemFood("friedeggItem", 4,
				config.mealsaturation);
		scrambledeggItem = registerItemFood("scrambledeggItem", 4,
				config.mealsaturation);
		boiledeggItem = registerItemFood("boiledeggItem", 2,
				config.mealsaturation);
		eggsaladItem = registerItemFood("eggsaladItem", 8,
				config.meatymealsaturation);
		caramelItem = registerItemFood("caramelItem", 2,
				config.snacksaturation);
		taffyItem = registerItemFood("taffyItem", 4, config.snacksaturation);
		spidereyesoupItem = registerItemFood("spidereyesoupItem", 8,
				config.meatymealsaturation);
		zombiejerkyItem = registerItemFood("zombiejerkyItem", 4,
				config.snacksaturation);
		cocoapowderItem = registerGenericItem("cocoapowderItem");
		chocolatebarItem = registerItemFood("chocolatebarItem", 5,
				config.snacksaturation);
		hotchocolateItem = registerPotionFood("hotchocolateItem", 4,
				config.mealsaturation);
		chocolateicecreamItem = registerItemFood("chocolateicecreamItem", 9,
				config.mealsaturation);
		vegetablesoupItem = registerItemFood("vegetablesoupItem", 8,
				config.meatymealsaturation);
		stockItem = registerItemFood("stockItem", 3, config.mealsaturation);
		fruitsaladItem = registerItemFood("fruitsaladItem", 6,
				config.meatymealsaturation);
		spagettiItem = registerItemFood("spagettiItem", 8,
				config.mealsaturation);
		spagettiandmeatballsItem = registerItemFood("spagettiandmeatballsItem",
				11, config.meatymealsaturation);
		tomatosoupItem = registerItemFood("tomatosoupItem", 6,
				config.mealsaturation);
		ketchupItem = registerGenericItem("ketchupItem");
		chickenparmasanItem = registerItemFood("chickenparmasanItem", 8,
				config.meatymealsaturation);
		pizzaItem = registerItemFood("pizzaItem", 10,
				config.meatymealsaturation);
		springsaladItem = registerItemFood("springsaladItem", 9,
				config.mealsaturation);
		porklettucewrapItem = registerItemFood("porklettucewrapItem", 8,
				config.meatymealsaturation);
		fishlettucewrapItem = registerItemFood("fishlettucewrapItem", 6,
				config.meatymealsaturation);
		bltItem = registerItemFood("bltItem", 12, config.meatymealsaturation);
		leafychickensandwichItem = registerItemFood("leafychickensandwichItem",
				11, config.meatymealsaturation);
		leafyfishsandwichItem = registerItemFood("leafyfishsandwichItem", 9,
				config.meatymealsaturation);
		deluxecheeseburgerItem = registerItemFood("deluxecheeseburgerItem", 12,
				config.meatymealsaturation);
		delightedmealItem = registerItemFood("delightedmealItem", 18,
				config.meatymealsaturation);
		onionsoupItem = registerItemFood("onionsoupItem", 12,
				config.mealsaturation);
		potatocakesItem = registerItemFood("potatocakesItem", 7,
				config.mealsaturation);
		hashItem = registerItemFood("hashItem", 11, config.mealsaturation);
		braisedonionsItem = registerItemFood("braisedonionsItem", 8,
				config.mealsaturation);
		heartybreakfastItem = registerItemFood("heartybreakfastItem", 18,
				config.meatymealsaturation);
		cornonthecobItem = registerItemFood("cornonthecobItem", 6,
				config.mealsaturation);
		cornmealItem = registerGenericItem("cornmealItem");
		cornbreadItem = registerItemFood("cornbreadItem", 8,
				config.mealsaturation);
		tortillaItem = registerItemFood("tortillaItem", 6,
				config.mealsaturation);
		nachoesItem = registerItemFood("nachoesItem", 8, config.mealsaturation);
		tacoItem = registerItemFood("tacoItem", 11, config.meatymealsaturation);
		fishtacoItem = registerItemFood("fishtacoItem", 9,
				config.meatymealsaturation);
		creamedcornItem = registerItemFood("creamedcornItem", 8,
				config.mealsaturation);
		strawberrysmoothieItem = registerItemFood("strawberrysmoothieItem", 6,
				config.mealsaturation);
		strawberrypieItem = registerItemFood("strawberrypieItem", 8,
				config.mealsaturation);
		strawberrysaladItem = registerItemFood("strawberrysaladItem", 8,
				config.mealsaturation);
		chocolatestrawberryItem = registerItemFood("chocolatestrawberryItem", 6,
				config.mealsaturation);
		peanutbutterItem = registerItemFood("peanutbutterItem", 5,
				config.mealsaturation);
		trailmixItem = registerItemFood("trailmixItem", 10,
				config.mealsaturation);
		pbandjItem = registerItemFood("pbandjItem", 10, config.mealsaturation);
		peanutbuttercookiesItem = registerItemFood("peanutbuttercookiesItem", 9,
				config.snacksaturation);
		vinegarItem = registerGenericItem("vinegarItem");
		grapejellyItem = registerItemFood("grapejellyItem", 5,
				config.mealsaturation);
		grapesaladItem = registerItemFood("grapesaladItem", 8,
				config.mealsaturation);
		raisincookiesItem = registerItemFood("raisincookiesItem", 9,
				config.snacksaturation);
		picklesItem = registerItemFood("picklesItem", 7, config.mealsaturation);
		cucumbersaladItem = registerItemFood("cucumbersaladItem", 11,
				config.mealsaturation);
		cucumbersoupItem = registerItemFood("cucumbersoupItem", 8,
				config.mealsaturation);
		vegetarianlettucewrapItem = registerItemFood(
				"vegetarianlettucewrapItem", 8, config.mealsaturation);
		marinatedcucumbersItem = registerItemFood("marinatedcucumbersItem", 9,
				config.mealsaturation);
		ricesoupItem = registerItemFood("ricesoupItem", 6,
				config.mealsaturation);
		friedriceItem = registerItemFood("friedriceItem", 10,
				config.mealsaturation);
		mushroomrisottoItem = registerItemFood("mushroomrisottoItem", 10,
				config.mealsaturation);
		curryItem = registerItemFood("curryItem", 11, config.mealsaturation);
		rainbowcurryItem = registerItemFood("rainbowcurryItem", 12,
				config.mealsaturation);
		refriedbeansItem = registerItemFood("refriedbeansItem", 7,
				config.mealsaturation);
		bakedbeansItem = registerItemFood("bakedbeansItem", 10,
				config.meatymealsaturation);
		beansandriceItem = registerItemFood("beansandriceItem", 11,
				config.meatymealsaturation);
		chiliItem = registerItemFood("chiliItem", 13,
				config.meatymealsaturation);
		beanburritoItem = registerItemFood("beanburritoItem", 9,
				config.mealsaturation);
		stuffedpepperItem = registerItemFood("stuffedpepperItem", 7,
				config.mealsaturation);
		veggiestirfryItem = registerItemFood("veggiestirfryItem", 12,
				config.mealsaturation);
		grilledskewersItem = registerItemFood("grilledskewersItem", 8,
				config.mealsaturation);
		supremepizzaItem = registerItemFood("supremepizzaItem", 13,
				config.meatymealsaturation);
		omeletItem = registerItemFood("omeletItem", 7,
				config.meatymealsaturation);
		hotwingsItem = registerItemFood("hotwingsItem", 8,
				config.meatymealsaturation);
		chilipoppersItem = registerItemFood("chilipoppersItem", 7,
				config.mealsaturation);
		extremechiliItem = registerItemFood("extremechiliItem", 14,
				config.meatymealsaturation);
		chilichocolateItem = registerItemFood("chilichocolateItem", 6,
				config.snacksaturation);
		lemonaideItem = registerPotionFood("lemonaideItem", 6,
				config.mealsaturation);
		lemonbarItem = registerItemFood("lemonbarItem", 8,
				config.mealsaturation);
		fishdinnerItem = registerItemFood("fishdinnerItem", 8,
				config.meatymealsaturation);
		lemonsmoothieItem = registerItemFood("lemonsmoothieItem", 6,
				config.mealsaturation);
		lemonmeringueItem = registerItemFood("lemonmeringueItem", 10,
				config.mealsaturation);
		candiedlemonItem = registerItemFood("candiedlemonItem", 4,
				config.snacksaturation);
		lemonchickenItem = registerItemFood("lemonchickenItem", 9,
				config.meatymealsaturation);
		blueberrysmoothieItem = registerPotionFood("blueberrysmoothieItem", 6,
				config.mealsaturation);
		blueberrypieItem = registerItemFood("blueberrypieItem", 8,
				config.mealsaturation);
		blueberrymuffinItem = registerItemFood("blueberrymuffinItem", 8,
				config.mealsaturation);
		pancakesItem = registerItemFood("pancakesItem", 6,
				config.mealsaturation);
		blueberrypancakesItem = registerItemFood("blueberrypancakesItem", 8,
				config.mealsaturation);
		cherrypieItem = registerItemFood("cherrypieItem", 8,
				config.mealsaturation);
		chocolatecherryItem = registerItemFood("chocolatecherryItem", 8,
				config.snacksaturation);
		cherrysmoothieItem = registerPotionFood("cherrysmoothieItem", 6,
				config.mealsaturation);

		stuffedeggplantItem = registerItemFood("stuffedeggplantItem", 10,
				config.mealsaturation);
		eggplantparmItem = registerItemFood("eggplantparmItem", 10,
				config.mealsaturation);
		raspberryicedteaItem = registerPotionFood("raspberryicedteaItem", 7,
				config.snacksaturation);
		chaiteaItem = registerPotionFood("chaiteaItem", 9,
				config.snacksaturation);
		espressoItem = registerPotionFood("espressoItem", 8,
				config.snacksaturation);
		coffeeconlecheItem = registerPotionFood("coffeeconlecheItem", 10,
				config.snacksaturation);
		mochaicecreamItem = registerItemFood("mochaicecreamItem", 10,
				config.snacksaturation);
		pickledbeetsItem = registerItemFood("pickledbeetsItem", 8,
				config.mealsaturation);
		beetsaladItem = registerItemFood("beetsaladItem", 10,
				config.mealsaturation);
		beetsoupItem = registerItemFood("beetsoupItem", 9,
				config.mealsaturation);
		bakedbeetsItem = registerItemFood("bakedbeetsItem", 10,
				config.mealsaturation);
		broccolimacItem = registerItemFood("broccolimacItem", 8,
				config.mealsaturation);
		broccolindipItem = registerItemFood("broccolindipItem", 8,
				config.mealsaturation);
		creamedbroccolisoupItem = registerItemFood("creamedbroccolisoupItem",
				10, config.mealsaturation);
		sweetpotatopieItem = registerItemFood("sweetpotatopieItem", 10,
				config.mealsaturation);
		candiedsweetpotatoesItem = registerItemFood("candiedsweetpotatoesItem",
				7, config.snacksaturation);
		mashedsweetpotatoesItem = registerItemFood("mashedsweetpotatoesItem", 7,
				config.mealsaturation);
		steamedpeasItem = registerItemFood("steamedpeasItem", 6,
				config.mealsaturation);
		splitpeasoupItem = registerItemFood("splitpeasoupItem", 12,
				config.meatymealsaturation);

		pineapplehamItem = registerItemFood("pineapplehamItem", 10,
				config.meatymealsaturation);
		pineappleyogurtItem = registerItemFood("pineappleyogurtItem", 8,
				config.mealsaturation);
		turnipsoupItem = registerItemFood("turnipsoupItem", 8,
				config.mealsaturation);
		roastedrootveggiemedleyItem = registerItemFood(
				"roastedrootveggiemedleyItem", 10, config.mealsaturation);
		bakedturnipsItem = registerItemFood("bakedturnipsItem", 9,
				config.mealsaturation);
		gingerbreadItem = registerItemFood("gingerbreadItem", 10,
				config.mealsaturation);
		gingersnapsItem = registerItemFood("gingersnapsItem", 8,
				config.snacksaturation);
		candiedgingerItem = registerItemFood("candiedgingerItem", 6,
				config.snacksaturation);
		mustardItem = registerGenericItem("mustardItem");
		softpretzelandmustardItem = registerItemFood(
				"softpretzelandmustardItem", 10, config.snacksaturation);
		spicymustardporkItem = registerItemFood("spicymustardporkItem", 10,
				config.meatymealsaturation);
		spicygreensItem = registerItemFood("spicygreensItem", 11,
				config.mealsaturation);
		garlicbreadItem = registerItemFood("garlicbreadItem", 9,
				config.mealsaturation);
		garlicmashedpotatoesItem = registerItemFood("garlicmashedpotatoesItem",
				10, config.mealsaturation);
		garlicchickenItem = registerItemFood("garlicchickenItem", 12,
				config.meatymealsaturation);
		summerradishsaladItem = registerItemFood("summerradishsaladItem", 8,
				config.mealsaturation);
		summersquashwithradishItem = registerItemFood(
				"summersquashwithradishItem", 10, config.mealsaturation);
		celeryandpeanutbutterItem = registerItemFood(
				"celeryandpeanutbutterItem", 6, config.mealsaturation);
		chickencelerycasseroleItem = registerItemFood(
				"chickencelerycasseroleItem", 12, config.meatymealsaturation);
		peasandceleryItem = registerItemFood("peasandceleryItem", 8,
				config.mealsaturation);
		celerysoupItem = registerItemFood("celerysoupItem", 8,
				config.mealsaturation);
		zucchinibreadItem = registerItemFood("zucchinibreadItem", 8,
				config.mealsaturation);
		zucchinifriesItem = registerItemFood("zucchinifriesItem", 12,
				config.mealsaturation);
		zestyzucchiniItem = registerItemFood("zestyzucchiniItem", 12,
				config.meatymealsaturation);
		zucchinibakeItem = registerItemFood("zucchinibakeItem", 12,
				config.mealsaturation);
		asparagusquicheItem = registerItemFood("asparagusquicheItem", 8,
				config.meatymealsaturation);
		asparagussoupItem = registerItemFood("asparagussoupItem", 8,
				config.mealsaturation);
		walnutraisinbreadItem = registerItemFood("walnutraisinbreadItem", 10,
				config.mealsaturation);
		candiedwalnutsItem = registerItemFood("candiedwalnutsItem", 8,
				config.mealsaturation);
		brownieItem = registerItemFood("brownieItem", 10,
				config.snacksaturation);
		papayasmoothieItem = registerPotionFood("papayasmoothieItem", 6,
				config.mealsaturation);
		papayayogurtItem = registerItemFood("papayayogurtItem", 8,
				config.mealsaturation);
		starfruitsmoothieItem = registerPotionFood("starfruitsmoothieItem", 6,
				config.mealsaturation);
		starfruityogurtItem = registerItemFood("starfruityogurtItem", 8,
				config.mealsaturation);
		guacamoleItem = registerItemFood("guacamoleItem", 10,
				config.mealsaturation);
		creamofavocadosoupItem = registerItemFood("creamofavocadosoupItem", 10,
				config.mealsaturation);
		avocadoburritoItem = registerItemFood("avocadoburritoItem", 14,
				config.meatymealsaturation);
		poachedpearItem = registerItemFood("poachedpearItem", 5,
				config.mealsaturation);
		fruitcrumbleItem = registerItemFood("fruitcrumbleItem", 8,
				config.mealsaturation);
		pearyogurtItem = registerItemFood("pearyogurtItem", 8,
				config.mealsaturation);
		plumyogurtItem = registerItemFood("plumyogurtItem", 8,
				config.mealsaturation);
		bananasplitItem = registerItemFood("bananasplitItem", 10,
				config.mealsaturation);
		banananutbreadItem = registerItemFood("banananutbreadItem", 9,
				config.mealsaturation);
		bananasmoothieItem = registerPotionFood("bananasmoothieItem", 6,
				config.mealsaturation);
		bananayogurtItem = registerItemFood("bananayogurtItem", 8,
				config.mealsaturation);
		coconutmilkItem = registerPotionFood("coconutmilkItem", 5,
				config.mealsaturation);
		chickencurryItem = registerItemFood("chickencurryItem", 14,
				config.meatymealsaturation);
		coconutshrimpItem = registerItemFood("coconutshrimpItem", 10,
				config.meatymealsaturation);
		coconutyogurtItem = registerItemFood("coconutyogurtItem", 8,
				config.mealsaturation);
		orangechickenItem = registerItemFood("orangechickenItem", 12,
				config.meatymealsaturation);
		orangesmoothieItem = registerPotionFood("orangesmoothieItem", 6,
				config.mealsaturation);
		orangeyogurtItem = registerItemFood("orangeyogurtItem", 8,
				config.mealsaturation);
		peachcobblerItem = registerItemFood("peachcobblerItem", 8,
				config.mealsaturation);
		peachsmoothieItem = registerItemFood("peachsmoothieItem", 6,
				config.mealsaturation);
		peachyogurtItem = registerItemFood("peachyogurtItem", 8,
				config.mealsaturation);
		keylimepieItem = registerItemFood("keylimepieItem", 6,
				config.mealsaturation);
		limesmoothieItem = registerPotionFood("limesmoothieItem", 9,
				config.mealsaturation);
		limeyogurtItem = registerItemFood("limeyogurtItem", 8,
				config.mealsaturation);
		mangosmoothieItem = registerPotionFood("mangosmoothieItem", 6,
				config.mealsaturation);
		mangoyogurtItem = registerItemFood("mangoyogurtItem", 8,
				config.mealsaturation);
		pomegranatesmoothieItem = registerPotionFood("pomegranatesmoothieItem",
				6, config.mealsaturation);
		pomegranateyogurtItem = registerItemFood("pomegranateyogurtItem", 8,
				config.mealsaturation);
		vanillayogurtItem = registerItemFood("vanillayogurtItem", 8,
				config.mealsaturation);
		cinnamonrollItem = registerItemFood("cinnamonrollItem", 8,
				config.snacksaturation);
		frenchtoastItem = registerItemFood("frenchtoastItem", 10,
				config.mealsaturation);
		marshmellowsItem = registerItemFood("marshmellowsItem", 5,
				config.snacksaturation);
		donutItem = registerItemFood("donutItem", 6, config.snacksaturation);
		chocolatedonutItem = registerItemFood("chocolatedonutItem", 8,
				config.snacksaturation);
		powdereddonutItem = registerItemFood("powdereddonutItem", 7,
				config.snacksaturation);
		jellydonutItem = registerItemFood("jellydonutItem", 8,
				config.snacksaturation);
		frosteddonutItem = registerItemFood("frosteddonutItem", 9,
				config.snacksaturation);
		cactussoupItem = registerItemFood("cactussoupItem", 6,
				config.mealsaturation);
		wafflesItem = registerItemFood("wafflesItem", 9, config.mealsaturation);
		seedsoupItem = registerItemFood("seedsoupItem", 4,
				config.mealsaturation);
		softpretzelItem = registerItemFood("softpretzelItem", 8,
				config.snacksaturation);
		jellybeansItem = registerItemFood("jellybeansItem", 5,
				config.snacksaturation);
		biscuitItem = registerItemFood("biscuitItem", 6, config.mealsaturation);
		creamcookieItem = registerItemFood("creamcookieItem", 7,
				config.snacksaturation);
		jaffaItem = registerItemFood("jaffaItem", 9, config.snacksaturation);
		friedchickenItem = registerItemFood("friedchickenItem", 11,
				config.meatymealsaturation);

		footlongItem = registerItemFood("footlongItem", 14,
				config.meatymealsaturation);
		blueberryyogurtItem = registerItemFood("blueberryyogurtItem", 8,
				config.mealsaturation);
		lemonyogurtItem = registerItemFood("lemonyogurtItem", 8,
				config.mealsaturation);
		cherryyogurtItem = registerItemFood("cherryyogurtItem", 8,
				config.mealsaturation);
		strawberryyogurtItem = registerItemFood("strawberryyogurtItem", 8,
				config.mealsaturation);
		grapeyogurtItem = registerItemFood("grapeyogurtItem", 8,
				config.mealsaturation);
		chocolateyogurtItem = registerItemFood("chocolateyogurtItem", 8,
				config.mealsaturation);
		blackberrycobblerItem = registerItemFood("blackberrycobblerItem", 8,
				config.mealsaturation);
		blackberrysmoothieItem = registerPotionFood("blackberrysmoothieItem", 6,
				config.mealsaturation);
		blackberryyogurtItem = registerItemFood("blackberryyogurtItem", 8,
				config.mealsaturation);
		chocolatemilkItem = registerPotionFood("chocolatemilkItem", 6,
				config.mealsaturation);
		pumpkinyogurtItem = registerItemFood("pumpkinyogurtItem", 8,
				config.mealsaturation);
		raspberrypieItem = registerItemFood("raspberrypieItem", 8,
				config.mealsaturation);
		raspberrysmoothieItem = registerPotionFood("raspberrysmoothieItem", 6,
				config.mealsaturation);
		raspberryyogurtItem = registerItemFood("raspberryyogurtItem", 8,
				config.mealsaturation);
		cinnamonsugardonutItem = registerItemFood("cinnamonsugardonutItem", 8,
				config.snacksaturation);
		melonyogurtItem = registerItemFood("melonyogurtItem", 6,
				config.mealsaturation);
		kiwismoothieItem = registerPotionFood("kiwismoothieItem", 6,
				config.mealsaturation);
		kiwiyogurtItem = registerItemFood("kiwiyogurtItem", 8,
				config.mealsaturation);
		plainyogurtItem = registerItemFood("plainyogurtItem", 4,
				config.mealsaturation);
		appleyogurtItem = registerItemFood("appleyogurtItem", 8,
				config.mealsaturation);
		saltedsunflowerseedsItem = registerItemFood("saltedsunflowerseedsItem",
				6, config.mealsaturation);
		sunflowerwheatrollsItem = registerItemFood("sunflowerwheatrollsItem",
				10, config.mealsaturation);
		sunflowerbroccolisaladItem = registerItemFood(
				"sunflowerbroccolisaladItem", 13, config.mealsaturation);
		cranberrysauceItem = registerItemFood("cranberrysauceItem", 6,
				config.mealsaturation);
		cranberrybarItem = registerItemFood("cranberrybarItem", 8,
				config.mealsaturation);
		peppermintItem = registerItemFood("peppermintItem", 5,
				config.snacksaturation);
		blackpepperItem = registerGenericItem("blackpepperItem");
		groundcinnamonItem = registerGenericItem("groundcinnamonItem");
		groundnutmegItem = registerGenericItem("groundnutmegItem");
		oliveoilItem = registerGenericItem("oliveoilItem");
		baklavaItem = registerItemFood("baklavaItem", 10,
				config.mealsaturation);
		gummybearsItem = registerItemFood("gummybearsItem", 5,
				config.snacksaturation);
		baconmushroomburgerItem = registerItemFood("baconmushroomburgerItem",
				16, config.snacksaturation);
		fruitpunchItem = registerPotionFood("fruitpunchItem", 6,
				config.mealsaturation);
		meatystewItem = registerItemFood("meatystewItem", 8,
				config.meatymealsaturation);
		mixedsaladItem = registerItemFood("mixedsaladItem", 10,
				config.mealsaturation);
		pinacoladaItem = registerItemFood("pinacoladaItem", 6,
				config.mealsaturation);
		saladdressingItem = registerGenericItem("saladdressingItem");
		shepardspieItem = registerItemFood("shepardspieItem", 12,
				config.meatymealsaturation);
		eggnogItem = registerPotionFood("eggnogItem", 6, config.mealsaturation);
		custardItem = registerItemFood("custardItem", 6, config.mealsaturation);
		sushiItem = registerItemFood("sushiItem", 6,
				config.meatymealsaturation);
		gardensoupItem = registerItemFood("gardensoupItem", 6,
				config.mealsaturation);
		applejellyItem = registerItemFood("applejellyItem", 5,
				config.mealsaturation);
		applejellysandwichItem = registerItemFood("applejellysandwichItem", 10,
				config.mealsaturation);
		blackberryjellyItem = registerItemFood("blackberryjellyItem", 5,
				config.mealsaturation);
		blackberryjellysandwichItem = registerItemFood(
				"blackberryjellysandwichItem", 10, config.mealsaturation);
		blueberryjellyItem = registerItemFood("blueberryjellyItem", 5,
				config.mealsaturation);
		blueberryjellysandwichItem = registerItemFood(
				"blueberryjellysandwichItem", 10, config.mealsaturation);
		cherryjellyItem = registerItemFood("cherryjellyItem", 5,
				config.mealsaturation);
		cherryjellysandwichItem = registerItemFood("cherryjellysandwichItem",
				10, config.mealsaturation);
		cranberryjellyItem = registerItemFood("cranberryjellyItem", 5,
				config.mealsaturation);
		cranberryjellysandwichItem = registerItemFood(
				"cranberryjellysandwichItem", 10, config.mealsaturation);
		kiwijellyItem = registerItemFood("kiwijellyItem", 5,
				config.mealsaturation);
		kiwijellysandwichItem = registerItemFood("kiwijellysandwichItem", 10,
				config.mealsaturation);
		lemonjellyItem = registerItemFood("lemonjellyItem", 5,
				config.mealsaturation);
		lemonjellysandwichItem = registerItemFood("lemonjellysandwichItem", 10,
				config.mealsaturation);
		limejellyItem = registerItemFood("limejellyItem", 5,
				config.mealsaturation);
		limejellysandwichItem = registerItemFood("limejellysandwichItem", 10,
				config.mealsaturation);
		mangojellyItem = registerItemFood("mangojellyItem", 5,
				config.mealsaturation);
		mangojellysandwichItem = registerItemFood("mangojellysandwichItem", 10,
				config.mealsaturation);
		orangejellyItem = registerItemFood("orangejellyItem", 5,
				config.mealsaturation);
		orangejellysandwichItem = registerItemFood("orangejellysandwichItem",
				10, config.mealsaturation);
		papayajellyItem = registerItemFood("papayajellyItem", 5,
				config.mealsaturation);
		papayajellysandwichItem = registerItemFood("papayajellysandwichItem",
				10, config.mealsaturation);
		peachjellyItem = registerItemFood("peachjellyItem", 5,
				config.mealsaturation);
		peachjellysandwichItem = registerItemFood("peachjellysandwichItem", 10,
				config.mealsaturation);
		pomegranatejellyItem = registerItemFood("pomegranatejellyItem", 5,
				config.mealsaturation);
		pomegranatejellysandwichItem = registerItemFood(
				"pomegranatejellysandwichItem", 10, config.mealsaturation);
		raspberryjellyItem = registerItemFood("raspberryjellyItem", 5,
				config.mealsaturation);
		raspberryjellysandwichItem = registerItemFood(
				"raspberryjellysandwichItem", 10, config.mealsaturation);
		starfruitjellyItem = registerItemFood("starfruitjellyItem", 5,
				config.mealsaturation);
		starfruitjellysandwichItem = registerItemFood(
				"starfruitjellysandwichItem", 10, config.mealsaturation);
		strawberryjellyItem = registerItemFood("strawberryjellyItem", 5,
				config.mealsaturation);
		strawberryjellysandwichItem = registerItemFood(
				"strawberryjellysandwichItem", 10, config.mealsaturation);
		watermelonjellyItem = registerItemFood("watermelonjellyItem", 5,
				config.mealsaturation);
		watermelonjellysandwichItem = registerItemFood(
				"watermelonjellysandwichItem", 10, config.mealsaturation);
		bubblywaterItem = registerGenericItem("bubblywaterItem");
		cherrysodaItem = registerPotionFood("cherrysodaItem", 2,
				config.snacksaturation).addDefaultSpeedPotionEffect();
		colasodaItem = registerPotionFood("colasodaItem", 2,
				config.snacksaturation).addDefaultSpeedPotionEffect();
		gingersodaItem = registerPotionFood("gingersodaItem", 2,
				config.snacksaturation).addDefaultSpeedPotionEffect();
		grapesodaItem = registerPotionFood("grapesodaItem", 2,
				config.snacksaturation).addDefaultSpeedPotionEffect();
		lemonlimesodaItem = registerPotionFood("lemonlimesodaItem", 3,
				config.snacksaturation).addDefaultSpeedPotionEffect();
		orangesodaItem = registerPotionFood("orangesodaItem", 2,
				config.snacksaturation).addDefaultSpeedPotionEffect();
		rootbeersodaItem = registerPotionFood("rootbeersodaItem", 2,
				config.snacksaturation).addDefaultSpeedPotionEffect();
		strawberrysodaItem = registerPotionFood("strawberrysodaItem", 2,
				config.snacksaturation).addDefaultSpeedPotionEffect();
		caramelicecreamItem = registerItemFood("caramelicecreamItem", 9,
				config.mealsaturation);
		mintchocolatechipicemcreamItem = registerItemFood(
				"mintchocolatechipicecreamItem", 10, config.mealsaturation);
		strawberryicecreamItem = registerItemFood("strawberryicecreamItem", 9,
				config.mealsaturation);
		vanillaicecreamItem = registerItemFood("vanillaicecreamItem", 9,
				config.mealsaturation);
		gingerchickenItem = registerItemFood("gingerchickenItem", 12,
				config.meatymealsaturation);
		oldworldveggiesoupItem = registerItemFood("oldworldveggiesoupItem", 8,
				config.mealsaturation);
		spicebunItem = registerItemFood("spicebunItem", 8,
				config.mealsaturation);
		gingeredrhubarbtartItem = registerItemFood("gingeredrhubarbtartItem", 8,
				config.mealsaturation);
		lambbarleysoupItem = registerItemFood("lambbarleysoupItem", 10,
				config.meatymealsaturation);
		honeylemonlambItem = registerItemFood("honeylemonlambItem", 8,
				config.meatymealsaturation);
		pumpkinoatsconesItem = registerItemFood("pumpkinoatsconesItem", 6,
				config.mealsaturation);
		beefjerkyItem = registerItemFood("beefjerkyItem", 5,
				config.meatymealsaturation);
		ovenroastedcauliflowerItem = registerItemFood(
				"ovenroastedcauliflowerItem", 10, config.mealsaturation);
		leekbaconsoupItem = registerItemFood("leekbaconsoupItem", 8,
				config.meatymealsaturation);
		herbbutterparsnipsItem = registerItemFood("herbbutterparsnipsItem", 7,
				config.mealsaturation);
		scallionbakedpotatoItem = registerItemFood("scallionbakedpotatoItem", 8,
				config.mealsaturation);
		soymilkItem = registerPotionFood("soymilkItem", 4,
				config.mealsaturation);
		firmtofuItem = registerItemFood("firmtofuItem", 4,
				config.mealsaturation);
		silkentofuItem = registerItemFood("silkentofuItem", 6,
				config.mealsaturation);
		bamboosteamedriceItem = registerItemFood("bamboosteamedriceItem", 6,
				config.mealsaturation);
		roastedchestnutItem = registerItemFood("roastedchestnutItem", 4,
				config.snacksaturation);
		sweetpotatosouffleItem = registerItemFood("sweetpotatosouffleItem", 6,
				config.mealsaturation);
		cashewchickenItem = registerItemFood("cashewchickenItem", 6,
				config.mealsaturation);
		apricotyogurtItem = registerItemFood("apricotyogurtItem", 6,
				config.mealsaturation);
		apricotglazedporkItem = registerItemFood("apricotglazedporkItem", 6,
				config.meatymealsaturation);
		apricotjellyItem = registerItemFood("apricotjellyItem", 5,
				config.mealsaturation);
		apricotjellysandwichItem = registerItemFood("apricotjellysandwichItem",
				10, config.mealsaturation);
		apricotsmoothieItem = registerPotionFood("apricotsmoothieItem", 6,
				config.mealsaturation);
		figbarItem = registerItemFood("figbarItem", 6, config.mealsaturation);
		figjellyItem = registerItemFood("figjellyItem", 5,
				config.mealsaturation);
		figjellysandwichItem = registerItemFood("figjellysandwichItem", 10,
				config.mealsaturation);
		figsmoothieItem = registerPotionFood("figsmoothieItem", 6,
				config.mealsaturation);
		figyogurtItem = registerItemFood("figyogurtItem", 8,
				config.mealsaturation);
		grapefruitjellyItem = registerItemFood("grapefruitjellyItem", 5,
				config.mealsaturation);
		grapefruitjellysandwichItem = registerItemFood(
				"grapefruitjellysandwichItem", 10, config.mealsaturation);
		grapefruitsmoothieItem = registerPotionFood("grapefruitsmoothieItem", 6,
				config.mealsaturation);
		grapefruityogurtItem = registerItemFood("grapefruityogurtItem", 8,
				config.mealsaturation);
		grapefruitsodaItem = registerPotionFood("grapefruitsodaItem", 2,
				config.snacksaturation).addDefaultSpeedPotionEffect();
		citrussaladItem = registerItemFood("citrussaladItem", 6,
				config.mealsaturation);
		pecanpieItem = registerItemFood("pecanpieItem", 6,
				config.mealsaturation);
		pralinesItem = registerItemFood("pralinesItem", 6,
				config.snacksaturation);
		persimmonyogurtItem = registerItemFood("persimmonyogurtItem", 8,
				config.mealsaturation);
		persimmonsmoothieItem = registerPotionFood("persimmonsmoothieItem", 6,
				config.mealsaturation);
		persimmonjellyItem = registerItemFood("persimmonjellyItem", 5,
				config.mealsaturation);
		persimmonjellysandwichItem = registerItemFood(
				"persimmonjellysandwichItem", 10, config.mealsaturation);
		pistachiobakedsalmonItem = registerItemFood("pistachiobakedsalmonItem",
				10, config.mealsaturation);
		baconwrappeddatesItem = registerItemFood("baconwrappeddatesItem", 12,
				config.meatymealsaturation);
		datenutbreadItem = registerItemFood("datenutbreadItem", 7,
				config.mealsaturation);
		maplesyruppancakesItem = registerItemFood("maplesyruppancakesItem", 7,
				config.mealsaturation);
		maplesyrupwafflesItem = registerItemFood("maplesyrupwafflesItem", 7,
				config.mealsaturation);
		maplesausageItem = registerItemFood("maplesausageItem", 1,
				config.meatymealsaturation);
		mapleoatmealItem = registerItemFood("mapleoatmealItem", 6,
				config.mealsaturation);
		peachesandcreamoatmealItem = registerItemFood(
				"peachesandcreamoatmealItem", 8, config.mealsaturation);
		cinnamonappleoatmealItem = registerItemFood("cinnamonappleoatmealItem",
				8, config.mealsaturation);
		maplecandiedbaconItem = registerItemFood("maplecandiedbaconItem", 6,
				config.meatymealsaturation);
		toastsandwichItem = registerItemFood("toastsandwichItem", 8,
				config.mealsaturation);
		potatoandcheesepirogiItem = registerItemFood(
				"potatoandcheesepirogiItem", 6, config.mealsaturation);
		zeppoleItem = registerItemFood("zeppoleItem", 6, config.mealsaturation);
		sausageinbreadItem = registerItemFood("sausageinbreadItem", 18,
				config.meatymealsaturation);
		chocolatecaramelfudgeItem = registerItemFood(
				"chocolatecaramelfudgeItem", 6, config.snacksaturation);
		lavendershortbreadItem = registerItemFood("lavendershortbreadItem", 7,
				config.mealsaturation);
		beefwellingtonItem = registerItemFood("beefwellingtonItem", 18,
				config.meatymealsaturation);
		epicbaconItem = registerItemFood("epicbaconItem", 18,
				config.meatymealsaturation);
		manjuuItem = registerItemFood("manjuuItem", 6, config.mealsaturation);
		chickengumboItem = registerItemFood("chickengumboItem", 16,
				config.meatymealsaturation);
		generaltsochickenItem = registerItemFood("generaltsochickenItem", 12,
				config.meatymealsaturation);
		californiarollItem = registerItemFood("californiarollItem", 7,
				config.meatymealsaturation);
		futomakiItem = registerItemFood("futomakiItem", 9,
				config.meatymealsaturation);
		beansontoastItem = registerItemFood("beansontoastItem", 8,
				config.mealsaturation);
		vegemiteItem = registerItemFood("vegemiteItem", 4,
				config.mealsaturation);
		honeycombchocolatebarItem = registerItemFood(
				"honeycombchocolatebarItem", 8, config.snacksaturation);
		cherrycoconutchocolatebarItem = registerItemFood(
				"cherrycoconutchocolatebarItem", 10, config.snacksaturation);
		fairybreadItem = registerItemFood("fairybreadItem", 5,
				config.snacksaturation);

		timtamItem = registerItemFood("timtamItem", 9, config.snacksaturation);
		meatpieItem = registerItemFood("meatpieItem", 14,
				config.meatymealsaturation);
		chikorollItem = registerItemFood("chikorollItem", 14,
				config.meatymealsaturation);
		damperItem = registerItemFood("damperItem", 7, config.mealsaturation);
		beetburgerItem = registerItemFood("beetburgerItem", 18,
				config.meatymealsaturation);

		gherkinItem = registerItemFood("gherkinItem", 6, config.mealsaturation);
		mcpamItem = registerItemFood("mcpamItem", 16,
				config.meatymealsaturation);
		ceasarsaladItem = registerItemFood("ceasarsaladItem", 10,
				config.mealsaturation);
		chaoscookieItem = registerItemFood("chaoscookieItem", 4,
				config.snacksaturation);
		chocolatebaconItem = registerItemFood("chocolatebaconItem", 10,
				config.meatymealsaturation);
		lambkebabItem = registerItemFood("lambkebabItem", 12,
				config.meatymealsaturation);
		nutellaItem = registerItemFood("nutellaItem", 7,
				config.snacksaturation);
		snickersbarItem = registerItemFood("snickersbarItem", 8,
				config.snacksaturation);
		spinachpieItem = registerItemFood("spinachpieItem", 8,
				config.mealsaturation);
		steamedspinachItem = registerItemFood("steamedspinachItem", 2,
				config.mealsaturation);
		vegemiteontoastItem = registerItemFood("vegemiteontoastItem", 7,
				config.mealsaturation);
		registerFish();

		clamcookedItem = registerItemFood("clamcookedItem", 2,
				config.meatymealsaturation);
		crabcookedItem = registerItemFood("crabcookedItem", 2,
				config.meatymealsaturation);
		crayfishcookedItem = registerItemFood("crayfishcookedItem", 2,
				config.meatymealsaturation);
		frogcookedItem = registerItemFood("frogcookedItem", 2,
				config.meatymealsaturation);
		octopuscookedItem = registerItemFood("octopuscookedItem", 2,
				config.meatymealsaturation);
		scallopcookedItem = registerItemFood("scallopcookedItem", 2,
				config.meatymealsaturation);
		shrimpcookedItem = registerItemFood("shrimpcookedItem", 2,
				config.meatymealsaturation);
		snailcookedItem = registerItemFood("snailcookedItem", 2,
				config.meatymealsaturation);
		turtlecookedItem = registerItemFood("turtlecookedItem", 2,
				config.meatymealsaturation);
		appleciderItem = registerItemFood("appleciderItem", 6,
				config.mealsaturation);
		bangersandmashItem = registerItemFood("bangersandmashItem", 12,
				config.meatymealsaturation);
		batteredsausageItem = registerItemFood("batteredsausageItem", 10,
				config.meatymealsaturation);
		batterItem = registerGenericItem("batterItem");
		chorizoItem = registerItemFood("chorizoItem", 10,
				config.meatymealsaturation);
		coleslawItem = registerItemFood("coleslawItem", 7,
				config.mealsaturation);
		energydrinkItem = registerPotionFood("energydrinkItem", 2,
				config.snacksaturation).addDefaultSpeedPotionEffect();
		friedonionsItem = registerItemFood("friedonionsItem", 4,
				config.mealsaturation);
		meatfeastpizzaItem = registerItemFood("meatfeastpizzaItem", 18,
				config.meatymealsaturation);
		mincepieItem = registerItemFood("mincepieItem", 12,
				config.meatymealsaturation);
		onionhamburgerItem = registerItemFood("onionhamburgerItem", 10,
				config.meatymealsaturation);
		pepperoniItem = registerItemFood("pepperoniItem", 10,
				config.meatymealsaturation);
		pickledonionsItem = registerItemFood("pickledonionsItem", 7,
				config.mealsaturation);
		porksausageItem = registerItemFood("porksausageItem", 8,
				config.meatymealsaturation);
		raspberrytrifleItem = registerItemFood("raspberrytrifleItem", 8,
				config.mealsaturation);

		pumpkinmuffinItem = registerItemFood("pumpkinmuffinItem", 8,
				config.mealsaturation);
		suaderoItem = registerItemFood("suaderoItem", 10,
				config.mealsaturation);
		randomtacoItem = registerItemFood("randomtacoItem", 16,
				config.mealsaturation);
		turkeyrawItem = registerItemFood("turkeyrawItem", 2,
				config.snacksaturation);
		turkeycookedItem = registerItemFood("turkeycookedItem", 5,
				config.meatymealsaturation);
		venisonrawItem = registerItemFood("venisonrawItem", 3,
				config.snacksaturation);
		venisoncookedItem = registerItemFood("venisoncookedItem", 8,
				config.meatymealsaturation);
		strawberrymilkshakeItem = registerItemFood("strawberrymilkshakeItem", 6,
				config.mealsaturation);
		chocolatemilkshakeItem = registerItemFood("chocolatemilkshakeItem", 6,
				config.mealsaturation);
		bananamilkshakeItem = registerItemFood("bananamilkshakeItem", 6,
				config.mealsaturation);
		cornflakesItem = registerItemFood("cornflakesItem", 8,
				config.mealsaturation);
		coleslawburgerItem = registerItemFood("coleslawburgerItem", 12,
				config.meatymealsaturation);
		roastchickenItem = registerItemFood("roastchickenItem", 9,
				config.meatymealsaturation);
		roastpotatoesItem = registerItemFood("roastpotatoesItem", 6,
				config.mealsaturation);
		sundayroastItem = registerItemFood("sundayroastItem", 14,
				config.meatymealsaturation);
		bbqpulledporkItem = registerItemFood("bbqpulledporkItem", 12,
				config.meatymealsaturation);
		lambwithmintsauceItem = registerItemFood("lambwithmintsauceItem", 11,
				config.meatymealsaturation);
		steakandchipsItem = registerItemFood("steakandchipsItem", 12,
				config.meatymealsaturation);
		cherryicecreamItem = registerItemFood("cherryicecreamItem", 9,
				config.mealsaturation);
		pistachioicecreamItem = registerItemFood("pistachioicecreamItem", 9,
				config.mealsaturation);
		neapolitanicecreamItem = registerItemFood("neapolitanicecreamItem", 9,
				config.mealsaturation);
		spumoniicecreamItem = registerItemFood("spumoniicecreamItem", 9,
				config.mealsaturation);
		almondbutterItem = registerItemFood("almondbutterItem", 5,
				config.mealsaturation);
		cashewbutterItem = registerItemFood("cashewbutterItem", 5,
				config.mealsaturation);
		chestnutbutterItem = registerItemFood("chestnutbutterItem", 5,
				config.mealsaturation);
		cornishpastyItem = registerItemFood("cornishpastyItem", 12,
				config.meatymealsaturation);
		cottagepieItem = registerItemFood("cottagepieItem", 12,
				config.meatymealsaturation);
		croissantItem = registerItemFood("croissantItem", 7,
				config.mealsaturation);
		currypowderItem = registerGenericItem("currypowderItem");
		dimsumItem = registerItemFood("dimsumItem", 12,
				config.meatymealsaturation);
		friedpecanokraItem = registerItemFood("friedpecanokraItem", 6,
				config.mealsaturation);
		gooseberryjellyItem = registerItemFood("gooseberryjellyItem", 5,
				config.mealsaturation);
		gooseberryjellysandwichItem = registerItemFood(
				"gooseberryjellysandwichItem", 10, config.mealsaturation);
		gooseberrymilkshakeItem = registerItemFood("gooseberrymilkshakeItem", 6,
				config.mealsaturation);
		gooseberrypieItem = registerItemFood("gooseberrypieItem", 8,
				config.mealsaturation);
		gooseberrysmoothieItem = registerItemFood("gooseberrysmoothieItem", 6,
				config.mealsaturation);
		gooseberryyogurtItem = registerItemFood("gooseberryyogurtItem", 8,
				config.mealsaturation);
		hamsweetpicklesandwichItem = registerItemFood(
				"hamsweetpicklesandwichItem", 10, config.meatymealsaturation);
		hushpuppiesItem = registerItemFood("hushpuppiesItem", 6,
				config.mealsaturation);
		kimchiItem = registerItemFood("kimchiItem", 10, config.mealsaturation);
		mochiItem = registerItemFood("mochiItem", 3, config.snacksaturation);
		museliItem = registerItemFood("museliItem", 7, config.mealsaturation);
		naanItem = registerItemFood("naanItem", 6, config.mealsaturation);
		okrachipsItem = registerItemFood("okrachipsItem", 5,
				config.mealsaturation);
		okracreoleItem = registerItemFood("okracreoleItem", 8,
				config.meatymealsaturation);
		pistachiobutterItem = registerItemFood("pistachiobutterItem", 5,
				config.mealsaturation);
		ploughmanslunchItem = registerItemFood("ploughmanslunchItem", 14,
				config.meatymealsaturation);
		porklomeinItem = registerItemFood("porklomeinItem", 14,
				config.meatymealsaturation);
		salmonpattiesItem = registerItemFood("salmonpattiesItem", 12,
				config.meatymealsaturation);
		sausageItem = registerItemFood("sausageItem", 6,
				config.meatymealsaturation);
		sausagerollItem = registerItemFood("sausagerollItem", 10,
				config.meatymealsaturation);
		sesameballItem = registerItemFood("sesameballItem", 6,
				config.mealsaturation);
		sesamesnapsItem = registerItemFood("sesamesnapsItem", 3,
				config.snacksaturation);
		shrimpokrahushpuppiesItem = registerItemFood(
				"shrimpokrahushpuppiesItem", 10, config.meatymealsaturation);
		soysauceItem = registerGenericItem("soysauceItem");
		sweetpickleItem = registerItemFood("sweetpickleItem", 7,
				config.mealsaturation);
		veggiestripsItem = registerItemFood("veggiestripsItem", 6,
				config.mealsaturation);
		vindalooItem = registerItemFood("vindalooItem", 10,
				config.meatymealsaturation);
		applesmoothieItem = registerItemFood("applesmoothieItem", 6,
				config.mealsaturation);
		coconutsmoothieItem = registerItemFood("coconutsmoothieItem", 6,
				config.mealsaturation);
		cranberrysmoothieItem = registerItemFood("cranberrysmoothieItem", 6,
				config.mealsaturation);
		cranberryyogurtItem = registerItemFood("cranberryyogurtItem", 8,
				config.mealsaturation);
		grapesmoothieItem = registerItemFood("grapesmoothieItem", 6,
				config.mealsaturation);
		pearsmoothieItem = registerItemFood("pearsmoothieItem", 6,
				config.mealsaturation);
		pearjellyItem = registerItemFood("pearjellyItem", 5,
				config.mealsaturation);
		pearjellysandwichItem = registerItemFood("pearjellysandwichItem", 10,
				config.mealsaturation);
		plumsmoothieItem = registerItemFood("plumsmoothieItem", 6,
				config.mealsaturation);
		plumjellyItem = registerItemFood("plumjellyItem", 5,
				config.mealsaturation);
		plumjellysandwichItem = registerItemFood("plumjellysandwichItem", 10,
				config.mealsaturation);
		honeysandwichItem = registerItemFood("honeysandwichItem", 8,
				config.mealsaturation);
		cheeseontoastItem = registerItemFood("cheeseontoastItem", 8,
				config.mealsaturation);
		tunapotatoItem = registerItemFood("tunapotatoItem", 10,
				config.meatymealsaturation);
		chocolaterollItem = registerItemFood("chocolaterollItem", 8,
				config.snacksaturation);
		jamrollItem = registerItemFood("jamrollItem", 8,
				config.snacksaturation);
		coconutcreamItem = registerItemFood("coconutcreamItem", 2,
				config.snacksaturation);
		crackerItem = registerItemFood("crackerItem", 4,
				config.snacksaturation);
		garammasalaItem = registerGenericItem("garammasalaItem");
		paneerItem = registerItemFood("paneerItem", 4, config.mealsaturation);
		deluxechickencurryItem = registerItemFood("deluxechickencurryItem", 18,
				config.meatymealsaturation);
		gravyItem = registerItemFood("gravyItem", 4, config.mealsaturation);
		mangochutneyItem = registerItemFood("mangochutneyItem", 6,
				config.mealsaturation);
		marzipanItem = registerItemFood("marzipanItem", 2,
				config.snacksaturation);
		paneertikkamasalaItem = registerItemFood("paneertikkamasalaItem", 12,
				config.mealsaturation);
		peaandhamsoupItem = registerItemFood("peaandhamsoupItem", 8,
				config.meatymealsaturation);
		potatoandleeksoupItem = registerItemFood("potatoandleeksoupItem", 6,
				config.mealsaturation);
		yorkshirepuddingItem = registerItemFood("yorkshirepuddingItem", 5,
				config.mealsaturation);
		toadintheholeItem = registerItemFood("toadintheholeItem", 10,
				config.meatymealsaturation);

		sesameoilItem = registerGenericItem("sesameoilItem");
		hotandsoursoupItem = registerItemFood("hotandsoursoupItem", 12,
				config.mealsaturation);
		noodlesItem = registerGenericItem("noodlesItem");
		chickenchowmeinItem = registerItemFood("chickenchowmeinItem", 10,
				config.meatymealsaturation);
		kungpaochickenItem = registerItemFood("kungpaochickenItem", 12,
				config.meatymealsaturation);
		hoisinsauceItem = registerGenericItem("hoisinsauceItem");
		fivespiceItem = registerGenericItem("fivespiceItem");
		charsiuItem = registerItemFood("charsiuItem", 12,
				config.meatymealsaturation);
		sweetandsoursauceItem = registerGenericItem("sweetandsoursauceItem");
		sweetandsourchickenItem = registerItemFood("sweetandsourchickenItem",
				10, config.meatymealsaturation);
		baconandeggsItem = registerItemFood("baconandeggsItem", 10,
				config.meatymealsaturation);
		biscuitsandgravyItem = registerItemFood("biscuitsandgravyItem", 8,
				config.mealsaturation);
		applefritterItem = registerItemFood("applefritterItem", 6,
				config.mealsaturation);
		sweetteaItem = registerItemFood("sweetteaItem", 6,
				config.mealsaturation);
		creepercookieItem = registerItemFood("creepercookieItem", 4,
				config.snacksaturation);
		patreonpieItem = registerItemFood("patreonpieItem", 8,
				config.mealsaturation);

		honeybreadItem = registerItemFood("honeybreadItem", 7,
				config.mealsaturation);
		honeybunItem = registerItemFood("honeybunItem", 8,
				config.mealsaturation);
		honeyglazedcarrotsItem = registerItemFood("honeyglazedcarrotsItem", 8,
				config.mealsaturation);
		honeyglazedhamItem = registerItemFood("honeyglazedhamItem", 10,
				config.meatymealsaturation);
		honeysoyribsItem = registerItemFood("honeysoyribsItem", 14,
				config.meatymealsaturation);

		rawtofeakItem = registerItemFood("rawtofeakItem", 3,
				config.snacksaturation);
		rawtofaconItem = registerItemFood("rawtofaconItem", 3,
				config.snacksaturation);
		rawtofishItem = registerItemFood("rawtofishItem", 2,
				config.snacksaturation);
		rawtofeegItem = registerItemFood("rawtofeegItem", 1,
				config.snacksaturation);
		rawtofuttonItem = registerItemFood("rawtofuttonItem", 2,
				config.snacksaturation);
		rawtofickenItem = registerItemFood("rawtofickenItem", 2,
				config.snacksaturation);
		rawtofabbitItem = registerItemFood("rawtofabbitItem", 3,
				config.snacksaturation);
		rawtofurkeyItem = registerItemFood("rawtofurkeyItem", 2,
				config.snacksaturation);
		rawtofenisonItem = registerItemFood("rawtofenisonItem", 3,
				config.snacksaturation);

		cookedtofeakItem = registerItemFood("cookedtofeakItem", 8,
				config.meatymealsaturation);
		cookedtofaconItem = registerItemFood("cookedtofaconItem", 8,
				config.meatymealsaturation);
		cookedtofishItem = registerItemFood("cookedtofishItem", 5,
				config.meatymealsaturation);
		cookedtofeegItem = registerItemFood("cookedtofeegItem", 2,
				config.meatymealsaturation);
		cookedtofuttonItem = registerItemFood("cookedtofuttonItem", 6,
				config.meatymealsaturation);
		cookedtofickenItem = registerItemFood("cookedtofickenItem", 6,
				config.meatymealsaturation);
		cookedtofabbitItem = registerItemFood("cookedtofabbitItem", 5,
				config.meatymealsaturation);
		cookedtofurkeyItem = registerItemFood("cookedtofurkeyItem", 5,
				config.meatymealsaturation);
		cookedtofenisonItem = registerItemFood("cookedtofenisonItem", 8,
				config.meatymealsaturation);

		carrotcakeItem = registerItemPamCakeFood("carrotcakeItem", 8,
				config.mealsaturation, BlockRegistry.carrotcake);
		holidaycakeItem = registerItemPamCakeFood("holidaycakeItem", 10,
				config.mealsaturation, BlockRegistry.holidaycake);
		pumpkincheesecakeItem = registerItemPamCakeFood("pumpkincheesecakeItem",
				12, config.snacksaturation, BlockRegistry.pumpkincheesecake);
		pavlovaItem = registerItemPamCakeFood("pavlovaItem", 10,
				config.mealsaturation, BlockRegistry.pavlovacake);
		lamingtonItem = registerItemPamCakeFood("lamingtonItem", 6,
				config.mealsaturation, BlockRegistry.lamingtoncake);
		cheesecakeItem = registerItemPamCakeFood("cheesecakeItem", 10,
				config.mealsaturation, BlockRegistry.cheesecake);
		cherrycheesecakeItem = registerItemPamCakeFood("cherrycheesecakeItem",
				12, config.snacksaturation, BlockRegistry.cherrycheesecake);
		pineappleupsidedowncakeItem = registerItemPamCakeFood(
				"pineappleupsidedowncakeItem", 10, config.snacksaturation,
				BlockRegistry.pineappleupsidedowncake);
		chocolatesprinklecakeItem = registerItemPamCakeFood(
				"chocolatesprinklecakeItem", 8, config.snacksaturation,
				BlockRegistry.chocolatesprinklecake);
		redvelvetcakeItem = registerItemPamCakeFood("redvelvetcakeItem", 8,
				config.snacksaturation, BlockRegistry.redvelvetcake);

	}

	private static void registerTools() {
		cuttingboardItem = registerItemTool("cuttingboardItem");
		potItem = registerItemTool("potItem");
		skilletItem = registerItemTool("skilletItem");
		saucepanItem = registerItemTool("saucepanItem");
		bakewareItem = registerItemTool("bakewareItem");
		mortarandpestleItem = registerItemTool("mortarandpestleItem");
		mixingbowlItem = registerItemTool("mixingbowlItem");
		juicerItem = registerItemTool("juicerItem");
	}

	private static void registerFish() {
		anchovyrawItem = registerRawFish("anchovyrawItem");
		bassrawItem = registerRawFish("bassrawItem");
		carprawItem = registerRawFish("carprawItem");
		catfishrawItem = registerRawFish("catfishrawItem");
		charrrawItem = registerRawFish("charrrawItem");
		clamrawItem = registerRawFish("clamrawItem");
		crabrawItem = registerRawFish("crabrawItem");
		crayfishrawItem = registerRawFish("crayfishrawItem");
		eelrawItem = registerRawFish("eelrawItem");
		frograwItem = registerRawFish("frograwItem");
		grouperrawItem = registerRawFish("grouperrawItem");
		herringrawItem = registerRawFish("herringrawItem");
		jellyfishrawItem = registerRawFish("jellyfishrawItem");
		mudfishrawItem = registerRawFish("mudfishrawItem");
		octopusrawItem = registerRawFish("octopusrawItem");
		perchrawItem = registerRawFish("perchrawItem");
		scalloprawItem = registerRawFish("scalloprawItem");
		shrimprawItem = registerRawFish("shrimprawItem");
		snailrawItem = registerRawFish("snailrawItem");
		snapperrawItem = registerRawFish("snapperrawItem");
		tilapiarawItem = registerRawFish("tilapiarawItem");
		troutrawItem = registerRawFish("troutrawItem");
		tunarawItem = registerRawFish("tunarawItem");
		turtlerawItem = registerRawFish("turtlerawItem");
		walleyerawItem = registerRawFish("walleyerawItem");
		greenheartfishItem = registerRawFish("greenheartfishItem");
	}

	private static void registerJuices() {
		applejuiceItem = registerJuice("applejuiceItem");
		melonjuiceItem = registerJuice("melonjuiceItem");
		carrotjuiceItem = registerJuice("carrotjuiceItem");
		strawberryjuiceItem = registerJuice("strawberryjuiceItem");
		grapejuiceItem = registerJuice("grapejuiceItem");
		blueberryjuiceItem = registerJuice("blueberryjuiceItem");
		cherryjuiceItem = registerJuice("cherryjuiceItem");
		papayajuiceItem = registerJuice("papayajuiceItem");
		starfruitjuiceItem = registerJuice("starfruitjuiceItem");
		orangejuiceItem = registerJuice("orangejuiceItem");
		peachjuiceItem = registerJuice("peachjuiceItem");
		limejuiceItem = registerJuice("limejuiceItem");
		mangojuiceItem = registerJuice("mangojuiceItem");
		pomegranatejuiceItem = registerJuice("pomegranatejuiceItem");
		blackberryjuiceItem = registerJuice("blackberryjuiceItem");
		raspberryjuiceItem = registerJuice("raspberryjuiceItem");
		kiwijuiceItem = registerJuice("kiwijuiceItem");
		cranberryjuiceItem = registerJuice("cranberryjuiceItem");
		cactusfruitjuiceItem = registerJuice("cactusfruitjuiceItem");
		plumjuiceItem = registerJuice("plumjuiceItem");
		pearjuiceItem = registerJuice("pearjuiceItem");
		apricotjuiceItem = registerJuice("apricotjuiceItem");
		figjuiceItem = registerJuice("figjuiceItem");
		grapefruitjuiceItem = registerJuice("grapefruitjuiceItem");
		persimmonjuiceItem = registerJuice("persimmonjuiceItem");
	}

	private static Item registerItemTool(String registryName) {
		final ItemPamTool item = new ItemPamTool();
		item.setContainerItem(item);

		return registerItem(item, registryName);
	}

	private static Item registerItemArmor(String registryName,
			EntityEquipmentSlot slot) {
		final ItemPamHardenedLeatherArmor item = new ItemPamHardenedLeatherArmor(
				slot);

		return registerItem(item, registryName);
	}

	private static Item registerItemFood(String registryName, int amount,
			float saturation) {
		final Item item = new ItemPamFood(amount, saturation);
		allFood.add(item);

		return registerItem(item, registryName);
	}

	private static Item registerItemPamCakeFood(String registryName, int amount,
			float saturation, BlockPamCake blockpamcake) {
		final Item item = new ItemPamCakeFood(amount, saturation, initialized,
				blockpamcake);
		allFood.add(item);

		return registerItem(item, registryName);
	}

	private static Item registerJuice(String juiceName) {
		final Item juiceItem = registerPotionFood(juiceName, 5,
				config.mealsaturation);
		allJuice.add(juiceItem);

		return juiceItem;
	}

	private static Item registerRawFish(String fishName) {
		final Item fishItem = registerItemFood(fishName, 2,
				config.meatymealsaturation);

		allFishRaw.add(fishItem);

		return fishItem;
	}

	private static Item registerGenericItem(String registryName) {
		final Item item = new Item();

		return registerItem(item, registryName);
	}

	private static ItemPamPotionFood registerPotionFood(String registryName,
			int amount, float saturation) {
		final Item item = new ItemPamPotionFood(amount, saturation, false);

		return (ItemPamPotionFood) registerItem(item, registryName);
	}

	public static Item registerItem(Item item, String registryName) {
		item.setCreativeTab(HarvestCraft.modTab);
		item.setRegistryName(registryName);
		item.setUnlocalizedName(registryName);

		items.put(registryName, item);

		return GameRegistry.register(item);
	}

	// private static ItemArmor.ArmorMaterial addArmorMaterial(String enumName,
	// String textureName, int durability, int[] reductionAmounts,
	// int enchantability, SoundEvent soundOnEquip, float toughness) {
	// return EnumHelper.addEnum(ItemArmor.ArmorMaterial.class, enumName,
	// new Class<?>[] { String.class, int.class, int[].class,
	// int.class, SoundEvent.class, float.class },
	// textureName, durability, reductionAmounts, enchantability,
	// soundOnEquip, toughness);
	// }
}
