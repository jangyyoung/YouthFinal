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

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;



    Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);

        new GetXMLTask().execute();
    }
    private class GetXMLTask extends AsyncTask<String, Void, Document>{
        @Override
        protected Document doInBackground(String... urls) {
            URL url;
            Document doc = null;
            try {
                url = new URL("https://www.youthcenter.go.kr/opi/empList.do?pageIndex=12&display=100&bizTycdSel=004001,004002,004003,004004,004005,004006&openApiVlak=fd083f54fd5cd486dbcb8567&srchPolyBizSecd=003002008");
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

                s+="----------------------------------------------\n";

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