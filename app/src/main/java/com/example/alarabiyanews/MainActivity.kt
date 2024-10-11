package com.example.alarabiyanews

import android.os.Bundle 
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        // Sample data
        val items = listOf(
            Item("https://vid.alarabiya.net/images/2022/02/02/476bfd3e-d9dc-4a15-9a50-37fff7269575/476bfd3e-d9dc-4a15-9a50-37fff7269575_16x9_1200x676.JPG?width=434&format=jpg","How Middle East tensions are driving oil market volatility","Energy","2 days ago","Iran’s missile attack on Israel has heightened geopolitical risk in the Middle East, causing global oil prices to rise amid fears of supply disruptions.\n" +
                    "\n" +
                    "US crude oil prices surged about 5 percent on Thursday, posting a third consecutive session of gains. Prices continued to rise on Friday and were on track for strong weekly gains.\n" +
                    "\n" +
                    "Brent crude futures were up 55 cents, or 0.7 percent, at \$78.17 a barrel, as of 8:31 GMT. US West Texas Intermediate crude futures were up 50 cents, also 0.7 percent, at \$74.21 a barrel.\n" +
                    "\n" +
                    "For the latest updates on the Israel-Palestine conflict, visit our dedicated page.\n" +
                    "\n" +
                    "On Tuesday, Iran launched almost 200 ballistic missiles toward Israel, marking a sharp escalation in their long-standing conflict.\n" +
                    "\n" +
                    "This came as retaliation for Israeli airstrikes that targeted Hamas political leader Ismail Haniyeh, who was killed in an explosion in Tehran in July, and Hezbollah leader Hassan Nasrallah along with Iran Revolutionary Guards’ deputy commander Abbas Nilforoushan, who were assassinated last week in Beirut’s southern suburbs.\n" +
                    "\n" +
                    "It was Iran’s second such attack on Israel this year, after it unleashed around 300 missiles and drones in April.\n" +
                    "\n" +
                    "Israel and the United States have vowed retribution for the attack, signaling an intensification of the conflict that could destabilize the region and impact global oil markets.\n" +
                    "\n" +
                    "Iran, an OPEC member, produces around 3.2 million barrels per day, accounting for roughly 3 percent of global output. Israel’s military capabilities could pose a direct threat to Iran’s energy infrastructure.\n" +
                    "\n" +
                    "Despite US sanctions, Iranian oil exports have surged this year to near multi-year highs of 1.7 million barrels per day, with Chinese refiners being the primary buyers. China has maintained that it does not recognize unilateral US sanctions.\n" +
                    "\n" +
                    "Oil price volatility and market dynamics\n" +
                    "Historically, Middle Eastern crises have had profound effects on oil prices. The region accounts for a substantial portion of global crude output.\n" +
                    "\n" +
                    "Ole Hansen, head of Commodity Strategy at Saxo Bank, explained that while geopolitical flare-ups often drive short-term price spikes, long-term highs depend on the conflict’s severity and duration.\n" +
                    "\n" +
                    "“Key drivers of volatility include the risk of a broader conflict involving major producers, potential disruption to oil infrastructure and OPEC+ intervention,” he told Al Arabiya English.\n" +
                    "\n" +
                    "“Additionally, a weak global demand outlook may cap how far prices can climb. Without substantial supply disruptions or a geopolitical event triggering extended uncertainty, oil prices are more likely to hover in a higher range rather than skyrocket to new extremes.”\n" +
                    "\n" +
                    "Oil demand has weakened due to a global economic slowdown, particularly in China, the world’s largest consumer, where efforts to boost activity have struggled amid a property crisis impacting consumer spending. European industry is also in decline, with recent data showing a sharp drop in factory output.\n" +
                    "\n" +
                    "Analysts argue that while traders and speculators will profit from short-term fluctuations, ample supply from OPEC+ countries and China’s economic weakness are keeping prices in check.\n" +
                    "\n" +
                    "“This is more about geopolitics than an actual supply crisis,” said Yousef M. Alshammari, president of London College of Energy Economics.\n" +
                    "\n" +
                    "The Strait of Hormuz in focus\n" +
                    "A prolonged conflict could present serious risks to global oil supplies. There are concerns that such escalation could prompt Iran to block the Strait of Hormuz.\n" +
                    "\n" +
                    "The strait is a key logistical chokepoint through which a fifth of daily oil supply passes. It’s a critical artery for oil exports from Iran, Iraq, Saudi Arabia, Kuwait and the UAE.\n" +
                    "\n" +
                    "“The closure of the Strait of Hormuz or even a temporary disruption would send shockwaves through global energy markets, increasing prices and creating supply bottlenecks,” stressed Hansen.\n" +
                    "\n" +
                    "“However, the response from OPEC+, including key producers, will be crucial in stabilizing supply, with strategic reserves possibly tapped to manage short-term disruptions. Still, with the Middle East’s central role in global energy, ongoing geopolitical risks make the oil market highly susceptible to further price swings, keeping investors on edge.”\n" +
                    "\n" +
                    "OPEC has sufficient spare oil capacity to offset a complete loss of Iranian supply if Israeli strikes take out the country’s oil facilities. However, the producer group would face challenges if Iran retaliates by hitting installations of its Gulf neighbors.\n" +
                    "\n" +
                    "Ministers from Gulf Arab states and Iran attended a meeting of Asian nations hosted by Qatar to discuss de-escalating hostilities between Israel and Iran, three sources told Reuters on Thursday.\n" +
                    "\n" +
                    "The Gulf Arab states sought to reassure Iran of their neutrality in the conflict on concerns that further violence could threaten Gulf oil facilities, two of the sources said.\n" +
                    "\n" +
                    "“The potential for an extended conflict destabilizing key oil supply routes, particularly through the Strait of Hormuz, is a concern, but not in Iran’s interest,” said Alshammari. “We’ve seen attacks on oil tankers in the past during the Saudi-Houthi conflict, but the rapprochement between Saudi Arabia and Iran has stabilized the region. Disrupting the strait would harm the entire region’s economic security, something Iran wishes to avoid, as it wants to keep relations stable.”\n" +
                    "\n" +
                    "“While tensions between Israel and Iran could spark market volatility, a direct military confrontation is unlikely, though risks to Iranian oil and nuclear sites remain unpredictable,” he added.\n" +
                    "\n" +
                    "Geopolitical leverage and strategic calculus\n" +
                    "Israeli officials may be minimizing the impact of Iran’s attack. Though only one death was reported, this assault caused more damage than Iran’s earlier barrage in April.\n" +
                    "\n" +
                    "Analysts suggest Israel has four potential options for retaliating: targeting Iran’s oil production facilities, striking symbols of the regime, attacking senior Iranian government officials or hitting nuclear infrastructure.\n" +
                    "\n" +
                    "For all the latest headlines follow our Google News channel online or via the app.\n" +
                    "\n" +
                    "Tehran might be betting that the US will be reluctant to see oil prices rise too high, particularly with presidential elections just a month away.\n" +
                    "\n" +
                    "Neil Quilliam, associate fellow with the Middle East and North Africa Program at the UK-based Chatham House think tank, said this could limit Israel’s choice of targets but would not deter its resolve to strike critical Iranian assets.\n" +
                    "\n" +
                    "“Israel is unlikely to directly target Iran’s key oil infrastructure due to its global impact,” he told Al Arabiya English. “Instead, Israel is more likely to focus on military and intelligence assets, as well as Iran’s power and communications infrastructure, with senior Iranian leaders potentially in the crosshairs, similar to Hezbollah’s.”\n" +
                    "\n" +
                    "Asked on Thursday if he would support Israel striking Iran’s oil facilities, US President Joe Biden told reporters “we’re discussing that.”\n" +
                    "\n" +
                    "Questions are emerging about how Iran might leverage oil markets as part of its broader geopolitical strategy amid escalating tensions.\n" +
                    "\n" +
                    "“Iran could utilize proxy forces, such as the Houthis, to intensify attacks on oil tankers passing through the Bab al-Mandab Strait, raising the risk premium,” noted Quilliam.\n" +
                    "\n" +
                    "“It could also encourage the Houthis to threaten Gulf states’ energy infrastructure, aiming to raise the group’s profile now that Hezbollah has been weakened, while simultaneously maintaining plausible deniability.”"),
            Item("https://vid.alarabiya.net/images/2023/11/22/58ff6663-7890-4678-ab69-da93ad814697/58ff6663-7890-4678-ab69-da93ad814697_16x9_1200x676.JPG?width=434&format=jpg","UAE energy minister says OPEC+ doing ‘noble’ job of balancing oil market ","Energy","5 days ago","United Arab Emirates energy minister Suhail al-Mazrouei said on Wednesday OPEC+ was doing a “noble” job of balancing the oil market even if does not produce the majority of oil in the world.\n" +
                    "\n" +
                    "“OPEC+ has sacrificed more than others but the critical element is that it is staying together,” Mazrouei said at an industry event in the emirate of Fujairah.\n" +
                    "\n" +
                    "For all the latest headlines follow our Google News channel online or via the app.\n" +
                    "\n" +
                    "Mazrouei would not comment on the short term outlook for oil in 2025, saying that there were many moving parts including geopolitics.\n" +
                    "\n" +
                    "Oil prices jumped by over a dollar on Wednesday due to rising concerns Middle East tensions could escalate, potentially disrupting crude output from the region, following Iran’s biggest ever military blow against Israel. Brent crude stood at \$74.56 a barrel at 0330 GMT.\n" +
                    "\n" +
                    "Top ministers from the Organization of the Petroleum Exporting Countries and allies led by Russia, or OPEC+ as the group is known, will hold an online joint ministerial monitoring committee (JMMC) meeting on Wednesday at 1200 GMT.\n" +
                    "\n" +
                    "Oil prices have fallen in 2024, with Brent crude last month slipping below \$70 a barrel for the first time since 2021, pressured by concern about global demand and rising supply outside OPEC+.\n" +
                    "\n" +
                    "OPEC+ has cut output by around 5.7 percent of global demand in a series of steps agreed since late 2022.\n" +
                    "\n" +
                    "The JMMC meeting on Wednesday is unlikely to recommend any changes to a current plan to start unwinding some cuts from December, five sources from the producer group told Reuters."),
            Item("https://vid.alarabiya.net/images/2024/10/01/bca47216-1d13-4016-9a79-9b5f6ec64aae/bca47216-1d13-4016-9a79-9b5f6ec64aae_16x9_1200x676.png?width=434&format=jpg","Former Russian PM Kasyanov: ‘Putin’s regime’ can’t survive any oil price","Energy","5 day ago","Former Russian Prime Minister Mikhail Kasyanov challenged statements made by Russian Deputy Prime Minister Alexander Novak on Russia being able to survive through any oil price.\n" +
                    "\n" +
                    "In an exclusive interview on Saturday, Novak told Al Arabiya News that Russia’s economy was growing despite lower oil revenues and the ongoing conflict in the Middle East.\n" +
                    "\n" +
                    "For all the latest headlines follow our Google News channel online or via the app.\n" +
                    "\n" +
                    "“We can live through any price,” the deputy prime minister said.\nIn a discussion with Al Arabiya News presenter Hadley Gamble at the Warsaw Security Forum on Tuesday, Kasyanov said that Novak couldn’t make any comments other than assuring that Russia’s economy is strong.\n" +
                    "\n" +
                    "“I think he’s right that Russia can exist with any oil price, but not Putin’s regime,” Kasyanov said referring to Russian President Vladimir Putin. “That’s a completely different story. And this vice Prime minister…he simply lives in the totalitarian regime. He cannot say anything [that is contrary] to the major position of the president.”\n" +
                    "\n" +
                    "Kasyanov, who served as a prime minister of Russia from 2000 to 2004, said that “the aspect of oil prices is crucial” to the Russian budget as well as to Moscow’s “financial stability.”\n" +
                    "\n" +
                    "He noted that Russia’s focus on military expenditure to keep the conflict in Ukraine ongoing can eventually exhaust it.\n" +
                    "\n" +
                    "“If two factors work simultaneously: The necessity to increase further military expenditure and the decrease of revenue coming into just like for the price of \$40 per barrel, it means…that by the end of 2025, they [will] have no resources, no external funding, no internal funding for deficit. And the budgetary result will exhaust.”\n" +
                    "\n" +
                    "During his interview with Al Arabiya News, Novak said that Russia’s “economy grew by more than 3 percent,” saying that it was “more than the average in the world, more than Europe, than the US.”\n" +
                    "\n" +
                    "Kasyanov, however, said what matters is the “quality” of this growth.\n" +
                    "\n" +
                    "“The quality of this growth [is] military-[focused]. You produce tanks today [but] tomorrow [they] disappear. It’s nothing for the economy.”"),
            Item("https://vid.alarabiya.net/images/2024/09/30/05e42737-d131-402d-8817-0306c3304fb1/05e42737-d131-402d-8817-0306c3304fb1_16x9_1200x676.jpg?width=434&format=jpg",
                "Russia says it can ‘live through any price’ as pressure on oil market mounts",
                "Energy",
                "1 week ago",
                "Alexander Novak, Deputy Prime Minister and a key architect of OPEC+, tells Al Arabiya News’ Hadley Gamble that Russia’s economy is growing despite lower oil revenues and conflict in the Middle East.\n" +
                        "\n" +
                        "For all the latest headlines follow our Google News channel online or via the app.\n" +
                        "\n" +
                        "“Last year, the economy grew by more than 3 percent. It’s actually more than the average in the world, more than Europe, than the US. This year, in seven months, the terms of growth is 4.4 percent,” Novak said, pushing back on the notion that a prolonged period of low prices could penalize Russia in a way that Western-backed sanctions have failed to do.\n" +
                        "\n" +
                        "“It's a record-breaking [number] of sanctions. I mean we don't even count them anymore,” he quipped.\n" +
                        "\n" +
                        "He also acknowledged the different opinions on economic forecasts.\n" +
                        "\n" +
                        "“Each economist has their own opinion,” he said. “…we hear different opinions on the economy…they just adapt their forecasts to the facts.”\n" +
                        "\n" +
                        "In February, Reuters reported the war had cost Russia an expected \$1.3 trillion in previously anticipated economic growth through 2026. Western sanctions had already forced Russia to sell it’s biggest export at a discount; prices today mean the country’s revenues from oil are falling even further.\n" +
                        "\n" +
                        "“We can live through any price,” the deputy prime minister said.\n" +
                        "\n" +
                        "Asked what impact Hassan Nasrallah’s death will have on price, Novak told Gamble the Middle East is already factored in.\n" +
                        "\n" +
                        "“The events occurring here and now in the Middle East are affecting the market, definitely,” the former energy minister told Gamble on the sidelines of Russia Energy Week in Moscow. “But we can often see that...when there is a moment when it is affecting [the price] rather drastically...it becomes a part of the baseline.”\n" +
                        "\n" +
                        "Last week US oil posted a weekly loss amidst softened demand from China and a report in the Financial Times that Saudi Arabia plans to drop its \$100 crude target in a bid to win back market share.\n" +
                        "\n" +
                        "“In recent weeks the prices have been volatile,” admits Novak. “[But] I think things are going to get back to normal.”\n" +
                        "\n" +
                        "On the continuation of Russia’s role in OPEC+, Novak says it will likely continue beyond 2025 despite current price pressure.\n" +
                        "\n" +
                        "“Everything is based on the agreements we have here and now,” Novak told Gamble. “We will see how the situation develops in the markets. Probably we will decide to prolong our relations restricting development on this level or that level.”\n" +
                        "\n" +
                        "And with just 35 days left until America elects a new president, the prospect that more barrels could enter the market by early 2025 cannot be dismissed. Former US President Donald Trump has made no secret of the fact that he wants to push America toward “energy dominance” in record time.\n" +
                        "\n" +
                        "“We don't know how things are going to turn out after the election, who is going to be elected. It's hard to say here and now,” Novak told Al Arabiya News. “Of course, it’s going to influence the general balance, the overall balance…[but] we are always ready to work with any country.”"),
            Item("https://vid.alarabiya.net/images/2020/11/17/0fade60a-36d7-4dd4-b78f-2b9e5e622522/0fade60a-36d7-4dd4-b78f-2b9e5e622522_16x9_1200x676.JPG?width=335&format=jpg",
                "Can Saudi Arabia’s solar manufacturing initiative be a game changer?",
                "Energy",
                "18 sep 2024",
                "Saudi Arabia seeks to position itself as a player in the global renewable energy sector with an ambitious goal of sourcing 50 percent of its electricity from renewables by 2030. This commitment includes a substantial investment in solar energy, leveraging the country’s abundant sunlight.\n" +
                        "\n" +
                        "By the end of the decade, Saudi Arabia plans to generate 58.7 gigawatts (GW) of renewable energy, including 40 GW from solar photovoltaics (PV), 16 GW from wind energy and 2.7 GW from concentrated solar power.\n" +
                        "\n" +
                        "For more Saudi news, visit our dedicated page.\n" +
                        "\n" +
                        "The Kingdom’s solar manufacturing initiative, a key component of its Vision 2030, aims to diversify its economy and energy sector away from oil dependence.\n" +
                        "\n" +
                        "Saudi Arabia is actively developing its solar power capacity through various projects.\n" +
                        "\n" +
                        "In July, the Kingdom’s Public Investment Fund (PIF) announced partnerships with China’s JinkoSolar and TCL Zhonghuan, leading producers of solar modules and silicon wafers, along with wind turbine manufacturer Envision Energy.\n" +
                        "\n" +
                        "These collaborations will introduce 30GW of solar PV manufacturing capacity – from ingots to modules – to Saudi Arabia, supporting the goal of localizing 75 percent of renewable energy components by 2030, as outlined in the National Renewable Energy Program.\n" +
                        "\n" +
                        "The move not only aligns with Saudi Arabia’s sustainability targets but also responds to global trade dynamics, with major Chinese clean-energy firms expanding their production amid increasing trade barriers in the US and Europe and fierce competition at home.\n" +
                        "\n" +
                        "Saudi Arabia’s solar edge: Purity and cost\n" +
                        "\n" +
                        "Energy experts suggest that Saudi Arabia is transitioning toward a post-oil era by investing in the solar PV industry. The Kingdom’s rich solar resources and access to raw materials for PV panel production enable it to cater to renewable energy needs while gradually reducing its reliance on traditional energy sources.\n" +
                        "\n" +
                        "“Solar PV panels are primarily made from silica sand, and Saudi Arabia possesses some of the highest purity silica globally, with a purity level of 99.7 percent,” Faisal Faeq, energy adviser with previous roles at Saudi Aramco and the OPEC Secretariat, told Al Arabiya English.\n" +
                        "\n" +
                        "“Saudi Arabia already produces a vast amount of silica, holding about 6 percent of global reserves. Notably, the silica required for solar PV will be supplied at no cost, supported by the Kingdom’s extensive supply chains. The high purity of Saudi silica, available in large quantities and requiring minimal processing, offers a strong advantage. However, establishing an industrial base is needed to convert this resource into solar PV products.”\n" +
                        "\n" +
                        "Solar PV manufacturing involves the production and assembly of components used in solar panels, such as wafers, cells, encapsulants, glass, backsheets, junction boxes, connectors and frames. This process includes creating high-purity silicon, forming it into wafers, and assembling these wafers into solar cells and modules. The goal is to convert sunlight into electricity efficiently and sustainably.\n" +
                        "\n" +
                        "Saudi Arabia’s competitive edge in the solar PV market is further emphasized by its cost-effective production capabilities.\n" +
                        "\n" +
                        "“Saudi Arabia’s low production costs, compared to other markets, are crucial for achieving its goal of becoming a leading solar PV manufacturer,” said Yousef M. Alshammari, CEO and head of energy strategy at the London-based global energy research consultancy CMarkits.\n" +
                        "\n" +
                        "Investment opportunities and challenges\n" +
                        "\n" +
                        "Saudi Arabia’s location at the intersection of Europe, Africa and Asia provides a logistical advantage. The proximity to key markets contributes to diversifying the global solar supply chain. As the Kingdom develops its solar manufacturing sector, it offers a cost-effective production base with enhanced export access, making it a compelling destination for international investors.\n" +
                        "\n" +
                        "This diversification may offer new sourcing options beyond traditional hubs such as China and Germany and mitigate supply risks.\n" +
                        "\n" +
                        "China currently dominates the global solar PV market, accounting for over 80 percent of the market share in all stages of production. Similarly, Germany is a significant player in the global solar PV market, particularly in Europe. Despite its less favorable climate for solar energy, Germany ranks among the world’s leading solar power producers and is renowned for its advanced research in the field.\n" +
                        "\n" +
                        "Although challenging, analysts assert that Saudi Arabia’s competition with established solar hubs remains within reach.\n" +
                        "\n" +
                        "“In the medium to long term, Saudi Arabia’s emergence as a major solar panel manufacturer could challenge the market shares of traditional suppliers,” Faeq said. The Kingdom’s strategic geographic location provides an important benefit, facilitating proximity to large renewable energy projects in the region and reducing shipping times. Once the solar PV industry is firmly established, Saudi Arabia’s extensive experience in meeting energy demands could translate into success in the renewable sector as well.”\n" +
                        "\n" +
                        "Despite the optimistic prospects, Saudi Arabia may encounter hurdles in expanding its solar manufacturing sector, with securing adequate demand being the foremost challenge.\n" +
                        "\n" +
                        "“Investors in renewable energy need to be confident that there is a robust market for their products,” Alshammari said . “While there is local demand, the main focus is on exporting solar panels. Therefore, securing international clients and offering incentives to private investors are fundamental. Also, establishing long-term contracts with customers in regions such as Asia, Europe or America is essential for scaling up the industry effectively.”"),
            Item("https://vid.alarabiya.net/images/2023/07/15/23a787a8-27b2-47e6-9ea1-59503ba18747/23a787a8-27b2-47e6-9ea1-59503ba18747_16x9_1200x676.JPG?width=335&format=jpg",
                "Libya oil exports plunge as National Oil Corporation cancels cargoes",
                "Energy",
                "11 sep 2024",
                "Libyan oil exports fell around 81 percent last week, Kpler data showed, as the National Oil Corporation cancelled cargoes amid a crisis over control of Libya’s central bank and oil revenue.\n" +
                        "\n" +
                        "The standoff began last month when western Libyan factions moved to oust a veteran central bank governor, prompting eastern factions to declare a shutdown to all oil output.\n" +
                        "\n" +
                        "For all the latest headlines, follow our Google News channel online or via the app.\n" +
                        "\n" +
                        "Libyan ports shipped 194,000 barrels per day (bpd) on average of crude last week, down about 81 percent from just over 1 million bpd in the previous week, Kpler’s data showed.\n" +
                        "\n" +
                        "Although Libya’s two legislative bodies said last week they agreed to jointly appoint a central bank governor within 30 days, the situation remains fluid and uncertain.\n" +
                        "\n" +
                        "The United Nations Support Mission in Libya (UNSMIL), which is attempting to defuse the crisis, said on Tuesday it would resume facilitating talks on Wednesday in Tripoli.\n" +
                        "\n" +
                        "NOC, which manages Libya’s fossil fuel resources, has not declared force majeure on all port loadings and has so far opted to use the measure on individual cargoes, trading sources with knowledge of the matter said.\n" +
                        "\n" +
                        "The state-owned oil firm did not immediately respond to a request for comment on Wednesday.\n" +
                        "\n" +
                        "It had declared force majeure on all crude production at El Feel oilfield on Sept. 2 and on exports from the Sharara field on Aug. 7, before the crisis over the central bank began.\n" +
                        "\n" +
                        "NOC last week cancelled several Es Sider cargoes, Reuters reported and two trading sources told Reuters NOC has also cancelled cargoes of the Amna and Brega crude grades.\n" +
                        "\n" +
                        "Some tankers have been allowed to load crude from storage at Libyan ports to fulfil contractual obligations and avoid financial penalties, an NOC source has told Reuters.\n" +
                        "\n" +
                        "NOC said on Aug. 28 that oil production had dropped by more than half from typical levels to about 590,000 bpd. It was not immediately clear where production levels now stand."),
            Item("https://vid.alarabiya.net/images/2023/06/07/2b39b074-bdba-45be-a71c-2349d2420691/2b39b074-bdba-45be-a71c-2349d2420691_16x9_1200x676.jpg?width=335&format=jpg",
                "China coal production threatens climate goals: Study",
                "Energy",
                "10 sep 2024",
                "China’s planned expansion of coal mining threatens the country’s climate goals and risks vastly increasing its methane emissions, a study warned on Tuesday.\n" +
                        "\n" +
                        "The warning comes as research shows concentrations of the powerful greenhouse gas are rising at an accelerating pace.\n" +
                        "\n" +
                        "For all the latest headlines, follow our Google News channel online or via the app.\n" +
                        "\n" +
                        "China is the world’s top emitter of greenhouse gases and remains heavily reliant on coal despite installing renewable energy capacity at record speed.\n" +
                        "\n" +
                        "It aims to peak its planet-warming emissions by 2030 and reach net zero three decades later.\n" +
                        "\n" +
                        "However, it produced a record 4.7 billion tons of coal last year, 50 percent of global output, and more is on the way, said NGO Global Energy Monitor (GEM).\n" +
                        "\n" +
                        "In all, China has 1.2 billion more tons a year of capacity in development, including new sites and expansions of existing mines, said GEM.\n" +
                        "\n" +
                        "That accounts for more than half the global pipeline.\n" +
                        "\n" +
                        "“If materialized, and without robust mitigation measures, this massive expansion will significantly increase methane emissions,” GEM warned.\n" +
                        "\n" +
                        "Carbon dioxide is the primary greenhouse gas produced by human activity, followed by methane which comes mainly from agriculture, energy production and organic waste in landfills.\n" +
                        "\n" +
                        "While it breaks down faster than carbon dioxide, methane is also more potent.\n" +
                        "\n" +
                        "It is also “rising faster in relative terms than any major greenhouse gas and is now 2.6-fold higher than in pre-industrial times,” an international group of researchers said in a separate study published in Environmental Research Letters on Tuesday.\n" +
                        "\n" +
                        "Emissions calculations\n" +
                        "Coal production is a major source of methane, which seeps from mines through vents, open pits and cracks in the ground.\n" +
                        "\n" +
                        "More than 150 countries have signed up to a Global Methane Pledge to cut methane emissions by 30 percent from 2020 levels by 2030.\n" +
                        "\n" +
                        "China, India and Russia have declined to sign.\n" +
                        "\n" +
                        "Calculating methane emissions is complicated, with satellites increasingly being used to monitor hard-to-detect leaks from space.\n" +
                        "\n" +
                        "The International Energy Agency estimated methane emissions from China’s coal mines at around 20 million tons in 2023.\n" +
                        "\n" +
                        "But GEM said the real figure could be significantly higher, based on its analysis of nationwide coal mine activity data.\n" +
                        "\n" +
                        "It puts the figure closer to 35 million tons and warned that could rise by another 10 million tons if all China’s projected coal production materializes.\n" +
                        "\n" +
                        "GEM’s calculations use data such as coal type and mine depth and an emissions factor that varies according to the mine type.\n" +
                        "\n" +
                        "Where production data is unavailable, the estimates rely on capacity figures, explained the report’s co-author Dorothy Mei, “which can result in higher estimated emissions.”\n" +
                        "\n" +
                        "The methodology does not factor in mitigation measures because of a lack of data, she told AFP.\n" +
                        "\n" +
                        "China has continued to invest in coal production and power even as it massively expands its renewable capacity.\n" +
                        "\n" +
                        "Analysts say this reflects Beijing’s cautious approach to energy security after experiencing power shortages during drought that affected hydropower production.\n" +
                        "\n" +
                        "And GEM noted that China’s coal plans include a pool of “idle yet operational” mines that could be mobilized in case of supply disruptions.\n" +
                        "\n" +
                        "Coal power permits in China fell 83 percent in the first half of 2024 and some experts believe the country’s emissions may have already peaked.\n" +
                        "\n" +
                        "China and the United States will host a second joint summit on methane and other non-CO2 gases at this year’s United Nations climate talks in Baku."),
            Item("https://vid.alarabiya.net/images/2023/12/19/81859c01-13d4-4694-b958-1ffb1257fe53/81859c01-13d4-4694-b958-1ffb1257fe53_16x9_1200x676.JPG?width=335&format=jpg",
                "Ukraine ending gas deal hurts Europe more than Russia, Putin says",
                "Energy",
                "05 sep 2024",
                "Ukraine’s decision to end an agreement allowing Russia to pump gas via its territory will hurt Europe more than it will Moscow, Russian President Vladimir Putin said on Thursday.\n" +
                        "\n" +
                        "The agreement signed in 2019 has generated revenue for both Kyiv and Moscow, but Ukrainian President Volodymyr Zelenskyy said last week the deal would not be renewed when it expires at the end of the year.\n" +
                        "\n" +
                        "For the latest updates on the Russia-Ukraine war, visit our dedicated page.\n" +
                        "\n" +
                        "“Ukraine is refusing our transit, which means that the volumes of gas coming to Europe will be reduced,” Putin said during a question-and-answer session at Russia’s Eastern Economic Forum in Vladivostok.\n" +
                        "\n" +
                        "“There will be damage for them. For us, there will be a certain reduction in income, but that’s okay. Gazprom will supply more domestically,” Putin added.\n" +
                        "\n" +
                        "Europe’s gas imports from Russia have plunged more than 90 percent since Moscow launched its offensive in Ukraine in 2022, forcing the Kremlin to look to Asian buyers like China to boost its income.\n" +
                        "\n" +
                        "Most transit routes for Moscow to export gas to Europe have been shut off or rendered unusable since the conflict began, including the now-defunct Nord Stream pipelines that were blown up in September 2022.\n" +
                        "\n" +
                        "Russia is still able to transit gas via the Sudzha entry point, which Ukraine claimed to capture in its cross-border offensive last month, but this route will also end when the 2019 agreement expires.\n" +
                        "\n" +
                        "Russian energy giant Gazprom used to generate huge revenues for the Russian government, but has faced financial difficulties as the EU cuts purchases.\n" +
                        "\n" +
                        "Experts quoted by the Russian business daily Vedomosti estimate the loss of Ukrainian transit routes could cost the company another \$5.5 billion a year, or six percent of its revenue.\n" +
                        "\n" +
                        "Ukraine currently collects around \$800 million in transit fees from the deal, approximately 0.5 percent of its GDP, though that does not account for the costs of operating the system."),
            Item("https://vid.alarabiya.net/images/2022/01/12/01c2a8d0-6551-4c8e-afc3-c466048af623/01c2a8d0-6551-4c8e-afc3-c466048af623_16x9_1200x676.jpg?width=335&format=jpg",
                "UAE completes Arab World’s first nuclear plant",
                "Energy",
                "05 sep 2024",
                "The United Arab Emirates on Thursday announced the completion of the Arab world’s first nuclear power plant, calling it a “significant step.”\n" +
                        "\n" +
                        "Abu Dhabi’s Barakah Nuclear Energy Plant will produce 40 terawatt-hours of electricity annually after its fourth and final reactor has entered commercial operation, the state-owned Emirates Nuclear Energy Corporation (ENEC) said in a statement.\n" +
                        "\n" +
                        "For all the latest headlines, follow our Google News channel online or via the app.\n" +
                        "\n" +
                        "It will generate 25 percent of the electricity needs of the Gulf state, where air-conditioning is ubiquitous – nearly the equivalent of New Zealand’s annual consumption, ENEC said.\n" +
                        "\n" +
                        "The station will power companies including the Abu Dhabi National Oil Company (ADNOC), one of the world’s biggest oil producers, Emirates Steel and Emirates Global Aluminium, ENEC said.\n" +
                        "\n" +
                        "Barakah, which means “blessing” in Arabic, started operations in 2020 when the first of its four reactors went into service.\n" +
                        "\n" +
                        "Saudi Arabia, the world’s top oil exporter, has also said it plans to build nuclear reactors.\n" +
                        "\n" +
                        "Emirati President Sheikh Mohamed bin Zayed hailed Barakah’s completion as a “significant step on the journey towards net zero.”\n" +
                        "\n" +
                        "“We will continue to prioritise energy security and sustainability for the benefit of our nation and our people today and tomorrow,” he said in a post on social media platform X.\n" +
                        "\n" +
                        "With the start of operations at Unit 4 of the Barakah Nuclear Energy Plant, the UAE has taken another significant step on the journey towards net zero. We will continue to prioritise energy security and sustainability for the benefit of our nation and our people today and…\n" +
                        "\n" +
                        "— محمد بن زايد (@MohamedBinZayed) September 5, 2024\n" +
                        "According to the International Atomic Energy Agency, the plant “will have to be disassembled at the end of its useful life, in around 60-80 years.”\n" +
                        "\n" +
                        "The UAE, which is made up of seven emirates, including the capital Abu Dhabi and economic hub Dubai, is one of the largest oil producers in the OPEC cartel.\n" +
                        "\n" +
                        "The country was largely built on oil but is spending billions to develop enough renewable energy to cover half of its needs by 2050.\n" +
                        "\n" +
                        "Last year, it hosted the COP28 UN climate talks which resulted in an agreement to “transition away” from fossil fuels.\n" +
                        "\n" +
                        "The UAE lies across the Gulf from Iran which has a Russian-built nuclear power plant outside the coastal city of Bushehr, as well as a controversial uranium enrichment program.\n" +
                        "\n" +
                        "The UAE has repeatedly said its nuclear ambitions are for “peaceful purposes” and ruled out developing any enrichment program or nuclear reprocessing technologies.\n" +
                        "\n" +
                        "The country uses gas-powered stations for much of its electricity needs, but also has one of the world’s biggest solar plants outside Abu Dhabi."),
            Item("https://vid.alarabiya.net/images/2023/01/08/de668f19-4395-4c2c-abc5-4b0d9d6aa366/de668f19-4395-4c2c-abc5-4b0d9d6aa366_16x9_1200x676.jpg?width=335&format=jpg",
                "QatarEnergy to double annual urea production",
                "Energy",
                "01 sep 2024",
                "State-owned QatarEnergy will boost its production of urea to more than 12.4 million tons annually from 6 million tons currently, its CEO said in a press conference on Sunday, without giving a timeframe.\n" +
                        "\n" +
                        "Saad al-Kaabi, also Qatar’s minister of state for energy affairs, said the construction of four new production lines for urea, a key ingredient in fertilizers, would boost output by 106 percent. He said the first production line would begin before 2030.\n" +
                        "\n" +
                        "For all the latest headlines follow our Google News channel online or via the app.\n" +
                        "\n" +
                        "“When we looked at the market for urea in the future, with the growth of humanity today, with 1.5 to 2 billion people that will be joining us in the next 20-30 years, the urea requirement for food production will be exponentially increasing,” al-Kaabi said.\n" +
                        "\n" +
                        "He also said construction on a project to expand gas production from the North Field was on schedule.\n" +
                        "\n" +
                        "The massive expansion is set to boost QatarEnergy’s overall liquefied natural gas (LNG) production by 85 percent over current levels. North Field is part of the world’s largest natural gas field that Qatar shares with Iran, which calls it South Pars.\n" +
                        "\n" +
                        "Kaabi also announced construction of a third new solar power station in Qatar’s eastern Dukhan region to more than double Qatar’s overall solar energy production to 4,000 megawatts by 2030."),
        )
        adapter = ItemAdapter(items)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}