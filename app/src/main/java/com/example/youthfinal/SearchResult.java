package com.example.youthfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class SearchResult extends AppCompatActivity {
    EditText editText;
    TextView textView;
    Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new GetXMLTask().execute();
            }
        });
    }
    private class GetXMLTask extends AsyncTask<String, Void, Document>{
        @Override
        protected Document doInBackground(String... urls) {

            String pageIndex = "1";
            String display = "100";
            String bizTycdSel = "004001,004002,004003,004004,004005,004006";
            String srchPolyBizSecd = "003002008";
            final String search = editText.getText().toString();
            String strUrl;
            String strUrl1;
            if (search.contains("수원시")) {
                srchPolyBizSecd += "001";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;}
            else if (search.contains("성남시")) {
                srchPolyBizSecd += "002";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd; }
            else if (search.contains("의정부시")) {
                srchPolyBizSecd += "003";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("안양시")) {
                srchPolyBizSecd += "004";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("부천시")) {
                srchPolyBizSecd += "005";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("광명시")) {
                srchPolyBizSecd += "006";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("평택시")) {
                srchPolyBizSecd += "007";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("동두천시")) {
                srchPolyBizSecd += "008";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("안산시")) {
                srchPolyBizSecd += "009";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("고양시")) {
                srchPolyBizSecd += "010";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("과천시")) {
                srchPolyBizSecd += "011";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("구리시")) {
                srchPolyBizSecd += "012";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("남양주시")) {
                srchPolyBizSecd += "013";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("오산시")) {
                srchPolyBizSecd += "014";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("시흥시")) {
                srchPolyBizSecd += "015";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("군포시")) {
                srchPolyBizSecd += "016";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("의왕시")) {
                srchPolyBizSecd += "017";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("하남시")) {
                srchPolyBizSecd += "018";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("용인시")) {
                srchPolyBizSecd += "019";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("파주시")) {
                srchPolyBizSecd += "020";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("이천시")) {
                srchPolyBizSecd += "021";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("안성시")) {
                srchPolyBizSecd += "022";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("김포시")) {
                srchPolyBizSecd += "023";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("화성시")) {
                srchPolyBizSecd += "024";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("광주시")) {
                srchPolyBizSecd += "025";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("양주시")) {
                srchPolyBizSecd += "026";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("포천시")) {
                srchPolyBizSecd += "027";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("여주시")) {
                srchPolyBizSecd += "028";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("양주군")) {
                srchPolyBizSecd += "029";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("여주군")) {
                srchPolyBizSecd += "030";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("연천군")) {
                srchPolyBizSecd += "031";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("포천군")) {
                srchPolyBizSecd += "032";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("가평군")) {
                srchPolyBizSecd += "033";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("양평군")) {
                srchPolyBizSecd += "034";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            if (search.contains("취업 지원")) {
                bizTycdSel = "004001";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            if (search.contains("취업 지원")) {
                bizTycdSel = "004001";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            if (search.contains("창업 지원")) {
                bizTycdSel = "004002";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            if (search.contains("주거") || search.equals("금융")) {
                bizTycdSel = "004003";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("생활") || search.contains("복지")) {
                bizTycdSel = "004004";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            if (search.contains("정책 참여")) {
                bizTycdSel = "004005";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            if (search.contains("코로나19")) {
                bizTycdSel = "004005";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else {
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + search +"&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }

            URL url;
            Document doc = null;
            try {
                url = new URL(strUrl);
                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                DocumentBuilder db = dbf.newDocumentBuilder();
                doc = db.parse(new InputSource(url.openStream()));
                doc.getDocumentElement().normalize();

            } catch (Exception e) {
                Toast.makeText(getBaseContext(), "Parsing Error", Toast.LENGTH_SHORT).show();
            }
            return doc;
        }

        @Override
        protected void onPostExecute(Document doc) {

            String s = "";
            NodeList nodeList = doc.getElementsByTagName("emp");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                Element fstElmnt = (Element) node;
                s+="-------------------------------------------------------------\n";

                NodeList polyBizSjnm = fstElmnt.getElementsByTagName("polyBizSjnm");
                s += "정책 이름 : " + polyBizSjnm.item(0).getChildNodes().item(0).getNodeValue() + "\n";

                NodeList rqutPrdCn = fstElmnt.getElementsByTagName("rqutPrdCn");
                s += "신청 기간 : " + rqutPrdCn.item(0).getChildNodes().item(0).getNodeValue() + "\n";

                NodeList rqutUrla = fstElmnt.getElementsByTagName("rqutUrla");
                s += "신청 주소 : " + rqutUrla.item(0).getChildNodes().item(0).getNodeValue() + "\n";

                NodeList sporScvl = fstElmnt.getElementsByTagName("sporScvl");
                s += "지원 규모 : " + sporScvl.item(0).getChildNodes().item(0).getNodeValue() + "\n";
            }

            textView.setText(s);

            super.onPostExecute(doc);
        }
    }
}