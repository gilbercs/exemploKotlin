package br.com.gilbercs.exemplokotlin.container

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import br.com.gilbercs.exemplokotlin.R

class WebViewActivity : AppCompatActivity() {
    //declaração de variaveis para os componentes visuais do app
    lateinit var navWebView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        navWebView = findViewById(R.id.idWebView)
        //informando a url
        navWebView.loadUrl("https://bit.ly/curso_criar_aplicativo_kotlin")
        //atribuindo a url a variavel web
        val web = navWebView.settings
        web.javaScriptEnabled = true
        navWebView.webViewClient = WebViewClient()
    }
    //definir a ação da atividade
    override fun onBackPressed() {
        //CanGoBack para determinar se há pelo menos uma entrada no histórico de navegação regressiva
        if (navWebView.canGoBack()){
            //GoBack() é chamado quando não existem entradas no histórico de navegação de retorno.
            navWebView.goBack()
        }else {
            super.onBackPressed()
        }
    }

}