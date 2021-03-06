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
            if (search.contains("?????????")) {
                srchPolyBizSecd += "001";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;}
            else if (search.contains("?????????")) {
                srchPolyBizSecd += "002";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd; }
            else if (search.contains("????????????")) {
                srchPolyBizSecd += "003";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("?????????")) {
                srchPolyBizSecd += "004";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("?????????")) {
                srchPolyBizSecd += "005";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("?????????")) {
                srchPolyBizSecd += "006";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("?????????")) {
                srchPolyBizSecd += "007";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("????????????")) {
                srchPolyBizSecd += "008";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("?????????")) {
                srchPolyBizSecd += "009";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("?????????")) {
                srchPolyBizSecd += "010";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("?????????")) {
                srchPolyBizSecd += "011";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("?????????")) {
                srchPolyBizSecd += "012";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("????????????")) {
                srchPolyBizSecd += "013";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("?????????")) {
                srchPolyBizSecd += "014";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("?????????")) {
                srchPolyBizSecd += "015";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("?????????")) {
                srchPolyBizSecd += "016";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("?????????")) {
                srchPolyBizSecd += "017";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("?????????")) {
                srchPolyBizSecd += "018";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("?????????")) {
                srchPolyBizSecd += "019";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("?????????")) {
                srchPolyBizSecd += "020";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("?????????")) {
                srchPolyBizSecd += "021";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("?????????")) {
                srchPolyBizSecd += "022";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("?????????")) {
                srchPolyBizSecd += "023";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("?????????")) {
                srchPolyBizSecd += "024";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("?????????")) {
                srchPolyBizSecd += "025";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("?????????")) {
                srchPolyBizSecd += "026";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("?????????")) {
                srchPolyBizSecd += "027";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("?????????")) {
                srchPolyBizSecd += "028";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("?????????")) {
                srchPolyBizSecd += "029";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("?????????")) {
                srchPolyBizSecd += "030";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("?????????")) {
                srchPolyBizSecd += "031";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("?????????")) {
                srchPolyBizSecd += "032";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("?????????")) {
                srchPolyBizSecd += "033";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("?????????")) {
                srchPolyBizSecd += "034";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            if (search.contains("?????? ??????")) {
                bizTycdSel = "004001";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            if (search.contains("?????? ??????")) {
                bizTycdSel = "004001";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            if (search.contains("?????? ??????")) {
                bizTycdSel = "004002";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            if (search.contains("??????") || search.equals("??????")) {
                bizTycdSel = "004003";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            else if (search.contains("??????") || search.contains("??????")) {
                bizTycdSel = "004004";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            if (search.contains("?????? ??????")) {
                bizTycdSel = "004005";
                strUrl = "https://www.youthcenter.go.kr/opi/empList.do?pageIndex=" + pageIndex + "&display=" + display +
                        "&query=" + "&bizTycdSel=" + bizTycdSel + "&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=" + srchPolyBizSecd;
            }
            if (search.contains("?????????19")) {
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
                s += "?????? ?????? : " + polyBizSjnm.item(0).getChildNodes().item(0).getNodeValue() + "\n";

                NodeList rqutPrdCn = fstElmnt.getElementsByTagName("rqutPrdCn");
                s += "?????? ?????? : " + rqutPrdCn.item(0).getChildNodes().item(0).getNodeValue() + "\n";

                NodeList rqutUrla = fstElmnt.getElementsByTagName("rqutUrla");
                s += "?????? ?????? : " + rqutUrla.item(0).getChildNodes().item(0).getNodeValue() + "\n";

                NodeList sporScvl = fstElmnt.getElementsByTagName("sporScvl");
                s += "?????? ?????? : " + sporScvl.item(0).getChildNodes().item(0).getNodeValue() + "\n";
            }

            textView.setText(s);

            super.onPostExecute(doc);
        }
    }
}