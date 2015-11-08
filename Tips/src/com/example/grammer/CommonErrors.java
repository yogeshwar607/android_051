package com.example.grammer;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class CommonErrors extends Activity {
	TextView textview;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.commonerrors);
		textview = (TextView) findViewById(R.id.textViewcommonerrors);
		String str="\n\n1.Practise the 4 core skills:-चार मुख्य कौशल का अभ्यास: पढ़ने, लिखने, बोलने और सुनने की। अपने में सुधार लाने के लिए इन  सभी पर काम करने की आवश्यकता है।\n\n2.Use of Google translate:-यदि आपको किसी  शब्द के उच्चारण में doubt  हैं, तो Google translate का  प्रयोग करे ! गूगल में शब्द का अनुवाद और ऑडियो बटन पर क्लिक करके सही उच्चारण जान सकते हैं |\n\n3.Listen:-शब्दों के उच्चारण को सीखने  के लिए अंग्रेजी में समाचार बुलेटिन और गाने सुनो। आप नए शब्द और भाव इस तरह से सीख सकते हैं। जितना आप सुनंगे उतना आप सीखेंगे ! - इस पर अधिक देखें: \n\n4.Read out loud:-अखबार तथा मैगज़ीन को  जोर जोर से पढ़े, इस तरह से हम अपने  उच्चारण को ठीक कर सकते हैँ तथा अंग्रेजी मेँ एक सही flow  को प्राप्त कर सकते  हैं |\n\n5.Watch English अंग्रेजी पिक्चर देखने की कोशिश करेँ, और  ध्यान दे ओर कि वे किस प्रकार की अंग्रेजी बोल रहे हैं  तथा किस  प्रकार के शब्दोँ का प्रयोग हो रहा हैं  उनके नक़ल  उतारे तथा उनके द्वारा प्रयोग किए गए शब्दोँ का उच्चारण करें|\n\n 6.Make a group:- एक समूह बनाए जिनमे आपके दोस्त आपके परिवार के सदस्य  हो, और  किसी खास समय में सभी इकट्ठा होकर चर्चा करेँ ,लेकिन कोशिश की  करेँ कुछ ऐसे सदस्योँ को सम्म्लित जो  इंग्लिश के जानकार हो  ताकि वे गलती  होने पर मार्गदर्शन कर सके|\n\n7.Chat in English:- यदि आप किसी के साथ चैटिंग कर रहे हो तो कोशिश करेँ की केवल इंग्लिश मेँ ही टाइप करेँ न की हिंदी के शब्दोँ का प्रयोग करेँ ,इस तरह से आप अपनी  अंग्रेजी सुधार सकते हैं. साथ ही  साथ आपकी  स्पेलिंग भी  सुधर जाएगी|\n\n8.Write an article daily:- एक  नियम बनाए, रोज किसी न किसी विषय पर एक आर्टिकल लिखे। आप कोई  भी  टॉपिक ले सकते  हैं।  पहले दिन 10  लाइन लिखे ,अगले दिन किसी और  विषय पर 15  लाइन लिखे फिर 20, इस तरह से आप अपनी writing skill बढ़ा सकते है।\n \n9. Record your voice:- अपने भाषण रिकार्ड करे । अपनी आवाज को सुनें और अपने उच्चारण गलतियों को पकड़ने की कोशिस करे । तथा उनसे बचने के लिए एक जरुरी  का प्रयास करें।";
		textview.setText(str);
		
         
	}
}
