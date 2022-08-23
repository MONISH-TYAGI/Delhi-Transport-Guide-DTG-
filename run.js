const request = require('request')
const cheerio=require('cheerio');
const fs=require('fs');
const url="https://moovitapp.com/index/en/public_transit-line-8-Delhi-3801-859237-50278278-0";
request(url,cb);
function cb(error, response, html) {
    if(error){
        console.log(error)
    }
    else{
        handleHtml(html)
    }
}
function handleHtml(html)
{   
    let $ = cheerio.load(html)
   // console.log(selTool)
let teamsArr= $('#main-content > section.content-section.lines > div > div.first-column.info-wrapper.lines-wrapper > div.stops-wrapper > ul > li > div > h3');
let data="String []args={";

let blueLineStationArr=[];
console.log(teamsArr.length);
for(let i=0;i<teamsArr.length;i++)
{
     let station=$(teamsArr[i]).text();
     station=station.trim();
    if(i!=teamsArr.length-1)
 data=data+"\n"+'"'+station+'",';
 else
 data=data+"\n"+'"'+station+'"';
 }
data=data+"};"

fs.writeFile('array.java',data,(err)=>{
    if(err)
    {
        console.log(err);
    }else
    {
        console.log("happy");
    }
})
}


