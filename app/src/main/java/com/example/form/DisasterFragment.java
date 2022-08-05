package com.example.form;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.form.adapter.CustomAdapter;
import com.example.form.model.DisasterModel;

import java.util.ArrayList;

public class DisasterFragment extends Fragment {
    CustomAdapter adapter;
    RecyclerView disasterRecyclerView;
    static  ArrayList<DisasterModel> disasterList;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_disaster, container, false);
        disasterRecyclerView = view.findViewById(R.id.disaster_list);
         disasterList = new ArrayList<>();
        disasterList.add(new DisasterModel(R.drawable.flood, "Floods", "flood_disaster_flooding_is_a_" +
                "temporary_overflow_of_water_onto_land_that_is_normally_dry_floods_are_the_most_common_natura" +
                "l_disaster_in_the_united_states_detection_find_safe_shelter_right_away_do_not_walk_swim_or_drive_thr" +
                "ough_flood_waters_turn_around_don_t_drown_remember_just_six_inches_of_moving_water_can_knock_you_down_and" +
                "_one_foot_of_moving_water_can_sweep_your_vehicle_away_stay_off_bridges_over_fast_moving_water_depending_on" +
                "_the_type_of_flooding_o_evacuate_if_told_to_do_so_o_move_to_higher_ground_or_a_higher_floor_o_stay_where_you_are"));
        disasterList.add(new DisasterModel(R.drawable.forist,"Forest Fire","Wildfires are unplanned fires that burn in natural areas like forests, grasslands or prairies. These dangerous fires spread quickly and can devastate not only wildlife and natural areas, but also communities." +
                "IF YOU ARE UNDER A Wildfires WARNING:\n" +
                "•\tMake sure everyone in your household knows and understands what to do if you need to quickly evacuate.  \n" +
                "•\tUse fire-resistant materials to build, renovate or make repairs.\n" +
                "•\tFind an outdoor water source with a hose that can reach any area of your property.\n" +
                "•\tWhen cleaning, wear protective clothing – including a long-sleeved shirt, long pants, work gloves and sturdy thick-soled shoes – during clean-up efforts.\n" +
                "•\tUse a respirator to limit your exposure, and wet debris to minimize breathing dust particles. People with asthma, COPD and/or other lung conditions should take precautions in areas with poor air quality, as it can worsen symptoms.\n" +
                "•\tDocument property damage with photographs. Conduct an inventory and contact your insurance company for assistance.\n" +
                "•\tSend text messages or use social media to reach out to family and friends. Phone systems are often busy following a disaster. Make calls only in emergencies.\n" +
                "•\tDo not return home until authorities say it is safe to do so.\n" +
                "•\tAvoid hot ash, charred trees, smoldering debris and live embers. The ground may contain heat pockets that can burn you or spark another fire.\n"));
        disasterList.add(new DisasterModel(R.drawable.windstorm,"Windstorm","A windstorm is a storm with high winds or violent gusts that are strong enough to cause at\n" +
                "least some damage to trees and buildings. Windstorms usually involve wind speeds that\n" +
                "exceed 34 mph. Damage from windstorms occurs from gusts, or short bursts of high-speed\n" +
                "winds, as well as longer periods of stronger, sustained winds. Windstorms can take several\n" +
                "forms, including downbursts, derechos, haboobs, and dust storms. When windstorms carry\n" +
                "fine particles, as in a dust storm, they can reduce visibility quickly and may lead to accidents\n" +
                "and massive car and truck pile-ups. Dangerous wind gusts are very difficult to predict and\n" +
                "can occur without warning, so thunderstorm or dust storm warnings may be the only\n" +
                "warning that they might occur.\n" +
                "Before\n" +
                "Being prepared beforehand is the best way to help children and family members stay\n" +
                "safe after a windstorm. To improve their preparedness, families should:\n" +
                "Identify the safest room in their home to shelter in place. Families should\n" +
                "plan to go to a storm cellar, basement, or the lowest building level during a severe\n" +
                "windstorm. If there is no basement, encourage them to go to an inside room without\n" +
                "windows, like a closet or bathroom. It is best to stay away from windows, corners,\n" +
                "or outside walls.\n" +
                "Understand the different weather alerts related to windstorms. Because\n" +
                "windstorms take many forms, there are several advisories and warnings of which\n" +
                "families should be aware. It is also important to pay attention to warnings for severe\n" +
                "thunderstorms, as these storms may produce downbursts and derechos that usually\n" +
                "do not have their own warnings. These alerts include:\n" +
                "Severe Thunderstorm Watch: Issued when conditions are favorable for\n" +
                "severe storms (wind gusts of 58 mph or more or ¾inch diameter hail or larger).\n" +
                "People in the watch area should monitor the sky and stay tuned to know when\n" +
                "warnings are issued.\n" +
                "Severe Thunderstorm Warning: Issued when large hail and/or wind gusts of\n" +
                "58 mph or greater are imminent. People in the warning are should take shelter\n" +
                "in a substantial building or in a vehicle with the windows closed.\n" +
                "Blowing Dust Advisory: Issued when blowing dust is expected to reduce\n" +
                "visibility to between ¼and 1 mile, generally with winds of 25 mph or greater.\n" +
                "People should monitor for updates and exercise caution for outdoor activities\n" +
                "and driving.\n" +
                "Dust Storm Warning: Issued when blowing dust is expected to reduce\n" +
                "visibility frequently to ¼mile or less, generally with winds of 25 mph or more.\n" +
                "People should avoid travel in the area until the dust clears, and those with\n" +
                "respiratory problems should prepare to stay indoors until the storm fully\n" +
                "passes.\n" +
                "Assemble an emergency supply kit. Families should have access to enough\n" +
                "water, food, and other emergency supplies. They should also gather copies of\n" +
                "important documents, a radio with batteries as needed for weather updates, and\n" +
                "supplies for pets. For a complete checklist of what to include, review the family\n" +
                "preparedness plan.\n" +
                "Make a family communication plan. Keep important contact information\n" +
                "easily accessible and know who to contact if separated from one another.\n" +
                "Babysitters and caregivers should also have this information. To develop their plan,\n" +
                "families can fill out the preparedness wallet card.\n" +
                "Plan for children’s needs. Families should give children factual information\n" +
                "about windstorms in simple terms. Parents can also include children in preparedness\n" +
                "activities. The mobile app Help Kids Cope provides parents with ideas about how to\n" +
                "talk with children of different developmental levels."));
        disasterList.add(new DisasterModel(R.drawable.tusanmi,"Tsunami","A tsunami is a series of enormous ocean waves caused by earthquakes, underwater landslides, volcanic eruptions or asteroids. A tsunami can kill or injure people and damage or destroy buildings and infrastructure as waves come in and go out. Tsunamis can:" +
                "IF YOU ARE UNDER A TSUNAMI WARNING:" +
                "•\tIf caused by an earthquake, Drop, Cover, then Hold On to protect yourself from the earthquake first.\n" +
                "•\tGet to high ground as far inland as possible\n" +
                "•\tBe alert to signs of a tsunami, such as a sudden rise or draining of ocean waters.\n" +
                "•\tListen to emergency information and alerts. Always follow the instructions from local emergency managers.\n" +
                "•\tEvacuate: DO NOT wait! Leave as soon as you see any natural signs of a tsunami or receive an official tsunami warning.\n" +
                "•\tIf you are in a boat, go out to sea.\n" +
                "•\tListen to local alerts and authorities for information on areas to avoid and shelter locations.\n" +
                "•\tSave phone calls for emergencies. Phone systems often are down or busy after a disaster. Use text messages or social media to communicate with family and friends.\n" +
                "•\tAvoid wading in floodwater, which can contain dangerous debris. Water may be deeper than it appears.\n" +
                "•\tStay away from damaged buildings, roads and bridges\n"));
        disasterList.add(new DisasterModel(R.drawable.volcano,"Volcano","A volcano is an opening in the Earth’s crust that allows molten rock, gases and debris to escape to the surface. During a volcanic eruption, lava and other debris can flow at speeds of up to 100 mph, destroying everything in their path. Volcanic ash can travel hundreds of miles and cause severe health problems.\n" +
                "IF YOU ARE UNDER A VOLCANO WARNING:\n" +
                "•\tListen for emergency information and alerts.\n" +
                "•\tFollow evacuation or shelter orders. If advised to evacuate, do so early.\n" +
                "•\tHave a shelter-in-place plan if your biggest risk is from ash.\n" +
                "•\tKeep important documents in a safe place. Create password-protected digital copies.\n" +
                "•\tFind out what your homeowner’s insurance policy will cover when a volcano erupts.\n" +
                "•\tFollow evacuation orders from local authorities. Evacuate early.\n" +
                "•\tAvoid areas downwind, and river valleys downstream, of the volcano. Rubble and ash will be carried by wind and gravity.\n" +
                "•\tTake temporary shelter from volcanic ash in the location where you are, if you have enough supplies. Cover ventilation openings and seal doors and windows.\n" +
                "•\tIf outside, protect yourself from falling ash that can irritate skin and injure breathing passages, eyes and open wounds. Use a well-fitting, certified face mask, such as an N95.\n" +
                "•\tAvoid driving in heavy ash fall.\n"));
        disasterList.add(new DisasterModel(R.drawable.earthquake,"Earthquake","An earthquake is a sudden, rapid shaking of the ground caused by the shifting of rocks deep underneath the earth’s surface. " +
                "Earthquakes can cause fires, tsunamis, landslides or avalanches. " +
                "While they can happen anywhere without warning, areas at higher risk for earthquakes include Alaska, California, Hawaii, " +
                "Oregon, Puerto Rico, Washington and the entire Mississippi River Valley." +
                "f you are under an earthquake warning:" +
                "•\tFind safe shelter right away.\n" +
                "•\tDo not walk, swim or drive through flood waters. Turn Around, Don’t Drown!\n" +
                "•\tRemember, just six inches of moving water can knock you down, and one foot of moving water can sweep your vehicle away.\n" +
                "•\tStay off bridges over fast-moving water.\n" +
                "•\tDo not walk, swim or drive through flood waters. Turn Around. Don’t Drown!\n" +
                "•\tStay off bridges over fast-moving water. Fast-moving water can wash bridges away without warning.\n" +
                "•\tStay inside your car if it is trapped in rapidly moving water. Get on the roof if water is rising inside the car.\n" +
                "•\tBe aware that snakes and other animals may be in your house.\n" +
                "•\tBe aware of the risk of electrocution. Do not touch electrical equipment if it is wet or if you are standing in water. Turn off the electricity to prevent electric shock if it is safe to do so.\n"));
        disasterList.add(new DisasterModel(R.drawable.hurricane,"Hurricane","Hurricanes are dangerous and can cause major damage from storm surge, wind \n" +
                "damage, rip currents and flooding. They can happen along any U.S. coast or in any \n" +
                "territory in the Atlantic or Pacific oceans.\n" +
                "Detection:\n" +
                "Stay Informed\n" +
                "• Pay attention to emergency information and alerts.\n" +
                "• If you live in a mandatory evacuation zone and local officials tell you to evacuate, \n" +
                "do so immediately.\n" +
                "• Wear protective clothing and work with someone else.\n" +
                "• Do not touch electrical equipment if it is wet or if you are standing in water. If it is \n" +
                "safe to do so, turn off electricity at the main breaker or fuse box to prevent \n" +
                "electric shock"));
        disasterList.add(new DisasterModel(R.drawable.snowstorms,"Snowstorm","Snowstorms are storms where large amounts of snow fall. 2 in (5.1 cm) of snow is enough to create serious disruptions to traffic and school transport (because of the difficulty to drive and maneuver the school buses on slick roads). This is particularly true in places where snowfall is not typical but heavy accumulating snowfalls can occur. In places where snowfall is typical, such small snowfalls are rarely disruptive, because of effective snow and ice removal by municipalities, increased use of four-wheel drive and snow tires, and drivers being more used to winter conditions. Snowfalls in excess of 6 in (15 cm) are usually universally disruptive.\n" +
                "\n" +
                "A large number of severe snowstorms, some of which were blizzards, occurred in the United States during 1888 and 1947 as well as the early and mid-1990s. The snowfall of 1947 exceeded 2 ft (61 cm) with drifts and snow piles from plowing that reached 12 ft (3.7 m) and for months as temperatures did not rise high enough to melt the snow. The 1993 \"Superstorm\" manifested as a blizzard in most of the affected areas.\n" +
                "\n" +
                "Severe snowstorms could be quite dangerous: a 6 in (15 cm) snow depth will make some unplowed roads impassable, and it is possible for cars to get stuck in the snow. Snow depth exceeding 12 in (30 cm) especially in southern or generally warm climates will cave the roofs of some homes and cause loss of electricity. Standing dead trees can also be brought down by the weight of the snow, especially if it is wet. Even a few inches of dry snow can form drifts many feet high under windy conditions." +
                "Accumulated snow can make driving motor vehicles very hazardous. Snow on roadways reduces friction between tires and the road surface, which in turn lowers the maneuverability of a vehicle considerably. As a result, average driving speeds on public roads and highways are reduced by up to 40% while heavy snow is falling.[8] Visibility is reduced by falling snow, and this is further exacerbated by strong winds which are commonly associated with winter storms producing heavy snowfall. In extreme cases, this may lead to prolonged whiteout conditions in which visibility is reduced to only a few feet due to falling or blowing snow. These hazards can manifest even after snowfall has ended when strong winds are present, as these winds will pick up and transport fallen snow back onto roadways and reduce visibility in the process. This can even result in blizzard conditions if winds are strong enough.[9] Heavy snowfall can immobilize a vehicle entirely, which may be deadly depending on how long it takes rescue crews to arrive. The clogging of a vehicle's tailpipe by snow may lead to carbon monoxide buildup inside the cabin."));
        disasterList.add(new DisasterModel(R.drawable.tornado,"Tornado","Tornadoes \n" +
                "are violently rotating columns of air that extend from a thunderstorm to the ground. tornado \n" +
                "can Happen anytime and anywhere. Bring intense winds, over 200 miles per hour. Look like \n" +
                "funnels.\n" +
                "Staying Safe During a Tornado: -\n" +
                "-Immediately go to a safe location that you have identified.\n" +
                "-Protect yourself by covering your head or neck with your arms and putting materials such as \n" +
                "furniture and blankets around or on top of you.\n" +
                "-Do not try to outrun a tornado in a vehicle if you are in a car.\n" +
                "-Stay clear of fallen power lines or broken utility lines.\n" +
                "- Prepare for long-term stay at home or sheltering in plc" ));
        disasterList.add(new DisasterModel(R.drawable.dust,"Dust Storm","A dust storm, also called a sandstorm, is a meteorological phenomenon common in arid and semi-arid regions.[1] Dust storms arise when a gust front or other strong wind blows loose sand and dirt from a dry surface. Fine particles are transported by saltation and suspension, a process that moves soil from one place and deposits it in another.\n" +
                "\n" +
                "The arid regions of North Africa, the Arabian peninsula, Central Asia and China are the main terrestrial sources of airborne dust. It has been argued that[2][unreliable source?] poor management of Earth's drylands, such as neglecting the fallow system, are increasing the size and frequency of dust storms from desert margins and changing both the local and global climate, as well as impacting local economies.[3]\n" +
                "\n" +
                "The term sandstorm is used most often in the context of desert dust storms, especially in the Sahara Desert, or places where sand is a more prevalent soil type than dirt or rock, when, in addition to fine particles obscuring visibility, a considerable amount of larger sand particles are blown closer to the surface. The term dust storm is more likely to be used when finer particles are blown long distances, especially when the dust storm affects urban areas." +
                "As the force of dust passing over loosely held particles increases, particles of sand first start to vibrate, then to move across the surface in a process called saltation. As they repeatedly strike the ground, they loosen and break off smaller particles of dust which then begin to travel in suspension. At wind speeds above that which causes the smallest to suspend, there will be a population of dust grains moving by a range of mechanisms: suspension, saltation and creep.[3]\n" +
                "\n" +
                "A study from 2008 finds that the initial saltation of sand particles induces a static electric field by friction. Saltating sand acquires a negative charge relative to the ground which in turn loosens more sand particles which then begin saltating. This process has been found to double the number of particles predicted by previous theories."));
        disasterList.add(new DisasterModel(R.drawable.hailstrome,"Hailstorm","A hailstorm is a thunderstorm that produces ice as precipitation. Hailstorms can cause serious\n" +
                "damage to crops and property. In India, hailstorms mostly affect the northeast and western\n" +
                "Himalayas, with the maximum strikes in March and April\n" +
                "Hailstorm is a severe weather phenomenon, which causes extensive damage to crops, property and \n" +
                "livestock. Hail is solid precipitation made of balls or irregular lumps of ice, each of which is called a \n" +
                "hailstone. Unlike graupel or snow-ice pellets that are smaller and translucent, hailstones consist \n" +
                "mostly of water ice and measure between 5 mm and 15 cm in diameter. Any thunderstorm, which \n" +
                "produces hail that reaches the ground, is termed a hailstorm.\n" +
                "Hailstorm damage\n" +
                "Hail can cause serious damage, notably to aircraft, automobiles, glass-roofed structures, skylights, \n" +
                "besides crops, people and livestock. Hailstorms occurring primarily in the months of March and April \n" +
                "cause maximum damage to ‘rabi’ crops when it is ripening for harvest and when the mango orchards \n" +
                "are flowering. One of the most damaging hailstorms hit the north Indian city of Moradabad on April \n" +
                "30, 1988, and resulted in the death of 246 people, in addition to 1,600 livestock fatalities. In 2015 \n" +
                "India suffered an estimated loss of INR 20,453 crore due to unseasonal rains and hailstorms in \n" +
                "March.\n" +
                "The United States gets a large share of hail each year, resulting in 1 billion USD in damages. \n" +
                "Australia has a history of both small and large hailstorms, although the 1999 hailstorm remains one \n" +
                "of the worst on record when around half a million tonnes of hail fell from the sky during a single \n" +
                "hailstorm that hit Sydney on April 14, 1999. It ripped apart roofs of 20,000 houses, 40,000 vehicles \n" +
                "and 25 aircrafts, resulting in whopping losses of over 1.7 billion USD.\n" +
                "Favourable conditions for a hailstorm\n" +
                "Hail forms in the strong updraft region of a thunderstorm. Atmospheric conditions favourable for the \n" +
                "formation hail bearing thunderstorm are:\n" +
                "High degree of instability,\n" +
                " High moisture content,\n" +
                " Low freezing level,\n" +
                " High vertical wind shear.\n" +
                "Hailstorms occur mostly over mid-latitude continental regions and decrease in frequency towards the \n" +
                "pole and equator and over oceans and seas with the exception of Kericho, which is located close to \n" +
                "equator at an elevation of 7,200 ft in Kenya and gets an annual average of 50 days of hail. The hail \n" +
                "at Kericho is typically small but frequent. Other regions of significant hailstorm occurrence in the \n" +
                "world include the Great Plains of the United States, Australia, China, India, Central Europe, Central \n" +
                "Asia and adjoining parts of Russia.\n" +
                "In India the favourable hail conditions are met by active western disturbances during winter and the \n" +
                "pre-monsoon season. Low level circulation associated with western disturbance, middle level trough \n" +
                "in westerly winds and presence of a jet stream at higher level provide favourable conditions for the \n" +
                "formation of hail-bearing thunderstorms along the line of discontinuity over north and northeast India. \n" +
                "During the passage of an induced circulation, a deep westerly trough belt of hailstorm extends to \n" +
                "central India and, at times, up to Telangana, Andhra Pradesh and Karnataka. Hailstorm occurrence \n" +
                "however is maximum over the Northeast and Western Himalayas followed by Vidarbha, eastern \n" +
                "Maharashtra, parts of Madhya Pradesh and Jharkhand. Southern states generally do not experience \n" +
                "hailstorms.\n" +
                "In general, most hailstorms over North, Northeast and Central India occur from January to May with \n" +
                "the months of March and April recording the highest number. Latitudinal and longitudinal distribution \n" +
                "with the monthly frequency and diurnal variation of hailstorms over Northeast India is shown in Fig. \n" +
                "1a and b. Hailstorms, occur mostly in the afternoon and evening between 1500 hrs. and 1900 hrs.\n" +
                "Hailstone shapes\n" +
                "Hailstones can be as large as oranges and grapefruits. If hailstones collide with each other \n" +
                "and freeze together, they can form hailstones with a large variety of aero dynamical shapes. \n" +
                "Hailstones are commonly spherical, conical, pear-shaped, ellipsoidal or discoidal in shape. The \n" +
                "shapes are circular at smaller sizes and irregular at larger sizes. The shape is used as a guide \n" +
                "for reporting hail size by comparing it to objects of the same diameter for simplicity in \n" +
                "reporting (Table 1). It is considered to be severe hail if the diameter is 0.75 inches/1.84 \n" +
                "cm or greater.\n" +
                "Giant hailstones are usually irregular in shape, exacerbated with the merging of smaller \n" +
                "hailstone on to a bigger hailstone ending up with bulges and irregularities. As per official US \n" +
                "records, Vivian in South Dakota saw a hailstone of 20 cm diameter fall on 23 July 2010 \n" +
                "which was the largest hailstone recovered in the US. There are unconfirmed reports of \n" +
                "Gopalgunj district in Bangladesh having been hit by a one kg hailstone, the heaviest hailstone \n" +
                "known, on April 14, 1986.\n" +
                "Hailstorm observations\n" +
                "Hailstorm reports are based on observations of hail falling on ground. Since hailstorm is a \n" +
                "mesoscale phenomenon, it occurs in a limited area—thus goes unreported in remote areas. \n" +
                "However, radar is an extremely useful tool in the detection of any hydro meteor in the \n" +
                "atmosphere. The reflectivity of any cloud is dependent on the number, type and size of \n" +
                "hydro meteors, which includes rain, snow and hail. Today, dual polarmetic radars are able to \n" +
                "detect hail from differences in radar reflectivity of rain and hail at horizontal and vertical \n" +
                "linear polarisation. This technique holds great promise in improving the detection of \n" +
                "hailstorms.\n" +
                "Hailstorm climatology\n" +
                "The Advanced Microwave Scanning Radiometer for Earth Observing System (AMSR-E) allows \n" +
                "a unique, consistent comparison between regions that cannot be otherwise compared using \n" +
                "ground-based records owing to varying standards of data collection. Daniel J. Cecil and Clay \n" +
                "B. Blankenship of Earth System Science Centre, University of Alabama, have developed an \n" +
                "eight-year climatology of storms producing large hail estimates from satellite measurements. \n" +
                "The Study shows that severe hailstorms are indicated in a broad region of northern \n" +
                "Argentina and southern Paraguay and a smaller region in Bangladesh and eastern India. \n" +
                "Numerous hailstorms are also estimated in the central and south-eastern United States, \n" +
                "northern Pakistan and north-western India, central, western, and south-eastern Africa. \n" +
                "Fewer hailstorms are estimated for other regions over land and scattered across subtropical \n" +
                "oceans. (Fig. 3)\n" +
                "Hail suppression\n" +
                "The need to protect crops from the damage caused by hailstorm has been a matter of \n" +
                "interest amongst scientists since 1896, when Alber Stinger tried using a hail cannon to \n" +
                "protect orchids in Styria, Austria. However, since Vincent J Schaefer’s discovered that dry \n" +
                "ice acts as a good nucleating agent for ice crystals in atmosphere in 1946, hail suppression \n" +
                "programmes have been undertaken by 15 nations.\n" +
                "Cloud seeding is undertaken so as to reduce accumulation of large amounts of super cooled \n" +
                "water by supplying the cloud with numerous freezing nuclei capable of converting water to \n" +
                "ice. This prevents the growth of large hailstones. Smaller hailstones are believed to inflict \n" +
                "lesser damage.\n" +
                "Of the early ambitious projects were those by Russians in the Caucuses region. Russian \n" +
                "scientists claimed a 50 per cent reduction in losses through cloud seeding with silver iodide \n" +
                "nuclei. Since statistical evaluation of the Russian projects has not been possible, their claims \n" +
                "remain open to interpretation. The United States initiated the National Hail Research \n" +
                "Experiment (NHRE) in 1972, monitoring 30 hailstorms near the Colorado-Nebraska border. \n" +
                "An analysis of the NHRE in 1975 failed to support statistically significant increases in \n" +
                "hailstorms with small hail or an increase in rain.\n" +
                "Although there has been much interest in hail suppression, lack of an adequate standard to \n" +
                "determine the success or otherwise of experiments undertaken leaves its efficacy open to \n" +
                "doubt. However, the research has certainly yielded a lot more information on hail formation."));
        disasterList.add(new DisasterModel(R.drawable.thuandstrima,"Thunderstorm","Lightning is a leading cause of injury and death from weather-related hazards. Although \n" +
                "most lightning victims survive, people struck by lightning often report a variety of long\u0002term, debilitating symptoms.\n" +
                "Thunderstorms are dangerous storms that include lightning and can create or cause:\n" +
                " Powerful winds over 50 mph\n" +
                " Hail\n" +
                " Flash flooding and/or tornadoes\n" +
                " Prepare for Thunderstorms & Lightning\n" +
                " Know Your Risk\n" +
                "Know your area’s risk for thunderstorms. In most places they can occur year round and at any hour. Sign up for your community’s warning system. \n" +
                "The Emergency Alert System (EAS) and National Oceanic and Atmospheric \n" +
                "Administration (NOAA) Weather Radio also provide emergency alerts.\n" +
                " Strengthen Your Home\n" +
                "Cut down or trim trees that may be in danger of falling on your home. Consider \n" +
                "buying surge protectors, lightning rods or a lightning protection system to protect \n" +
                "your home, appliances and electronic devices.\n" +
                " Make an Emergency Plan\n" +
                "Create an emergency plan so that you and your family know what to do, where to \n" +
                "go and what you will need to protect yourselves from the effects of a \n" +
                "thunderstorm. Identify sturdy buildings close to where you live, work, study and \n" +
                "play"));
        disasterList.add(new DisasterModel(R.drawable.sandstor,"Sandstorm","Sandstorm\n" +
                "We may have heard about sandstorms at one point in our lives. While it is common knowledge that it \n" +
                "comprises of sand and that it could cause several adverse effects towards the environment and the well-being \n" +
                "of the people.\n" +
                "A sandstorm is described as a natural phenomenon that occurs when a strong wind, such as a gust front, blows \n" +
                "fine sand particles and dust from a dry surface. These particles become suspended in the air, causing erosion \n" +
                "where they initially were. The wind drops these particles in another place where silt is formed.\n" +
                "Health tips for dealing with sandstorms while they happen: -\n" +
                "- Avoid leaving the house except in extreme and necessary cases.\n" +
                "-Putting medical masks or a tissue wet with water, in addition to putting on glasses to protect the eyes, in \n" +
                "case you have to leave the house.\n" +
                "-To drive at a low speed, turn on the headlights of the car and close all the windows tightly, and in the event \n" +
                "that vision is not possible, you must stop at the nearest point, and these are the appropriate measures in the \n" +
                "case of driving the car.\n" +
                "-Seal doors and windows to prevent dust from entering buildings and homes"));
        disasterList.add(new DisasterModel(R.drawable.avalanches,"Avalanche","An avalanche is a large amount of snow moving quickly down a mountain, typically\n" +
                "on slopes of 30 to 45 degrees. When an avalanche stops, the snow becomes solid\n" +
                "like concrete and people are unable to dig out. People caught in avalanches can die\n" +
                "from suffocation, trauma or hypothermia.\n" +
                "Avalanches can:\n" +
                "Be caused by people, new snow and wind.\n" +
                "Move at speeds of 60 to 80 MPH.\n" +
                "1\n" +
                "Peak during the period of December through March.\n" +
                "How to Protect Yourself from an Avalanche\n" +
                "The most important actions you can take to survive an avalanche are done before it\n" +
                "happens.\n" +
                "1\n" +
                "Know Your Avalanche Risk\n" +
                "Learn about your local avalanche risk. Know the signs of increased danger, including\n" +
                "recent avalanches and shooting cracks across slopes. Avoid areas of increased risk,\n" +
                "such as slopes steeper than 30 degrees or areas under steep slopes. Get training on\n" +
                "how to recognize hazardous conditions and avalanche-prone locations. Sign up for\n" +
                "alerts from a U.S. Forest Service Avalanche Center near you. Your community may\n" +
                "also have a local warning system.\n" +
                "Preparing for Avalanche\n" +
                "Get proper equipment to protect yourself from head injuries and create air pockets.\n" +
                "Receive first aid training so you can recognize and treat suffocation, hypothermia,\n" +
                "traumatic injury and shock. Wear a helmet to help reduce head injuries and create\n" +
                "air pockets. Wear an avalanche beacon to help rescuers locate you. Use an\n" +
                "avalanche airbag that may help you from being completely buried. Carry a collapsible\n" +
                "avalanche probe and a small shovel to help rescue others.\n" +
                "Consider Overlapping Hazards: Coronavirus Disease 2019 (COVID\u000219) Remember, there is no evidence that cold weather and snow can kill the\n" +
                "coronavirus disease. Be sure to have several clean masks to use in case your mask\n" +
                "becomes wet or damp from snow. Cloth masks should not be worn when they\n" +
                "become damp or wet. Be sure to wash your mask regularly.\n" +
                "Masks may make it difficult to breathe, especially for those engaging in high intensity\n" +
                "activities. Remove your mask if you are having difficulty breathing. If you are unable\n" +
                "to wear a mask, maintain a distance of at least sixfeet between yourself and others.\n" +
                "Signs of Avalanche\n" +
                "Learn the signs of an avalanche, and how to use safety and rescue equipment.\n" +
                "Follow avalanche warnings on roads. Roads may be closed, or vehicles may be\n" +
                "advised not to stop on the roadside."));
        disasterList.add(new DisasterModel(R.drawable.sinkholel,"Sinkhole","Sinkholes are underground bedrocks that have collapsed leaving behind a large hole\n" +
                "that may vary in size. The sinkholes may be from 3 feet wide to about 2000 feet\n" +
                "wide. They are found throughout the world and can occur due to natural processes\n" +
                "or because of human intervention such as the cutting down of trees or leaving\n" +
                "behind large construction debris. In addition to leaving large holes, they may also\n" +
                "pollute the underground water sources.\n" +
                "Here we will look at the causes of how a sinkhole is formed and also look at ways in\n" +
                "which we can fix a sinkhole.\n" +
                "How are sinkholes formed?\n" +
                "Sinkholes typically occur in terrains known as Karst terrain. In Karst terrain, the rocks\n" +
                "located both on the surface or underground are susceptible to erosion both by\n" +
                "natural running water or water from rainfall. These rocks include gypsum, limestone,\n" +
                "and domes which can easily be eroded.\n" +
                "When there is run off of water or torrential rainfall in these types of terrain, the\n" +
                "soluble rocks underneath the surface start dissolving, thereby creating spaces and\n" +
                "large caverns. As time progresses, these spaces become larger while the surface\n" +
                "remains normal and intact. This process may take years and years until the ground\n" +
                "above is no longer supported by the eroded rocks below leading to the sudden\n" +
                "collapse of the surface and eventual formation of a sinkhole.\n" +
                "Sometimes sinkholes may occur more quickly due to massive rainfall and drought\n" +
                "seasons which can either cause quick dissolving of the rock or may cause the water\n" +
                "underneath to be lost leaving behind space creating massive sinkholes in the\n" +
                "process. As there is increasing climate change in the world leading to ever-changing\n" +
                "weather conditions throughout the planet, the risks of the development of sinkholes\n" +
                "are increasing more and more.\n" +
                "Types of Sinkholes\n" +
                "There are four types of sinkholes classified by geologists which are:\n" +
                "1. Dissolution Sinkholes\n" +
                "Adissolution sinkhole is a type of sinkhole in which a solute becomes dissolved in\n" +
                "essentially a solvent just like any solution. Dissolution sinkholes start when soluble\n" +
                "rocks such as dolomite or limestone which are close to the surface and covered by\n" +
                "soil start dissolving slowly leading to the formation of a depression which eventually\n" +
                "converts into a sinkhole. This process varies according to the amount of water falling\n" +
                "on the rocks and the rate at which the water is flowing through the rocks.\n" +
                "2. Cover-Subsidence Sinkholes\n" +
                "These types of sinkholes occur when unconsolidated materials such as sand cover\n" +
                "the soluble rocks. Over time, water will dissolve the soluble rocks creating voids and\n" +
                "spaces which will be filled with sand. The sand will help to obstruct the outflow of\n" +
                "water preventing the passage of water from the garden and soon water will have no\n" +
                "way to flow or drain into the ground. These sinkholes may eventually convert into\n" +
                "small underground ponds. The depth and width of these sinkholes are not that great\n" +
                "either as compared to other types of sinkholes."));
        disasterList.add(new DisasterModel(R.drawable.druhot,"Drought","Drought is a period of time in which an area of the Earth receives less rainfall than usual, when a lack \n" +
                "of precipitation, whether rain or snow, can cause reduced soil moisture or groundwater, reduced \n" +
                "current flow, crop failure, and a general water shortage Droughts are the second most costly weather \n" +
                "event after hurricanes.\n" +
                "-Nearly every part of the U.S. experiences periods of reduced rainfall. Planning in advance for a \n" +
                "drought can protect us in dry years.\n" +
                "The best way to prepare for a drought is to conserve water.\n" +
                "-Always observe state and local restrictions on water use during a drought.\n" +
                "-Choose appliances that are more energy and water efficient.\n" +
                "-Check all plumbing for leaks and have any leaks repaired by a plumber.\n" +
                "-Retrofit all household faucets by installing aerators with flow restrictors"));
        adapter =new CustomAdapter(getActivity(),disasterList);
        adapter.setOnItemClickListener((position, v) -> {
            Intent intent = new Intent(getActivity(), DisasterMap.class);
            intent.putExtra("position", position);
            startActivity(intent);
        });
        insertToLocal();
        return view;
    }
    void insertToLocal() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        disasterRecyclerView.setLayoutManager(linearLayoutManager);
        disasterRecyclerView.setAdapter(adapter);
        linearLayoutManager.setStackFromEnd(true);
//        recycleViewMessage.addItemDecoration(new OverlapDecoration());

    }
}