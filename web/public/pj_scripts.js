var urlBase = window.location;
var utlService01 = "webresources/expediente/";
window.onload = new function () {
    //document.getElementById("linkService").innerHTML = urlBase + utlService01;
    showServiceList();
};


function showServiceList() {
    document.getElementById("sList").innerHTML = "";
    var xmlHttp = new XMLHttpRequest();
    xmlHttp.open("GET", urlBase + utlService01 + "all", false); // false for synchronous request
    xmlHttp.send(null);
    var responseGet = xmlHttp.responseText;
    var responseObject = JSON.parse(xmlHttp.responseText);
    console.table(responseObject);
    var html = "";
    for (var i = 0; i < responseObject.length; i++) {
        if (i != 0) {
            html += "" +
                    '  <li class="cards_item">' +
                    '      <div class="card">' +
                    '          <div class="card_content">' +
                    '              <h2 class="card_title">' + responseObject[i].descripcion + '</h2> ' +
                    '              <p class="card_text" id="linkService">' + urlBase + responseObject[i].urlService + '<B>{CODIGO}</B></p> ' +
                    '              <p class="card_text">Obtener expidiente por Codigo Barras</p> ' +
                    '              <label for="InputValue_' + i + '" >Codigo Barras</label> ' +
                    '              <input id="InputValue_' + i + '" value="22018011850901834000403" class=""/><br><br> ' +
                    '              <button class="btn card_btn" onclick="showValueInput( \'' + responseObject[i].urlService + '\',\'' + i + '\');">probar servicio</button> ' +
                    '              <textarea   style="padding: 8px;width: 100%;max-width: 100%;" id="result_' + i + '" ></textarea> ' +
                    '              <button class="btn card_btn" onclick="showBESTJSON(' + i + ');">VER ORDENADO</button> ' +
                    '          </div>' +
                    '     </div>' +
                    '  </li>';
        }
    }
    document.getElementById("sList").innerHTML = html;
}

function showValueInput(urlService, positionList) {
    console.log("showValueInput");
    document.getElementById("result_" + positionList).innerHTML = "";
    var inputValue = document.getElementById("InputValue_" + positionList).value;
    var xmlHttp = new XMLHttpRequest();
    xmlHttp.open("GET", urlBase + urlService + inputValue, false); // false for synchronous request
    xmlHttp.send(null);
    var responseGet = xmlHttp.responseText;
    document.getElementById("result_" + positionList).innerHTML = responseGet;
}

function showBESTJSON(positionList) {
    document.getElementById("enbedFrame").src =
            'https://codebeautify.org/jsonviewer?input='
            + document.getElementById("result_" + positionList).value;
}    