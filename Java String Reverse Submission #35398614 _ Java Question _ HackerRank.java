<!DOCTYPE html>
<!-- saved from url=(0083)https://www.hackerrank.com/challenges/java-string-reverse/submissions/code/35398614 -->
<html lang="en" class=" mod_js mod_flexbox mod_flexboxlegacy mod_canvas mod_canvastext mod_webgl mod_touch mod_geolocation mod_history mod_draganddrop mod_rgba mod_hsla mod_multiplebgs mod_backgroundsize mod_borderimage mod_borderradius mod_boxshadow mod_textshadow mod_opacity mod_cssanimations mod_csscolumns mod_cssgradients mod_cssreflections mod_csstransforms mod_csstransforms3d mod_csstransitions mod_fontface mod_generatedcontent mod_video mod_audio mod_applicationcache mod_svg mod_inlinesvg mod_smil mod_svgclippaths mod_csscalc mod_fullscreen mod_cssresize mod_no-ie8compat"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript" async="" src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/BizibleAcct.js"></script><script id="twitter-wjs" src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/widgets.js"></script><script id="facebook-jssdk" src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/sdk.js"></script><script src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/bizible.js"></script><script async="" src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/fbds.js"></script><script type="text/javascript" async="" src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/filepicker.js"></script><script type="text/javascript" async="" src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/mixpanel-2.2.min.js"></script><script type="text/javascript" async="" src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/ga.js"></script><script src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/50b78854cb2e10773a00002d.js" async=""></script><script type="text/javascript">
        function set_manifest(manifest) {
            HR.MANIFEST = manifest;
        }
    </script>
    <script type="text/javascript">
  window.PRODUCT_NAMESPACE = 'hackerrank'
  window.APP_METRIC_TRACKING_ENABLED = false
  window.PERF_METRICS = {
    tracked_initial_view_load_tti: {},
    tracked_view_load_tti: {}
  }
    if ((window.PRODUCT_NAMESPACE == 'hackerrank' || window.PRODUCT_NAMESPACE == 'hackerrankx') && (Math.floor(Math.random() * 2) + 1) == 1) {
      window.APP_METRIC_TRACKING_ENABLED = true
    }
</script>
<!-- jsCookies -->
  <script type="text/javascript">
    /*!
 * JavaScript Cookie v2.1.2
 * https://github.com/js-cookie/js-cookie
 *
 * Copyright 2006, 2015 Klaus Hartl & Fagner Brack
 * Released under the MIT license
 */
if(function(factory){if("function"==typeof define&&define.amd)define(factory);else if("object"==typeof exports)module.exports=factory();else{var OldCookies=window.Cookies,api=window.Cookies=factory();api.noConflict=function(){return window.Cookies=OldCookies,api}}}(function(){function extend(){for(var i=0,result={};i<arguments.length;i++){var attributes=arguments[i];for(var key in attributes)result[key]=attributes[key]}return result}function init(converter){function api(key,value,attributes){var result;if("undefined"!=typeof document){if(arguments.length>1){if(attributes=extend({path:"/"},api.defaults,attributes),"number"==typeof attributes.expires){var expires=new Date;expires.setMilliseconds(expires.getMilliseconds()+864e5*attributes.expires),attributes.expires=expires}try{result=JSON.stringify(value),/^[\{\[]/.test(result)&&(value=result)}catch(e){}return value=converter.write?converter.write(value,key):encodeURIComponent(String(value)).replace(/%(23|24|26|2B|3A|3C|3E|3D|2F|3F|40|5B|5D|5E|60|7B|7D|7C)/g,decodeURIComponent),key=encodeURIComponent(String(key)),key=key.replace(/%(23|24|26|2B|5E|60|7C)/g,decodeURIComponent),key=key.replace(/[\(\)]/g,escape),document.cookie=[key,"=",value,attributes.expires&&"; expires="+attributes.expires.toUTCString(),attributes.path&&"; path="+attributes.path,attributes.domain&&"; domain="+attributes.domain,attributes.secure?"; secure":""].join("")}key||(result={});for(var cookies=document.cookie?document.cookie.split("; "):[],rdecode=/(%[0-9A-Z]{2})+/g,i=0;i<cookies.length;i++){var parts=cookies[i].split("="),cookie=parts.slice(1).join("=");'"'===cookie.charAt(0)&&(cookie=cookie.slice(1,-1));try{var name=parts[0].replace(rdecode,decodeURIComponent);if(cookie=converter.read?converter.read(cookie,name):converter(cookie,name)||cookie.replace(rdecode,decodeURIComponent),this.json)try{cookie=JSON.parse(cookie)}catch(e){}if(key===name){result=cookie;break}key||(result[name]=cookie)}catch(e){}}return result}}return api.set=api,api.get=function(key){return api(key)},api.getJSON=function(){return api.apply({json:!0},[].slice.call(arguments))},api.defaults={},api.remove=function(key,attributes){api(key,"",extend(attributes,{expires:-1}))},api.withConverter=init,api}return init(function(){})}),"undefined"==typeof jsCookies&&"undefined"!=typeof Cookies)var jsCookies={get:function(c_name){return Cookies.get(c_name)},set:function(c_name,value,expiredays,expirehours,expiremins,expiresecs){var exdate=new Date;exdate.setDate(exdate.getDate()+(expiredays||0)),exdate.setHours(exdate.getHours()+(expirehours||0)),exdate.setMinutes(exdate.getMinutes()+(expiremins||0)),exdate.setSeconds(exdate.getSeconds()+(expiresecs||0));var set_expire_time=!(null==expiredays&&null==expiresecs&&null==expiremins&&null==expirehours),config=set_expire_time?{expires:exdate}:{};Cookies.set(c_name,value,config)},check:function(c_name){return!!Cookies.get(c_name)},destroy:function(c_name){Cookies.remove(c_name)}};
  </script>

<script type="text/javascript">
  !function(){function getRandRange(min,max){return parseInt(Math.random()*(max-min))+min}function getRandChar(){var offset=getRandRange(0,35);return offset>25?(offset-26).toString():String.fromCharCode(97+offset)}function makeId(length){for(var text="",i=0;length>i;i++)text+=getRandChar();return text}function setSessionId(){key="session_id";var session_key=jsCookies.get(key);session_key?jsCookies.set(key,session_key,null,2):(epoch=(new Date).getTime(),rand_id=makeId(8),jsCookies.set(key,rand_id+"-"+epoch.toString(),null,2)),setTimeout(setSessionId,6e4)}setSessionId()}();
</script>

<!-- CDN Failsafe -->
    <style>
  .cdn-error-view {
    position: fixed;
    width: 100%;
    height: 100%;
    top: 0;
    left: 0;
    background: white;
    z-index: 9999;
    font-family: "Whitney SSm A", "Whitney SSm B", "Avenir", "Segoe UI", "Ubuntu", "Helvetica Neue", Helvetica, Arial, sans-serif;
  }

  .cdn-error-view .error-box-wrap {
    position: absolute;
    top: 50%;
    left: 50%;
    padding: 20px;
    transform: translate(-50%, -50%);
    -ms-transform: translate(-50%, -50%);
    -webkit-transform: translate(-50%, -50%);
    text-align: center;
  }
  .cdn-error-view .error-icon {
    text-align: center;
  }
  .cdn-error-view .error-title {
    font-size: 48px;
    margin-top: 30px;
    margin-bottom: 0;
    font-weight: bold;
  }
  .cdn-error-view .error-message {
    margin-top: 20px;
    margin-bottom: 0;
  }
  .cdn-error-view .btn-wrap {
    margin-top: 20px;
  }
  .cdn-error-view .btn-reload {
    width: 300px;
    padding: 10px;
    border-radius: 3px;
    border-color: #088837;
    border-bottom-color: #007827;
    border-width: 1px;
    border-style: solid;
    color : #FFF;
    background-color: #2ec866;
    background-image: -webkit-gradient(linear, top left, bottom left, color-stop(0, #2ec866), color-stop(1, #29b35b));
    background-image: -webkit-linear-gradient(top, #2ec866, #29b35b);
    background-image: linear-gradient(top, #2ec866, #29b35b);
    box-shadow: 0 1px 3px rgba(0, 0, 0, 0.2), inset 0 1px 1px rgba(255, 255, 255, 0.1), inset 0 -1px 4px rgba(32, 138, 70, 0.3);
    outline: none;
  }
</style>

<script>
  var cdnLoaded = false;

  var checkForWorkingCDN = (function() {
    //this two value should come from configuration
    var cdns = ["hackerrank-a.akamaihd.net"];
    var cdnUrl = jsCookies.get('cdn_url') || cdns[0];
    var filePath = "https://hackerrank-a.akamaihd.net/hackerrank/assets/cdnping-691df18f10507ce98520c220c2ee3e60.js";

    //extract pathname from url
    var urlRegex = /^[^#]*?:\/\/.*?(\/.*)$/ ;
    var match = filePath.match(urlRegex);
    if(match) filePath = match[1];

    //add current cdn on first of array
    cdns.splice(cdns.indexOf(cdnUrl), 1);
    cdns.unshift(cdnUrl);

    var cdnIndx = 0;

    function tryCurrentCDN() {
      if (cdnUrl) document.write('<script src="https://' + cdnUrl + filePath + '?' + Date.now() + '"><\/script>');
      document.write('<script>checkForWorkingCDN();<\/script>');
    }

    //try the current cdn
    tryCurrentCDN();

    return function() {
      if (cdnUrl && cdnLoaded) {
        jsCookies.set('cdn_url', cdnUrl, 3);
        jsCookies.set('cdn_set', 'true', 3);
        if (cdnIndx !== 0) {
          document.location.reload();
        }

      //if cdnUrl not loaded check the next cdn;
      } else if (cdnUrl) {
        //track all the failed cdn
        var failedCdns = jsCookies.get('failed_cdn_hosts');
        if (failedCdns) {
          failedCdns = JSON.parse(failedCdns);
        } else {
          failedCdns = [];
        }

        failedCdns.push(cdnUrl);
        jsCookies.set('failed_cdn_hosts', JSON.stringify(failedCdns), 0, 0, 15);
        jsCookies.set("cdn_url_switched", "true", 0, 0, 15);

        //try next cdn
        cdnIndx += 1;
        cdnUrl = cdns[cdnIndx];
        tryCurrentCDN();

      //if no cdn left to check and none of loaded return err
      } else {
        jsCookies.destroy('cdn_url');
        return 'cdnerror';
      }
    }
  }());
</script><script src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/cdnping-691df18f10507ce98520c220c2ee3e60.js"></script><script>checkForWorkingCDN();</script>

<script>
  //track cdn related matrices
  (function() {
    var allCdns = ["hackerrank-a.akamaihd.net"];

    var metrics = [];
    var defaultCdn = jsCookies.get('default_cdn_url');

    //method to track the events
    function appTrack(key, attrs) {
      attrs = attrs || {};
      attrs.uid = jsCookies.get('hackerrank_mixpanel_token')
      metrics.push({
        'key': key,
        'meta_data': attrs
      });
    }

    function sendMetrices() {
      if (!XMLHttpRequest) return;
      var xhr = new XMLHttpRequest();
      var metrics_endpoint = 'https://metrics.hackerrank.com/app_metrics'; // Todo : this need to move on configuration

      if (!xhr) return;

      xhr.open("POST", metrics_endpoint, true);

      //set xhr headers and options
      xhr.setRequestHeader('Content-Type', 'application/json');
      xhr.withCredentials = true;

      xhr.send(JSON.stringify({
        data: metrics,
        default_cdn_url: defaultCdn,
        document_referrer: document.referrer
      }));
    }

    var cdnUrl = jsCookies.get('cdn_url');
    var failedCdns = jsCookies.get('failed_cdn_hosts');

    var cdnMetrices = {};

    //track used cdn host
    if (cdnUrl) {
      cdnMetrices['used-cdn'] = cdnUrl;
      cdnMetrices['cdn-index'] = allCdns.indexOf(cdnUrl) + 1;
      cdnMetrices['all-failed'] = false;
    //track if all cdn failed (If cdnUrl is not set it means all cdn url failed)
    } else {
      cdnMetrices['used-cdn'] = '';
      cdnMetrices['cdn-index'] = 999;
      cdnMetrices['all-failed'] = true;
    }

    appTrack('cdn-metrices', cdnMetrices);

    //track failed cdn
    if (failedCdns) {
      failedCdns = JSON.parse(failedCdns);
      jsCookies.destroy('failed_cdn_hosts');
      failedCdns.forEach(function(cdn) {
        appTrack('failed-cdn-host', {
          cdn: cdn
        });
      });
    }

    //send metrics
    sendMetrices();

  }());
</script>





<!-- DNS Prefetch -->
<link rel="dns-prefetch" href="https://hrcdn.net/">
<link rel="dns-prefetch" href="https://d3keuzeb2crhkn.cloudfront.net/">
<link rel="dns-prefetch" href="https://notifications.hackerrank.com/">
<link rel="dns-prefetch" href="https://api.mixpanel.com/">
<link rel="dns-prefetch" href="https://heapanalytics.com/">
<link rel="dns-prefetch" href="https://metrics.hackerrank.com/">

<!-- use the latest IE browser -->
<meta http-equiv="X-UA-Compatible" content="IE=Edge">

<!-- App Icon for iOS Devices -->
<link rel="apple-touch-icon-precomposed" href="https://hackerrank-a.akamaihd.net/hackerrank/assets/apple-touch-icon-precomposed-f3a05ded63a04623e70f9809d4de3fb0.png">

<!-- favicon -->
<link href="https://hackerrank-a.akamaihd.net/hackerrank/assets/favicon-5bb50091f1911aa90950eca8b575d496.ico" rel="shortcut icon" type="image/vnd.microsoft.icon">

<!-- generating meta tags -->


<meta name="description" content="Join over 1 million developers in solving code challenges on HackerRank, one of the best ways to prepare for programming interviews.">
<meta property="og:title" content="Solve Java Code Challenges">
<meta property="og:image" content="https://hrcdn.net/og/default.jpg">
<meta property="og:description" content="Join over 1 million developers in solving code challenges on HackerRank, one of the best ways to prepare for programming interviews.">
<meta property="og:url" content="https://www.hackerrank.com/domains/java">
<meta property="og:site_name" content="HackerRank">
<meta property="og:type" content="website">
<meta name="twitter:card" content="summary">
<meta name="twitter:site" content="@hackerrank">
<meta name="twitter:url" content="https://www.hackerrank.com">
<meta name="twitter:title" content="HackerRank">
<meta property="fb:app_id" content="347499128655783">

<!-- ends meta tags generation -->

<!-- CSRF Token -->
<meta content="authenticity_token" name="csrf-param">
<meta content="QTTtyJ4kWl1NYMPULdiNXdWhK6S42laLwYmRW/kXlOE=" name="csrf-token">

  <link href="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/hackerrank_libraries-0bc586844538db62121fc8e2ee69c139.css" media="all" rel="stylesheet">
  <link href="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/hackerrank-core-b013bbd499d754dd4d1f627dfadb1909.css" media="all" rel="stylesheet">
  <link href="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/dashboard-d2d787994d94a745c3268beb9f6ffca1.css" media="all" rel="stylesheet">

<!-- Google Analyitics Init -->
<script type="text/javascript">
    var _gaq = _gaq || [];
    _gaq.push(['_setAccount', "UA-45092266-1"]);
    _gaq.push(['_trackPageview']);
    _gaq.push(['_setCampSourceKey', 'utm_source']);
    _gaq.push(['_setCampMediumKey', 'utm_medium']);
    _gaq.push(['_setCampContentKey', 'utm_keyword']);
    _gaq.push(['_setCampTermKey', 'utm_keyword']);
    _gaq.push(['_setCampNameKey', 'utm_campaign']);
</script>

<!-- Totango init -->
<script>
    totango = null;
</script>

<!-- Mixpanel Init -->
<script type="text/javascript">
    var mixpanel = mixpanel || [];
</script>

<!-- Heap Analytics Init -->
<script type="text/javascript">
    var heap = heap || [];
</script>

<script type="text/javascript">
  (function(h) {
    window.hr_metrics = h;
    if (!h.loaded) {
      var a = ['track', 'batch_track', 'app_track', 'externalService', 'init', 'batch_track_record', 'track_dwell_time', 'set_navigation_data'];
      for (var i = 0; i < a.length; i++) {
        if (!h[a[i]]) {h[a[i]] = function() {};}
      }
    }
  })(window.hr_metrics || {});
</script>

<script type="text/javascript">
    /**
     * Protect window.console method calls, e.g. console is not defined on IE
     * unless dev tools are open, and IE doesn't define console.debug
     */
(function() {
    if (!window.console) {
      window.console = {};
    }
    var m = ["log", "info", "warn", "error", "debug", "trace", "dir", "group", "groupCollapsed", "groupEnd", "time", "timeEnd", "profile", "profileEnd", "dirxml", "assert", "count", "markTimeline", "timeStamp", "clear"];
    // define undefined methods as noops to prevent errors
    for (var i = 0; i < m.length; i++) {
        if (!window.console[m[i]]) {
            window.console[m[i]] = function() {};
        }
    }
})();
</script>


<!-- Errorception -->

    <script type="text/javascript">
    if ('hackerrank' !== 'hackerrank' || window.cdnLoaded) {
      (function(_,e,rr,s){_errs=[s];var c=_.onerror;_.onerror=function(){var a=arguments;_errs.push(a);
       c&&c.apply(this,a)};var b=function(){var c=e.createElement(rr),b=e.getElementsByTagName(rr)[0];
       c.src="//beacon.errorception.com/"+s+".js";c.async=!0;b.parentNode.insertBefore(c,b)};
       _.addEventListener?_.addEventListener("load",b,!1):_.attachEvent("onload",b)})
       (window,document,"script","50b78854cb2e10773a00002d");

       _errs.meta = {
           handle: 'akiakhilesh16',
           loadTimestamp: 1484152390,
           assetUrl: 'https://hackerrank-a.akamaihd.net',
           cdnUrl: 'd3keuzeb2crhkn.cloudfront.net'
       };
     }
     </script>

  <script type="text/javascript">
    var pusher_app_key = '31902f926540a4ddc81d';
  </script>

    <!-- General Information -->
    <title>Java String Reverse Submission #35398614 | Java Question | HackerRank</title>

    <!--  TODO : This need to be configured from configuration file -->
      <script type="text/javascript" charset="utf-8" async="" data-requirecontext="_" data-requiremodule="https://hackerrank-a.akamaihd.net/hackerrank/assets/compound/extra-views-e955deae482c0824b742bb11f07fa100.js" src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/extra-views-e955deae482c0824b742bb11f07fa100.js"></script><script type="text/javascript" charset="utf-8" async="" data-requirecontext="_" data-requiremodule="https://hackerrank-a.akamaihd.net/hackerrank/assets/compound/challenge-views-3031844b6ef94d017545cc897f171bb7.js" src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/challenge-views-3031844b6ef94d017545cc897f171bb7.js"></script><script type="text/javascript" charset="utf-8" async="" data-requirecontext="_" data-requiremodule="https://hackerrank-a.akamaihd.net/hackerrank/assets/codemirror_basic-8e5c2ce8406a7806e5d520560786cfc9.js" src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/codemirror_basic-8e5c2ce8406a7806e5d520560786cfc9.js"></script><script type="text/javascript" charset="utf-8" async="" data-requirecontext="_" data-requiremodule="https://hackerrank-a.akamaihd.net/hackerrank/assets/codemirror/mode/clike/clike-47d52ae424b65e52a8c9bcb738c4b668.js" src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/clike-47d52ae424b65e52a8c9bcb738c4b668.js"></script><script type="text/javascript" charset="utf-8" async="" data-requirecontext="_" data-requiremodule="https://hackerrank-a.akamaihd.net/hackerrank/assets/compound/submission-views-b913cb9d30defd943b9942affc73a662.js" src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/submission-views-b913cb9d30defd943b9942affc73a662.js"></script><script type="text/javascript" charset="utf-8" async="" data-requirecontext="_" data-requiremodule="https://hackerrank-a.akamaihd.net/hackerrank/assets/compound/websocket-libraries-a8c69d347dca1d44025a885429259e2f.js" src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/websocket-libraries-a8c69d347dca1d44025a885429259e2f.js"></script><script type="text/javascript" charset="utf-8" async="" data-requirecontext="_" data-requiremodule="https://hackerrank-a.akamaihd.net/hackerrank/assets/compound/game-views-204649dd043a0fbad40fcd31c560dad8.js" src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/game-views-204649dd043a0fbad40fcd31c560dad8.js"></script><!--<base href="https://www.hackerrank.com/">--><base href=".">

    <script type="text/javascript">
      var HR;
      HR = window.HR || {};
      HR.PREFETCH_DATA = {"metadata":{"asset_path":"https://hackerrank-a.akamaihd.net/hackerrank/assets","asset_host_path":"https://hackerrank-a.akamaihd.net/hackerrank","filepicker_key":"ApehXMbvXTWqWab7OmMr9z","pubsub_host":"https://pubsub.hackerrank.com","landing_contest_slug":"master","current_contest_namespace":"","using_contest_namespace":false},"slugs":{"master":{"type":"contest"},"akiakhilesh16":{"type":"hacker"}},"contest":{"id":1,"name":"Master","slug":"master","created_at":"2012-07-19T17:13:20.000Z","updated_at":"2016-05-06T21:20:13.000Z","starttime":null,"endtime":null,"timezone":"America/Los_Angeles","homepage":"","tagline":"","description":"","homepage_background_color":"","notification":null,"template_id":454,"expose_stats":null,"public":false,"team_event":false,"rating_category":null,"is_rating_updated":false,"leaderboard_backend":null,"leaderboard_format":"","primary_track_id":null,"college_public":false,"rated":false,"is_multi_round":false,"parent_contest_id":null,"started":true,"ended":false,"epoch_endtime":0,"epoch_starttime":0,"time_left":null,"hide_difficulty":null,"has_tracks":true,"archived":false,"leaderboard_type":"country","kind":"","leaderboard_freeze_time":null,"show_penalty":false,"track":null,"hide_navigation":null,"contest_broadcast":null,"hide_leaderboard":null,"hide_submissions":null,"leaderboard_out_of_sync":null,"leaderboard_out_of_sync_message":null,"challenges_count":null,"show_participants_info":null,"custom_leaderboard_column_name":null,"disable_forum":false,"disable_fsi":null,"has_codesprint_reg_page":null,"hidden":null,"comment_live_sync":null,"company_associated_contest":null,"limited_participants":null,"leaderboard_broadcast_message":null,"qualification_rule_type":null,"qualification_rule_value":0,"qualification_rule_msg":null,"migration_status":null,"migration_disabled":null,"testers_contest":null,"time_limited_contest":false,"hacker_timelimit":null,"school_leaderboard_enabled":false,"organization_type":null,"organization_name":null,"categories":[{"id":24,"name":"Tutorials","slug":"tutorials","children":[{"id":"24-146","name":"30 Days of Code","slug":"30-days-of-code","priority":10000,"order_challenge_by":1,"challenges_per_page":null},{"id":"24-149","name":"Cracking the Coding Interview","slug":"cracking-the-coding-interview","priority":100,"order_challenge_by":1,"challenges_per_page":20},{"id":"24-147","name":"10 Days of Statistics","slug":"10-days-of-statistics","priority":1,"order_challenge_by":1,"challenges_per_page":null},{"id":"24-150","name":"LinkedIn Placements","slug":"linkedin-placements","priority":1,"order_challenge_by":1,"challenges_per_page":null}]},{"id":3,"name":"Algorithms","slug":"algorithms","children":[{"id":"3-43","name":"Warmup","slug":"warmup","priority":22,"order_challenge_by":1,"challenges_per_page":null},{"id":"3-108","name":"Implementation","slug":"implementation","priority":21,"order_challenge_by":1,"challenges_per_page":null},{"id":"3-151","name":"Constructive Algorithms","slug":"constructive-algorithms","priority":21,"order_challenge_by":1,"challenges_per_page":null},{"id":"3-34","name":"Strings","slug":"strings","priority":20,"order_challenge_by":1,"challenges_per_page":null},{"id":"3-38","name":"Sorting","slug":"arrays-and-sorting","priority":20,"order_challenge_by":1,"challenges_per_page":null},{"id":"3-36","name":"Search","slug":"search","priority":19,"order_challenge_by":1,"challenges_per_page":null},{"id":"3-33","name":"Graph Theory","slug":"graph-theory","priority":17,"order_challenge_by":1,"challenges_per_page":null},{"id":"3-59","name":"Greedy","slug":"greedy","priority":16,"order_challenge_by":1,"challenges_per_page":null},{"id":"3-35","name":"Dynamic Programming","slug":"dynamic-programming","priority":15,"order_challenge_by":1,"challenges_per_page":null},{"id":"3-30","name":"Bit Manipulation","slug":"bit-manipulation","priority":14,"order_challenge_by":1,"challenges_per_page":null},{"id":"3-153","name":"Recursion","slug":"recursion","priority":12,"order_challenge_by":1,"challenges_per_page":null},{"id":"3-47","name":"Game Theory","slug":"game-theory","priority":7,"order_challenge_by":1,"challenges_per_page":null},{"id":"3-29","name":"NP Complete","slug":"np-complete-problems","priority":6,"order_challenge_by":1,"challenges_per_page":null}]},{"id":17,"name":"Data Structures","slug":"data-structures","children":[{"id":"17-134","name":"Arrays","slug":"arrays","priority":11,"order_challenge_by":1,"challenges_per_page":null},{"id":"17-39","name":"Linked Lists","slug":"linked-lists","priority":10,"order_challenge_by":1,"challenges_per_page":null},{"id":"17-96","name":"Trees","slug":"trees","priority":9,"order_challenge_by":1,"challenges_per_page":null},{"id":"17-119","name":"Balanced Trees","slug":"balanced-trees","priority":7,"order_challenge_by":1,"challenges_per_page":null},{"id":"17-97","name":"Stacks","slug":"stacks","priority":2,"order_challenge_by":1,"challenges_per_page":null},{"id":"17-98","name":"Queues","slug":"queues","priority":2,"order_challenge_by":1,"challenges_per_page":null},{"id":"17-99","name":"Heap","slug":"heap","priority":2,"order_challenge_by":1,"challenges_per_page":null},{"id":"17-100","name":"Disjoint Set","slug":"disjoint-set","priority":2,"order_challenge_by":1,"challenges_per_page":null},{"id":"17-113","name":"Multiple Choice","slug":"multiple-choice","priority":1,"order_challenge_by":1,"challenges_per_page":null},{"id":"17-118","name":"Trie","slug":"trie","priority":1,"order_challenge_by":1,"challenges_per_page":null},{"id":"17-32","name":"Advanced","slug":"data-structures","priority":0,"order_challenge_by":1,"challenges_per_page":null}]},{"id":22,"name":"Mathematics","slug":"mathematics","children":[{"id":"22-109","name":"Fundamentals","slug":"fundamentals","priority":21,"order_challenge_by":1,"challenges_per_page":null},{"id":"22-52","name":"Number Theory","slug":"number-theory","priority":12,"order_challenge_by":1,"challenges_per_page":null},{"id":"22-51","name":"Combinatorics","slug":"combinatorics","priority":11,"order_challenge_by":1,"challenges_per_page":null},{"id":"22-55","name":"Algebra","slug":"algebra","priority":10,"order_challenge_by":1,"challenges_per_page":null},{"id":"22-54","name":"Geometry","slug":"geometry","priority":9,"order_challenge_by":1,"challenges_per_page":null},{"id":"22-53","name":"Probability","slug":"probability","priority":8,"order_challenge_by":1,"challenges_per_page":null},{"id":"22-128","name":"Linear Algebra Foundations","slug":"linear-algebra-foundations","priority":0,"order_challenge_by":1,"challenges_per_page":null}]},{"id":2,"name":"Artificial Intelligence","slug":"ai","children":[{"id":"2-8","name":"Bot Building","slug":"ai-introduction","priority":7,"order_challenge_by":1,"challenges_per_page":null},{"id":"2-9","name":"A* Search","slug":"astar-search","priority":6,"order_challenge_by":1,"challenges_per_page":null},{"id":"2-10","name":"Alpha Beta Pruning","slug":"alpha-beta-pruning","priority":5,"order_challenge_by":1,"challenges_per_page":null},{"id":"2-14","name":"Combinatorial Search","slug":"combinatorial-search-theory","priority":4,"order_challenge_by":1,"challenges_per_page":null},{"id":"2-13","name":"Games","slug":"richman-games","priority":3,"order_challenge_by":1,"challenges_per_page":null},{"id":"2-11","name":"Statistics and Machine Learning","slug":"machine-learning","priority":1,"order_challenge_by":1,"challenges_per_page":null},{"id":"2-44","name":"Digital Image Analysis","slug":"image-analysis","priority":0,"order_challenge_by":1,"challenges_per_page":null},{"id":"2-49","name":"Natural Language Processing","slug":"nlp","priority":0,"order_challenge_by":1,"challenges_per_page":null},{"id":"2-129","name":"Probability \u0026 Statistics - Foundations","slug":"statistics-foundations","priority":0,"order_challenge_by":1,"challenges_per_page":null}]},{"id":13,"name":"C++","slug":"cpp","children":[{"id":"13-77","name":"Introduction","slug":"cpp-introduction","priority":100,"order_challenge_by":1,"challenges_per_page":null},{"id":"13-76","name":"Strings","slug":"cpp-strings","priority":99,"order_challenge_by":1,"challenges_per_page":null},{"id":"13-78","name":"Classes","slug":"classes","priority":98,"order_challenge_by":1,"challenges_per_page":null},{"id":"13-116","name":"STL","slug":"stl","priority":97,"order_challenge_by":1,"challenges_per_page":null},{"id":"13-127","name":"Inheritance","slug":"inheritance","priority":96,"order_challenge_by":1,"challenges_per_page":null},{"id":"13-152","name":"Other Concepts","slug":"other-concepts","priority":95,"order_challenge_by":1,"challenges_per_page":null}]},{"id":15,"name":"Java","slug":"java","children":[{"id":"15-80","name":"Introduction","slug":"java-introduction","priority":0,"order_challenge_by":1,"challenges_per_page":null},{"id":"15-82","name":"Strings","slug":"java-strings","priority":0,"order_challenge_by":1,"challenges_per_page":null},{"id":"15-83","name":"BigNumber","slug":"bignumber","priority":0,"order_challenge_by":1,"challenges_per_page":null},{"id":"15-84","name":"Data Structures","slug":"java-data-structure","priority":0,"order_challenge_by":1,"challenges_per_page":null},{"id":"15-85","name":"Object Oriented Programming","slug":"oop","priority":0,"order_challenge_by":1,"challenges_per_page":null},{"id":"15-106","name":"Exception Handling","slug":"handling-exceptions","priority":0,"order_challenge_by":1,"challenges_per_page":null},{"id":"15-136","name":"Advanced","slug":"java-advanced","priority":0,"order_challenge_by":1,"challenges_per_page":null}]},{"id":12,"name":"Python","slug":"python","children":[{"id":"12-73","name":"Introduction","slug":"py-introduction","priority":10,"order_challenge_by":1,"challenges_per_page":null},{"id":"12-74","name":"Basic Data Types","slug":"py-basic-data-types","priority":9,"order_challenge_by":1,"challenges_per_page":null},{"id":"12-75","name":"Strings","slug":"py-strings","priority":8,"order_challenge_by":1,"challenges_per_page":null},{"id":"12-120","name":"Sets","slug":"py-sets","priority":7,"order_challenge_by":1,"challenges_per_page":null},{"id":"12-121","name":"Math","slug":"py-math","priority":7,"order_challenge_by":1,"challenges_per_page":null},{"id":"12-122","name":"Itertools","slug":"py-itertools","priority":7,"order_challenge_by":1,"challenges_per_page":null},{"id":"12-123","name":"Collections","slug":"py-collections","priority":7,"order_challenge_by":1,"challenges_per_page":null},{"id":"12-124","name":"Date and Time","slug":"py-date-time","priority":7,"order_challenge_by":1,"challenges_per_page":null},{"id":"12-126","name":"Errors and Exceptions","slug":"errors-exceptions","priority":7,"order_challenge_by":1,"challenges_per_page":null},{"id":"12-42","name":"Classes","slug":"py-classes","priority":6,"order_challenge_by":1,"challenges_per_page":null},{"id":"12-125","name":"Built-Ins","slug":"py-built-ins","priority":2,"order_challenge_by":1,"challenges_per_page":null},{"id":"12-87","name":"Python Functionals","slug":"py-functionals","priority":1,"order_challenge_by":1,"challenges_per_page":null},{"id":"12-88","name":"Regex and Parsing","slug":"py-regex","priority":1,"order_challenge_by":1,"challenges_per_page":null},{"id":"12-89","name":"XML","slug":"xml","priority":1,"order_challenge_by":1,"challenges_per_page":null},{"id":"12-90","name":"Closures and Decorators","slug":"closures-and-decorators","priority":1,"order_challenge_by":1,"challenges_per_page":null},{"id":"12-139","name":"Numpy","slug":"numpy","priority":0,"order_challenge_by":1,"challenges_per_page":null}]},{"id":14,"name":"Ruby","slug":"ruby","children":[{"id":"14-72","name":"Introduction","slug":"ruby-tutorials","priority":10,"order_challenge_by":1,"challenges_per_page":null},{"id":"14-86","name":"Control Structures","slug":"control-structures","priority":9,"order_challenge_by":1,"challenges_per_page":null},{"id":"14-79","name":"Arrays \u0026 Hashes","slug":"ruby-arrays","priority":8,"order_challenge_by":1,"challenges_per_page":null},{"id":"14-107","name":"Enumerables","slug":"ruby-enumerables","priority":7,"order_challenge_by":1,"challenges_per_page":null},{"id":"14-112","name":"Methods","slug":"ruby-methods","priority":6,"order_challenge_by":1,"challenges_per_page":null},{"id":"14-135","name":"Strings","slug":"ruby-strings","priority":5,"order_challenge_by":1,"challenges_per_page":null}]},{"id":18,"name":"SQL","slug":"sql","children":[{"id":"18-92","name":"Basic Select","slug":"select","priority":10,"order_challenge_by":1,"challenges_per_page":null},{"id":"18-132","name":"Advanced Select","slug":"advanced-select","priority":9,"order_challenge_by":1,"challenges_per_page":null},{"id":"18-95","name":"Aggregation","slug":"aggregation","priority":8,"order_challenge_by":1,"challenges_per_page":null},{"id":"18-94","name":"Basic Join","slug":"join","priority":6,"order_challenge_by":1,"challenges_per_page":null},{"id":"18-133","name":"Advanced Join","slug":"advanced-join","priority":4,"order_challenge_by":1,"challenges_per_page":null},{"id":"18-143","name":"Alternative Queries","slug":"alternative-queries","priority":2,"order_challenge_by":1,"challenges_per_page":null}]},{"id":16,"name":"Databases","slug":"databases","children":[{"id":"16-91","name":"Relational Algebra","slug":"relational-algebra","priority":2,"order_challenge_by":1,"challenges_per_page":null},{"id":"16-93","name":"Indexes","slug":"indexes","priority":1,"order_challenge_by":1,"challenges_per_page":null},{"id":"16-117","name":"OLAP","slug":"olap","priority":1,"order_challenge_by":1,"challenges_per_page":null},{"id":"16-101","name":"Set and Algebra","slug":"set-and-algebra","priority":0,"order_challenge_by":1,"challenges_per_page":null},{"id":"16-130","name":"NoSQL - XML, MapReduce","slug":"xpath-queries","priority":0,"order_challenge_by":1,"challenges_per_page":null},{"id":"16-131","name":"Database Normalization","slug":"database-normalization","priority":0,"order_challenge_by":1,"challenges_per_page":null}]},{"id":21,"name":"Distributed Systems","slug":"distributed-systems","children":[{"id":"21-103","name":"Multiple Choice","slug":"distributed-mcq","priority":2,"order_challenge_by":1,"challenges_per_page":null},{"id":"21-104","name":"Client Server","slug":"client-server","priority":1,"order_challenge_by":1,"challenges_per_page":null},{"id":"21-111","name":"MapReduce Basics","slug":"mapreduce-basics","priority":1,"order_challenge_by":1,"challenges_per_page":null}]},{"id":6,"name":"Linux Shell","slug":"shell","children":[{"id":"6-56","name":"Bash","slug":"bash","priority":0,"order_challenge_by":1,"challenges_per_page":null},{"id":"6-57","name":"Text Processing","slug":"textpro","priority":0,"order_challenge_by":1,"challenges_per_page":null},{"id":"6-114","name":"Arrays in Bash","slug":"arrays-in-bash","priority":0,"order_challenge_by":1,"challenges_per_page":null},{"id":"6-115","name":"Grep Sed Awk","slug":"grep-sed-awk","priority":0,"order_challenge_by":1,"challenges_per_page":null}]},{"id":5,"name":"Functional Programming","slug":"fp","children":[{"id":"5-27","name":"Introduction","slug":"intro","priority":80,"order_challenge_by":1,"challenges_per_page":null},{"id":"5-26","name":"Recursion","slug":"fp-recursion","priority":70,"order_challenge_by":1,"challenges_per_page":null},{"id":"5-45","name":"Functional Structures","slug":"ds","priority":60,"order_challenge_by":1,"challenges_per_page":null},{"id":"5-40","name":"Memoization and DP","slug":"dp","priority":50,"order_challenge_by":1,"challenges_per_page":null},{"id":"5-50","name":"Persistent Structures","slug":"persistent-ds","priority":40,"order_challenge_by":1,"challenges_per_page":null},{"id":"5-41","name":"Ad Hoc","slug":"misc","priority":30,"order_challenge_by":1,"challenges_per_page":null},{"id":"5-46","name":"Parsers","slug":"parsers","priority":20,"order_challenge_by":1,"challenges_per_page":null},{"id":"5-48","name":"Interpreter and Compilers","slug":"compilers","priority":10,"order_challenge_by":1,"challenges_per_page":null}]},{"id":19,"name":"Regex","slug":"regex","children":[{"id":"19-137","name":"Introduction","slug":"re-introduction","priority":6,"order_challenge_by":1,"challenges_per_page":null},{"id":"19-141","name":"Character Class","slug":"re-character-class","priority":5,"order_challenge_by":1,"challenges_per_page":null},{"id":"19-142","name":"Repetitions","slug":"re-repetitions","priority":4,"order_challenge_by":1,"challenges_per_page":null},{"id":"19-140","name":"Grouping and Capturing","slug":"grouping-and-capturing","priority":3,"order_challenge_by":1,"challenges_per_page":null},{"id":"19-144","name":"Backreferences","slug":"backreferences","priority":2,"order_challenge_by":1,"challenges_per_page":null},{"id":"19-145","name":"Assertions","slug":"assertions","priority":1,"order_challenge_by":1,"challenges_per_page":null},{"id":"19-138","name":"Applications","slug":"re-applications","priority":0,"order_challenge_by":1,"challenges_per_page":null}]},{"id":20,"name":"Security","slug":"security","children":[{"id":"20-102","name":"Functions","slug":"functions","priority":100,"order_challenge_by":1,"challenges_per_page":null},{"id":"20-105","name":"Terminology and Concepts","slug":"concepts","priority":99,"order_challenge_by":1,"challenges_per_page":null},{"id":"20-31","name":"Cryptography","slug":"cryptography","priority":5,"order_challenge_by":1,"challenges_per_page":null}]}],"primary_tags":[{"id":49,"slug":"np-complete-problems","name":"NP Complete problems","is_track":true,"weightage":12.0},{"id":57,"slug":"normal-languages","name":"Normal Languages","is_track":false,"weightage":0.0},{"id":8,"slug":"combinatorial-search-theory","name":"Combinatorial Search Theory","is_track":true,"weightage":3.0},{"id":9,"slug":"richman-games","name":"Richman Games","is_track":true,"weightage":4.0},{"id":14,"slug":"bit-manipulation","name":"Bit Manipulation","is_track":true,"weightage":10.0},{"id":7,"slug":"search","name":"Search","is_track":true,"weightage":2.0},{"id":6,"slug":"sorting","name":"Sorting","is_track":true,"weightage":1.0},{"id":10,"slug":"dynamic-programming","name":"Dynamic Programming","is_track":true,"weightage":6.0},{"id":11,"slug":"graph-theory","name":"Graph Theory","is_track":true,"weightage":7.0},{"id":12,"slug":"strings","name":"Strings","is_track":true,"weightage":8.0},{"id":58,"slug":"esoteric-languages","name":"Esoteric Languages","is_track":true,"weightage":0.0},{"id":13,"slug":"math","name":"Math","is_track":true,"weightage":9.0}],"effective_time_left":null,"effective_epoch_endtime":null},"messages":[],"profile":{"id":942801,"username":"akiakhilesh16","country":"India","school":null,"languages":null,"created_at":"2016-01-29T07:29:21.000Z","level":1,"email":"akiakhilesh16@gmail.com","fb_uid":null,"gh_uid":"14235798","li_uid":null,"is_admin":false,"is_support_admin":false,"avatar":"https://secure.gravatar.com/avatar/5bf4a597e79cc34651b3c9a5f3327494?d=https://d3rpyts3de3lx8.cloudfront.net/hackerrank/assets/gravatar.jpg\u0026s=200","website":null,"short_bio":null,"username_change_count":null,"name":"","personal_first_name":"","personal_last_name":null,"company":null,"local_language":null,"has_avatar_url":true,"hide_account_checklist":null,"spam_user":null,"job_title":"","hacker_iq":70.0,"errors":{},"confirmed":true,"facebook_allow_opengraph":null,"tsize":null,"is_migrated":false,"facebook_opengraph_access_available":null,"promised_login_time":null,"last_logout_feedback":null,"chat_enabled":true,"tour_done":true,"username_autoset":false,"key_prefix":"942801-ad9da4373237886ea80cd03f9cdcee110f95297c","notifications_url":"https://notifications.hackerrank.com/subscribe/942801-223b6ef0a1d2652bd15ef02c94060536f8a1b8ff","resume_url":null,"phone":null,"phone_number":null,"blog_url":null,"github_url":null,"linkedin_url":null,"college_major":null,"college_major_id":null,"jobs_consent":null,"graduation_year":null,"college_year":null,"college_majors":null,"intro_screen_onboarding_done":null,"related_topics_tour_done":null,"company_challenge_breadcrumb_tour_done":null,"contest_reminders_banner_selected":null,"hometown":null,"employment_title":null,"employment_years":null,"college_roll_no":null,"college_semester":null,"college_course":null,"college_cgpa":null,"city":null,"state":null,"username_change_max":2,"has_viewed_feed_page":null,"address":null,"rewards_alpha_onboarding_done":null,"has_verified_phone_number":false,"country_of_residence":null,"has_seen_ch_full_screen_intro":null,"experience_status":null,"address_line2":null,"address_city":null,"address_state":null,"address_zip":null,"us_work_eligibility":null,"us_work_eligibility_2":null,"is_professional":null,"years_of_experience":null,"us_citizenship":null,"us_citizenship_2":null,"gender":null,"is_campus_rep":false,"hacko_amount":279,"timezone":"Asia/Calcutta","us_work_prefs":null,"ca_hide_companies":[],"jobs_joining_date":null,"jobs_prefered_roles":null,"jobs_top_skills":null,"state_id":null,"jobs_complete_us_visa":null,"jobs_us_visa_other":null,"preferred_job_locations":[],"uk_work_eligibility":null,"has_attempted_common_app":false,"stryker_consent":null,"work_ex_reset_flag":null,"job_board_consent":null,"is_organizer":null,"bookmarks_count":0,"secondary_emails":[]},"timestamp":1484152390,"tracks":[{"id":24,"slug":"tutorials","name":"Tutorials","chapters":[{"id":146,"name":"30 Days of Code","slug":"30-days-of-code","hidden":false},{"id":149,"name":"Cracking the Coding Interview","slug":"cracking-the-coding-interview","hidden":false},{"id":147,"name":"10 Days of Statistics","slug":"10-days-of-statistics","hidden":false}],"selected":2},{"id":3,"slug":"algorithms","name":"Algorithms","chapters":[{"id":43,"name":"Warmup","slug":"warmup","hidden":false},{"id":108,"name":"Implementation","slug":"implementation","hidden":false},{"id":151,"name":"Constructive Algorithms","slug":"constructive-algorithms","hidden":false},{"id":34,"name":"Strings","slug":"strings","hidden":false},{"id":38,"name":"Sorting","slug":"arrays-and-sorting","hidden":false},{"id":36,"name":"Search","slug":"search","hidden":false},{"id":33,"name":"Graph Theory","slug":"graph-theory","hidden":false},{"id":59,"name":"Greedy","slug":"greedy","hidden":false},{"id":35,"name":"Dynamic Programming","slug":"dynamic-programming","hidden":false},{"id":30,"name":"Bit Manipulation","slug":"bit-manipulation","hidden":false},{"id":153,"name":"Recursion","slug":"recursion","hidden":false},{"id":47,"name":"Game Theory","slug":"game-theory","hidden":false},{"id":29,"name":"NP Complete","slug":"np-complete-problems","hidden":false}],"selected":2},{"id":17,"slug":"data-structures","name":"Data Structures","chapters":[{"id":134,"name":"Arrays","slug":"arrays","hidden":false},{"id":39,"name":"Linked Lists","slug":"linked-lists","hidden":false},{"id":96,"name":"Trees","slug":"trees","hidden":false},{"id":119,"name":"Balanced Trees","slug":"balanced-trees","hidden":false},{"id":97,"name":"Stacks","slug":"stacks","hidden":false},{"id":98,"name":"Queues","slug":"queues","hidden":false},{"id":99,"name":"Heap","slug":"heap","hidden":false},{"id":100,"name":"Disjoint Set","slug":"disjoint-set","hidden":false},{"id":113,"name":"Multiple Choice","slug":"multiple-choice","hidden":false},{"id":118,"name":"Trie","slug":"trie","hidden":false},{"id":32,"name":"Advanced","slug":"data-structures","hidden":false}],"selected":2},{"id":22,"slug":"mathematics","name":"Mathematics","chapters":[{"id":109,"name":"Fundamentals","slug":"fundamentals","hidden":false},{"id":52,"name":"Number Theory","slug":"number-theory","hidden":false},{"id":51,"name":"Combinatorics","slug":"combinatorics","hidden":false},{"id":55,"name":"Algebra","slug":"algebra","hidden":false},{"id":54,"name":"Geometry","slug":"geometry","hidden":false},{"id":53,"name":"Probability","slug":"probability","hidden":false},{"id":128,"name":"Linear Algebra Foundations","slug":"linear-algebra-foundations","hidden":false}],"selected":2},{"id":2,"slug":"ai","name":"Artificial Intelligence","chapters":[{"id":8,"name":"Bot Building","slug":"ai-introduction","hidden":false},{"id":9,"name":"A* Search","slug":"astar-search","hidden":false},{"id":10,"name":"Alpha Beta Pruning","slug":"alpha-beta-pruning","hidden":false},{"id":14,"name":"Combinatorial Search","slug":"combinatorial-search-theory","hidden":false},{"id":13,"name":"Games","slug":"richman-games","hidden":false},{"id":11,"name":"Statistics and Machine Learning","slug":"machine-learning","hidden":false},{"id":44,"name":"Digital Image Analysis","slug":"image-analysis","hidden":false},{"id":49,"name":"Natural Language Processing","slug":"nlp","hidden":false},{"id":129,"name":"Probability \u0026 Statistics - Foundations","slug":"statistics-foundations","hidden":false}],"selected":2},{"id":13,"slug":"cpp","name":"C++","chapters":[{"id":77,"name":"Introduction","slug":"cpp-introduction","hidden":false},{"id":76,"name":"Strings","slug":"cpp-strings","hidden":false},{"id":78,"name":"Classes","slug":"classes","hidden":false},{"id":116,"name":"STL","slug":"stl","hidden":false},{"id":127,"name":"Inheritance","slug":"inheritance","hidden":false},{"id":152,"name":"Other Concepts","slug":"other-concepts","hidden":false}],"selected":2},{"id":15,"slug":"java","name":"Java","chapters":[{"id":80,"name":"Introduction","slug":"java-introduction","hidden":false},{"id":82,"name":"Strings","slug":"java-strings","hidden":false},{"id":83,"name":"BigNumber","slug":"bignumber","hidden":false},{"id":84,"name":"Data Structures","slug":"java-data-structure","hidden":false},{"id":85,"name":"Object Oriented Programming","slug":"oop","hidden":false},{"id":106,"name":"Exception Handling","slug":"handling-exceptions","hidden":false},{"id":136,"name":"Advanced","slug":"java-advanced","hidden":false}],"selected":2},{"id":12,"slug":"python","name":"Python","chapters":[{"id":73,"name":"Introduction","slug":"py-introduction","hidden":false},{"id":74,"name":"Basic Data Types","slug":"py-basic-data-types","hidden":false},{"id":75,"name":"Strings","slug":"py-strings","hidden":false},{"id":120,"name":"Sets","slug":"py-sets","hidden":false},{"id":121,"name":"Math","slug":"py-math","hidden":false},{"id":122,"name":"Itertools","slug":"py-itertools","hidden":false},{"id":123,"name":"Collections","slug":"py-collections","hidden":false},{"id":124,"name":"Date and Time","slug":"py-date-time","hidden":false},{"id":126,"name":"Errors and Exceptions","slug":"errors-exceptions","hidden":false},{"id":42,"name":"Classes","slug":"py-classes","hidden":false},{"id":125,"name":"Built-Ins","slug":"py-built-ins","hidden":false},{"id":87,"name":"Python Functionals","slug":"py-functionals","hidden":false},{"id":88,"name":"Regex and Parsing","slug":"py-regex","hidden":false},{"id":89,"name":"XML","slug":"xml","hidden":false},{"id":90,"name":"Closures and Decorators","slug":"closures-and-decorators","hidden":false},{"id":139,"name":"Numpy","slug":"numpy","hidden":false}],"selected":2},{"id":14,"slug":"ruby","name":"Ruby","chapters":[{"id":72,"name":"Introduction","slug":"ruby-tutorials","hidden":false},{"id":86,"name":"Control Structures","slug":"control-structures","hidden":false},{"id":79,"name":"Arrays \u0026 Hashes","slug":"ruby-arrays","hidden":false},{"id":107,"name":"Enumerables","slug":"ruby-enumerables","hidden":false},{"id":112,"name":"Methods","slug":"ruby-methods","hidden":false},{"id":135,"name":"Strings","slug":"ruby-strings","hidden":false}],"selected":2},{"id":18,"slug":"sql","name":"SQL","chapters":[{"id":92,"name":"Basic Select","slug":"select","hidden":false},{"id":132,"name":"Advanced Select","slug":"advanced-select","hidden":false},{"id":95,"name":"Aggregation","slug":"aggregation","hidden":false},{"id":94,"name":"Basic Join","slug":"join","hidden":false},{"id":133,"name":"Advanced Join","slug":"advanced-join","hidden":false},{"id":143,"name":"Alternative Queries","slug":"alternative-queries","hidden":false}],"selected":2},{"id":16,"slug":"databases","name":"Databases","chapters":[{"id":91,"name":"Relational Algebra","slug":"relational-algebra","hidden":false},{"id":93,"name":"Indexes","slug":"indexes","hidden":false},{"id":117,"name":"OLAP","slug":"olap","hidden":false},{"id":101,"name":"Set and Algebra","slug":"set-and-algebra","hidden":false},{"id":130,"name":"NoSQL - XML, MapReduce","slug":"xpath-queries","hidden":false},{"id":131,"name":"Database Normalization","slug":"database-normalization","hidden":false}],"selected":2},{"id":21,"slug":"distributed-systems","name":"Distributed Systems","chapters":[{"id":103,"name":"Multiple Choice","slug":"distributed-mcq","hidden":false},{"id":104,"name":"Client Server","slug":"client-server","hidden":false},{"id":111,"name":"MapReduce Basics","slug":"mapreduce-basics","hidden":false}],"selected":2},{"id":6,"slug":"shell","name":"Linux Shell","chapters":[{"id":56,"name":"Bash","slug":"bash","hidden":false},{"id":57,"name":"Text Processing","slug":"textpro","hidden":false},{"id":114,"name":"Arrays in Bash","slug":"arrays-in-bash","hidden":false},{"id":115,"name":"Grep Sed Awk","slug":"grep-sed-awk","hidden":false}],"selected":2},{"id":5,"slug":"fp","name":"Functional Programming","chapters":[{"id":27,"name":"Introduction","slug":"intro","hidden":false},{"id":26,"name":"Recursion","slug":"fp-recursion","hidden":false},{"id":45,"name":"Functional Structures","slug":"ds","hidden":false},{"id":40,"name":"Memoization and DP","slug":"dp","hidden":false},{"id":50,"name":"Persistent Structures","slug":"persistent-ds","hidden":false},{"id":41,"name":"Ad Hoc","slug":"misc","hidden":false},{"id":46,"name":"Parsers","slug":"parsers","hidden":false},{"id":48,"name":"Interpreter and Compilers","slug":"compilers","hidden":false}],"selected":2},{"id":19,"slug":"regex","name":"Regex","chapters":[{"id":137,"name":"Introduction","slug":"re-introduction","hidden":false},{"id":141,"name":"Character Class","slug":"re-character-class","hidden":false},{"id":142,"name":"Repetitions","slug":"re-repetitions","hidden":false},{"id":140,"name":"Grouping and Capturing","slug":"grouping-and-capturing","hidden":false},{"id":144,"name":"Backreferences","slug":"backreferences","hidden":false},{"id":145,"name":"Assertions","slug":"assertions","hidden":false},{"id":138,"name":"Applications","slug":"re-applications","hidden":false}],"selected":2},{"id":20,"slug":"security","name":"Security","chapters":[{"id":102,"name":"Functions","slug":"functions","hidden":false},{"id":105,"name":"Terminology and Concepts","slug":"concepts","hidden":false},{"id":31,"name":"Cryptography","slug":"cryptography","hidden":false}],"selected":2}],"ab_tests":{"models":[{"id":26,"name":"rewards-system","product":1,"variants":[{"variant":"control","weight":100,"id":61},{"variant":"treatment","weight":0,"id":62}],"hacker_variant":{"variant":"control","forced":false}},{"id":27,"name":"onboarding-1","product":1,"variants":[{"variant":"control","weight":50,"id":63},{"variant":"treatment","weight":50,"id":64}],"hacker_variant":{"variant":"treatment","forced":false}},{"id":31,"name":"30-days-of-code","product":1,"variants":[{"variant":"control","weight":10,"id":72},{"variant":"default","weight":40,"id":73},{"variant":"variant-ipn-daily","weight":10,"id":74},{"variant":"variant-one-daily","weight":10,"id":75},{"variant":"variant-feed-daily","weight":10,"id":76},{"variant":"variant-all-daily","weight":10,"id":77},{"variant":"variant-all","weight":10,"id":78}],"hacker_variant":{"variant":"control","forced":false}},{"id":35,"name":"world-codesprint","product":1,"variants":[{"variant":"control","weight":10,"id":89},{"variant":"treatment1-register","weight":15,"id":90},{"variant":"treatment1-landing","weight":15,"id":91},{"variant":"treatment2-register","weight":15,"id":92},{"variant":"treatment2-landing","weight":15,"id":93},{"variant":"treatment3-register","weight":15,"id":94},{"variant":"treatment3-landing","weight":15,"id":95}],"hacker_variant":{"variant":"treatment1-register","forced":false}},{"id":38,"name":"bypass-login","product":1,"variants":[{"variant":"control","weight":10,"id":101},{"variant":"treatment","weight":10,"id":102},{"variant":"default","weight":80,"id":103}],"hacker_variant":{"variant":"control","forced":false}},{"id":63,"name":"long-term-holdout","product":1,"variants":[{"variant":"campaign_holdout","weight":5,"id":184},{"variant":"contest_holdout","weight":5,"id":185},{"variant":"tutorial_holdout","weight":5,"id":186},{"variant":"default","weight":80,"id":187},{"variant":"control","weight":5,"id":188}],"hacker_variant":{"variant":"contest_holdout","forced":false}},{"id":82,"name":"hacker-iq-v1","product":1,"variants":[{"variant":"control","weight":10,"id":240},{"variant":"treatment","weight":0,"id":241},{"variant":"default","weight":90,"id":242}],"hacker_variant":{"variant":"default","forced":false}},{"id":85,"name":"collection-limit","product":1,"variants":[{"variant":"control","weight":5,"id":248},{"variant":"treatment_15","weight":5,"id":249},{"variant":"treatment_20","weight":5,"id":250},{"variant":"default","weight":85,"id":251}],"hacker_variant":{"variant":"default","forced":false}},{"id":86,"name":"eager-load-assets-v2","product":1,"variants":[{"variant":"control","weight":5,"id":252},{"variant":"treatment_2","weight":5,"id":253},{"variant":"treatment_4","weight":5,"id":254},{"variant":"default","weight":85,"id":255}],"hacker_variant":{"variant":"default","forced":false}},{"id":89,"name":"mail-time-of-day-v2","product":1,"variants":[{"variant":"control","weight":10,"id":262},{"variant":"default","weight":80,"id":263},{"variant":"treatment","weight":10,"id":264}],"hacker_variant":{"variant":"default","forced":false}},{"id":93,"name":"forum-markdown-tool","product":1,"variants":[{"variant":"control","weight":40,"id":275},{"variant":"treatment","weight":40,"id":276},{"variant":"default","weight":10,"id":277},{"variant":"holdout","weight":10,"id":278}],"hacker_variant":{"variant":"control","forced":false}},{"id":97,"name":"default_cdn","product":1,"variants":[{"variant":"cloudflare","weight":50,"id":287},{"variant":"cloudfront","weight":50,"id":288}],"hacker_variant":{"variant":"cloudflare","forced":false}},{"id":104,"name":"dummy_abtest_contests","product":1,"variants":[{"variant":"control","weight":50,"id":299},{"variant":"treatment","weight":50,"id":300}],"hacker_variant":{"variant":"treatment","forced":false}},{"id":105,"name":"campaign-multiday-v5","product":1,"variants":[{"variant":"control","weight":10,"id":301},{"variant":"even_more_aggressive","weight":10,"id":302},{"variant":"default","weight":80,"id":303}],"hacker_variant":{"variant":"default","forced":false}},{"id":107,"name":"booking-promo","product":1,"variants":[{"variant":"control","weight":50,"id":309},{"variant":"treatment","weight":50,"id":310}],"hacker_variant":{"variant":"control","forced":false}},{"id":111,"name":"linkedin_tutorial","product":1,"variants":[{"variant":"control","weight":100,"id":333}],"hacker_variant":{"variant":"control","forced":false}},{"id":113,"name":"linkedin_profile","product":1,"variants":[{"variant":"control","weight":50,"id":338},{"variant":"treatment","weight":50,"id":339}],"hacker_variant":{"variant":"treatment","forced":false}},{"id":119,"name":"show-support-forum-box","product":1,"variants":[{"variant":"control","weight":10,"id":360},{"variant":"treatment","weight":10,"id":361},{"variant":"default","weight":80,"id":362}],"hacker_variant":{"variant":"default","forced":false}},{"id":121,"name":"hrw_synergy_onboarding","product":1,"variants":[{"variant":"treatment","weight":40,"id":368},{"variant":"control","weight":40,"id":369},{"variant":"default","weight":10,"id":370},{"variant":"holdout","weight":10,"id":371}],"hacker_variant":{"variant":"default","forced":false}},{"id":122,"name":"react_migration","product":1,"variants":[{"variant":"trm0","weight":0,"id":372},{"variant":"trm1","weight":1,"id":373},{"variant":"cnt1","weight":1,"id":374},{"variant":"trm2","weight":4,"id":375},{"variant":"cnt2","weight":4,"id":376},{"variant":"trm3","weight":5,"id":377},{"variant":"cnt3","weight":5,"id":378},{"variant":"trm4","weight":10,"id":379},{"variant":"cnt4","weight":10,"id":380},{"variant":"trm5","weight":10,"id":381},{"variant":"cnt5","weight":10,"id":382},{"variant":"trm6","weight":20,"id":383},{"variant":"cnt6","weight":20,"id":384}],"hacker_variant":{"variant":"cnt6","forced":false}},{"id":133,"name":"campaign-email-subject","product":1,"variants":[{"variant":"control","weight":40,"id":424},{"variant":"treatment","weight":40,"id":425},{"variant":"treatment_small","weight":40,"id":426},{"variant":"control_small","weight":10,"id":427}],"hacker_variant":{"variant":"treatment_small","forced":false}},{"id":135,"name":"ctci-new-user","product":1,"variants":[{"variant":"control","weight":40,"id":430},{"variant":"treatment","weight":40,"id":431},{"variant":"control_small","weight":10,"id":432},{"variant":"treatment_small","weight":10,"id":433}],"hacker_variant":{"variant":"treatment","forced":false}},{"id":136,"name":"new-buttons-contest","product":1,"variants":[{"variant":"treatment","weight":50,"id":434},{"variant":"control","weight":50,"id":435},{"variant":"control_small","weight":10,"id":436},{"variant":"treatment_small","weight":10,"id":437}],"hacker_variant":{"variant":"treatment_small","forced":false}},{"id":138,"name":"challenge-page-signup","product":1,"variants":[{"variant":"treatment","weight":40,"id":443},{"variant":"control","weight":40,"id":444},{"variant":"control_small","weight":10,"id":445},{"variant":"treatment_small","weight":10,"id":446}],"hacker_variant":{"variant":"treatment","forced":false}},{"id":139,"name":"user-dashboard","product":1,"variants":[{"variant":"trm0","weight":0,"id":447},{"variant":"trm1","weight":1,"id":448},{"variant":"cnt1","weight":1,"id":449},{"variant":"trm2","weight":4,"id":450},{"variant":"cnt2","weight":4,"id":451},{"variant":"trm3","weight":5,"id":452},{"variant":"cnt3","weight":5,"id":453},{"variant":"trm4","weight":10,"id":454},{"variant":"cnt4","weight":10,"id":455},{"variant":"trm5","weight":30,"id":456},{"variant":"cnt5","weight":30,"id":457}],"hacker_variant":{"variant":"trm5","forced":false}},{"id":140,"name":"chapter-completion-social-share-prompts","product":1,"variants":[{"variant":"treatment","weight":10,"id":458},{"variant":"control","weight":10,"id":459},{"variant":"default","weight":80,"id":460}],"hacker_variant":{"variant":"default","forced":false}},{"id":141,"name":"homepage-social-btns","product":1,"variants":[{"variant":"control","weight":20,"id":461},{"variant":"social_buttons","weight":20,"id":462},{"variant":"form","weight":20,"id":463},{"variant":"default","weight":20,"id":464},{"variant":"holdout","weight":20,"id":465}],"hacker_variant":{"variant":"holdout","forced":false}},{"id":142,"name":"personal-dashboard","product":1,"variants":[{"variant":"control_1","weight":1,"id":466},{"variant":"treatment_1_default_route","weight":1,"id":467},{"variant":"treatment_1_dashboard_route","weight":1,"id":468},{"variant":"control_5","weight":5,"id":469},{"variant":"treatment_5_default_route","weight":5,"id":470},{"variant":"treatment_5_dashboard_route","weight":5,"id":471},{"variant":"control_10","weight":10,"id":472},{"variant":"treatment_10_default_route","weight":10,"id":473},{"variant":"treatment_10_dashboard_route","weight":10,"id":474},{"variant":"control_15","weight":15,"id":475},{"variant":"treatment_15_default_route","weight":15,"id":476},{"variant":"treatment_15_dashboard_route","weight":15,"id":477},{"variant":"default","weight":7,"id":478}],"hacker_variant":{"variant":"treatment_5_dashboard_route","forced":false}},{"id":143,"name":"challenges-filters-v2","product":1,"variants":[{"variant":"control","weight":40,"id":479},{"variant":"treatment","weight":40,"id":480},{"variant":"control_small","weight":10,"id":481},{"variant":"treatment_small","weight":10,"id":482}],"hacker_variant":{"variant":"control_small","forced":false}},{"id":148,"name":"forum-help","product":1,"variants":[{"variant":"treatment","weight":50,"id":496},{"variant":"control","weight":50,"id":497}],"hacker_variant":{"variant":"control","forced":false}}]},"in_maintenance_mode":false,"maintenance_details":{"notification_start":1482456600,"maintenance_start":1482543000,"maintenance_end":1482550200,"api_message":"We are performing scheduled maintenance on our servers. Please refer to https://updates.hackerrank.com/scheduled-maintenance-on-december-25th-2016-at-530pm-pt/ for more details."}};
      HR.MANIFEST_HASH = "a5257ee924589c7c93e0480f548d82bade902ce0";
    </script>

    <link rel="alternate" type="application/rss+xml" title="RSS" href="https://www.hackerrank.com/rest/blogs.rss">

                    <script async="" src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/aksb.min.js"></script><script type="text/javascript">
                      var w=window;
                      if(w.performance||w.mozPerformance||w.msPerformance||w.webkitPerformance){var d=document,AKSB=AKSB||{};AKSB.q=[];AKSB.mark=function(a,b){AKSB.q.push(["mark",a,b||(new Date).getTime()])};AKSB.measure=function(a,b,c){AKSB.q.push(["measure",a,b,c||(new Date).getTime()])};AKSB.done=function(a){AKSB.q.push(["done",a])};AKSB.mark("firstbyte",(new Date).getTime());AKSB.prof={custid:"531361",ustr:"ECDHE-ECDSA-AES256-GCM-SHA384",originlat:0,clientrtt:43,ghostip:"23.11.215.110",
                      ipv6:false,pct:10,clientip:"182.19.48.18",requestid:"18cd445d",protocol:"",blver:10,akM:"b",akN:"ae",akTT:"O",akTX:"1",akTI:"18cd445d",ai:"345742",ra:"",pmgn:"",pmgi:"",pmp:""};(function(a){var b=
                      d.createElement("script");b.async="async";b.src=a;a=d.getElementsByTagName("script");a=a[a.length-1];a.parentNode.insertBefore(b,a)})(("https:"===d.location.protocol?"https:":"http:")+"//ds-aksb-a.akamaihd.net/aksb.min.js")};
                    </script>
                    <style type="text/css">.fp__btn{-webkit-box-sizing:border-box;-moz-box-sizing:border-box;box-sizing:border-box;display:inline-block;height:34px;padding:4px 20px 5px 40px;margin-bottom:0;vertical-align:middle;-ms-touch-action:manipulation;touch-action:manipulation;cursor:pointer;-webkit-user-select:none;-moz-user-select:none;-ms-user-select:none;user-select:none;font-family:"Open Sans", sans-serif;font-size:12px;font-weight:600;line-height:1.42857143;color:#fff;text-align:center;white-space:nowrap;background:#3ac7ed;background-image:url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAA0AAAANCAYAAABy6+R8AAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA3hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuNi1jMDE0IDc5LjE1Njc5NywgMjAxNC8wOC8yMC0wOTo1MzowMiAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDpkMTI4ZDMwOC1iNjY2LTQyNzgtOTU1MC04NDk5YzViMzBhMmYiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6OTJCRDQ1RUEwQzIxMTFFNThEOTU4QzAyNzQ4QUU2NzUiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6OTJCRDQ1RTkwQzIxMTFFNThEOTU4QzAyNzQ4QUU2NzUiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENDIDIwMTQgKE1hY2ludG9zaCkiPiA8eG1wTU06RGVyaXZlZEZyb20gc3RSZWY6aW5zdGFuY2VJRD0ieG1wLmlpZDoxZDgzZTQ5ZS0zYzE1LTQ3MTgtOTFkZi1iNTc0N2EyMjI5M2MiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6ZDEyOGQzMDgtYjY2Ni00Mjc4LTk1NTAtODQ5OWM1YjMwYTJmIi8+IDwvcmRmOkRlc2NyaXB0aW9uPiA8L3JkZjpSREY+IDwveDp4bXBtZXRhPiA8P3hwYWNrZXQgZW5kPSJyIj8+SmKrTgAAAOxJREFUeNqE0bFqQjEYhuFooSjUUhBEujsVXdtJwdFRvBBx1ntwEPdS8Ao6OpU6qbg4ilKRglooqDhV0jf4HTgcYht4SEL+LwlJzFp7b4zpoogE1lhghrl8YosNvg2hvj23IcbY2b/byoV+FDRyhTxeVXSIhF5c0QpfyISCzkJFD5rfIuXGbtIIjkUOMVRCO98hietgw2DXGpq4QSlynaP652goqqPCE0YYoPxfqKXQ0rceN/6WUj/3LYZDT3jUOKt+6t1SR1Z1nTfNJ5pXfNcLBnUVuU8u6AHe9fwXQ+4P2vjAHj2kLzyS+RVgAJKfyOcTLuk9AAAAAElFTkSuQmCC");background-repeat:no-repeat;background-position:17px 9px;border:1px solid transparent;border-radius:17px}.fp__btn:hover{background-color:#12a2c8}.fp__btn:active,.fp__btn:focus{outline:none}@media only screen and (min--moz-device-pixel-ratio: 2), only screen and (-o-min-device-pixel-ratio: 2 / 1), only screen and (-webkit-min-device-pixel-ratio: 2), only screen and (min-device-pixel-ratio: 2){.fp__btn{background-image:url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABkAAAAaCAYAAABCfffNAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA3hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuNi1jMDE0IDc5LjE1Njc5NywgMjAxNC8wOC8yMC0wOTo1MzowMiAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDpkMTI4ZDMwOC1iNjY2LTQyNzgtOTU1MC04NDk5YzViMzBhMmYiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6OTJCRDQ1RTYwQzIxMTFFNThEOTU4QzAyNzQ4QUU2NzUiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6OTJCRDQ1RTUwQzIxMTFFNThEOTU4QzAyNzQ4QUU2NzUiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENDIDIwMTQgKE1hY2ludG9zaCkiPiA8eG1wTU06RGVyaXZlZEZyb20gc3RSZWY6aW5zdGFuY2VJRD0ieG1wLmlpZDoyYTg3Yjk2MS1lYjk5LTRhODAtYWZjZi0wZjA2MTBlNzA5ZDYiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6ZDEyOGQzMDgtYjY2Ni00Mjc4LTk1NTAtODQ5OWM1YjMwYTJmIi8+IDwvcmRmOkRlc2NyaXB0aW9uPiA8L3JkZjpSREY+IDwveDp4bXBtZXRhPiA8P3hwYWNrZXQgZW5kPSJyIj8+yaecmgAAAftJREFUeNq0ls8rRFEUx9+MSUKR8mPKr4YtxUJJykZkY6HIUlmglKUSFmwssZB/wI+FstGUBcWUBRZWyI8I0+RX2AjxfI/O5Di9Z+7z49Rnuvfcc+Z73733nft8tm1bbDWgF9SCHPAE7sAZOAH7zAE4BreWoflYZACMUN8yNxI5Ys5BDFwx1L7k9jOJ1KOxbP2fzZNIGI1GdjyDOXABAqAAVIHQL0QeLYjc25/WTcvnQB5oAeNgz/Zma/QHb8JR5yIiWRDxryAKHl0ENkEJJcWEcyyBQA54EfHrYiwVZIMQKOf2xxj9hEUSzaj6G5EONdMpgye3/NiYCbFJKWAV9Lkc5wbVjxltPatNO6xnk5hNEWgDNyqmn8eTQC4vlU8/iSWCBsEDJ2+BDBF47LKxJHqlfF1uInGS+bhqv5djO5RIxA1ahiUDgSdQofN9okAmslYqEcq3Am7AC9evGbCjEwMeykOag28YRBIl+j2IpDv4TkwS/b94Erpvon8tkqX6dHG9/bVIturvmiY6ibSDWTAJ8oW/WMVtG09PnekRde6bxdi1Gqs0fMe+iGTwyyStkMdKlX/XVCBeheMWBMmi/8pfKpa4nuM26ukCFopUJA/VjDtBUBXIRadKa7pcRBk4/aY2RVR1/pEIkcmVdJM/Mu7ABugBAa8CxLsAAwAX4ouMwjfqEwAAAABJRU5ErkJggg==");background-size:13px 13px}}</style><style type="text/css">.fb_hidden{position:absolute;top:-10000px;z-index:10001}.fb_reposition{overflow:hidden;position:relative}.fb_invisible{display:none}.fb_reset{background:none;border:0;border-spacing:0;color:#000;cursor:auto;direction:ltr;font-family:"lucida grande", tahoma, verdana, arial, sans-serif;font-size:11px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:1;margin:0;overflow:visible;padding:0;text-align:left;text-decoration:none;text-indent:0;text-shadow:none;text-transform:none;visibility:visible;white-space:normal;word-spacing:normal}.fb_reset>div{overflow:hidden}.fb_link img{border:none}@keyframes fb_transform{from{opacity:0;transform:scale(.95)}to{opacity:1;transform:scale(1)}}.fb_animate{animation:fb_transform .3s forwards}
.fb_dialog{background:rgba(82, 82, 82, .7);position:absolute;top:-10000px;z-index:10001}.fb_reset .fb_dialog_legacy{overflow:visible}.fb_dialog_advanced{padding:10px;-moz-border-radius:8px;-webkit-border-radius:8px;border-radius:8px}.fb_dialog_content{background:#fff;color:#333}.fb_dialog_close_icon{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/yq/r/IE9JII6Z1Ys.png) no-repeat scroll 0 0 transparent;_background-image:url(https://static.xx.fbcdn.net/rsrc.php/v3/yL/r/s816eWC-2sl.gif);cursor:pointer;display:block;height:15px;position:absolute;right:18px;top:17px;width:15px}.fb_dialog_mobile .fb_dialog_close_icon{top:5px;left:5px;right:auto}.fb_dialog_padding{background-color:transparent;position:absolute;width:1px;z-index:-1}.fb_dialog_close_icon:hover{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/yq/r/IE9JII6Z1Ys.png) no-repeat scroll 0 -15px transparent;_background-image:url(https://static.xx.fbcdn.net/rsrc.php/v3/yL/r/s816eWC-2sl.gif)}.fb_dialog_close_icon:active{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/yq/r/IE9JII6Z1Ys.png) no-repeat scroll 0 -30px transparent;_background-image:url(https://static.xx.fbcdn.net/rsrc.php/v3/yL/r/s816eWC-2sl.gif)}.fb_dialog_loader{background-color:#f6f7f9;border:1px solid #606060;font-size:24px;padding:20px}.fb_dialog_top_left,.fb_dialog_top_right,.fb_dialog_bottom_left,.fb_dialog_bottom_right{height:10px;width:10px;overflow:hidden;position:absolute}.fb_dialog_top_left{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/ye/r/8YeTNIlTZjm.png) no-repeat 0 0;left:-10px;top:-10px}.fb_dialog_top_right{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/ye/r/8YeTNIlTZjm.png) no-repeat 0 -10px;right:-10px;top:-10px}.fb_dialog_bottom_left{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/ye/r/8YeTNIlTZjm.png) no-repeat 0 -20px;bottom:-10px;left:-10px}.fb_dialog_bottom_right{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/ye/r/8YeTNIlTZjm.png) no-repeat 0 -30px;right:-10px;bottom:-10px}.fb_dialog_vert_left,.fb_dialog_vert_right,.fb_dialog_horiz_top,.fb_dialog_horiz_bottom{position:absolute;background:#525252;filter:alpha(opacity=70);opacity:.7}.fb_dialog_vert_left,.fb_dialog_vert_right{width:10px;height:100%}.fb_dialog_vert_left{margin-left:-10px}.fb_dialog_vert_right{right:0;margin-right:-10px}.fb_dialog_horiz_top,.fb_dialog_horiz_bottom{width:100%;height:10px}.fb_dialog_horiz_top{margin-top:-10px}.fb_dialog_horiz_bottom{bottom:0;margin-bottom:-10px}.fb_dialog_iframe{line-height:0}.fb_dialog_content .dialog_title{background:#6d84b4;border:1px solid #365899;color:#fff;font-size:14px;font-weight:bold;margin:0}.fb_dialog_content .dialog_title>span{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/yd/r/Cou7n-nqK52.gif) no-repeat 5px 50%;float:left;padding:5px 0 7px 26px}body.fb_hidden{-webkit-transform:none;height:100%;margin:0;overflow:visible;position:absolute;top:-10000px;left:0;width:100%}.fb_dialog.fb_dialog_mobile.loading{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/ya/r/3rhSv5V8j3o.gif) white no-repeat 50% 50%;min-height:100%;min-width:100%;overflow:hidden;position:absolute;top:0;z-index:10001}.fb_dialog.fb_dialog_mobile.loading.centered{width:auto;height:auto;min-height:initial;min-width:initial;background:none}.fb_dialog.fb_dialog_mobile.loading.centered #fb_dialog_loader_spinner{width:100%}.fb_dialog.fb_dialog_mobile.loading.centered .fb_dialog_content{background:none}.loading.centered #fb_dialog_loader_close{color:#fff;display:block;padding-top:20px;clear:both;font-size:18px}#fb-root #fb_dialog_ipad_overlay{background:rgba(0, 0, 0, .45);position:absolute;bottom:0;left:0;right:0;top:0;width:100%;min-height:100%;z-index:10000}#fb-root #fb_dialog_ipad_overlay.hidden{display:none}.fb_dialog.fb_dialog_mobile.loading iframe{visibility:hidden}.fb_dialog_content .dialog_header{-webkit-box-shadow:white 0 1px 1px -1px inset;background:-webkit-gradient(linear, 0% 0%, 0% 100%, from(#738ABA), to(#2C4987));border-bottom:1px solid;border-color:#1d4088;color:#fff;font:14px Helvetica, sans-serif;font-weight:bold;text-overflow:ellipsis;text-shadow:rgba(0, 30, 84, .296875) 0 -1px 0;vertical-align:middle;white-space:nowrap}.fb_dialog_content .dialog_header table{-webkit-font-smoothing:subpixel-antialiased;height:43px;width:100%}.fb_dialog_content .dialog_header td.header_left{font-size:12px;padding-left:5px;vertical-align:middle;width:60px}.fb_dialog_content .dialog_header td.header_right{font-size:12px;padding-right:5px;vertical-align:middle;width:60px}.fb_dialog_content .touchable_button{background:-webkit-gradient(linear, 0% 0%, 0% 100%, from(#4966A6), color-stop(.5, #355492), to(#2A4887));border:1px solid #29487d;-webkit-background-clip:padding-box;-webkit-border-radius:3px;-webkit-box-shadow:rgba(0, 0, 0, .117188) 0 1px 1px inset, rgba(255, 255, 255, .167969) 0 1px 0;display:inline-block;margin-top:3px;max-width:85px;line-height:18px;padding:4px 12px;position:relative}.fb_dialog_content .dialog_header .touchable_button input{border:none;background:none;color:#fff;font:12px Helvetica, sans-serif;font-weight:bold;margin:2px -12px;padding:2px 6px 3px 6px;text-shadow:rgba(0, 30, 84, .296875) 0 -1px 0}.fb_dialog_content .dialog_header .header_center{color:#fff;font-size:16px;font-weight:bold;line-height:18px;text-align:center;vertical-align:middle}.fb_dialog_content .dialog_content{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/y9/r/jKEcVPZFk-2.gif) no-repeat 50% 50%;border:1px solid #555;border-bottom:0;border-top:0;height:150px}.fb_dialog_content .dialog_footer{background:#f6f7f9;border:1px solid #555;border-top-color:#ccc;height:40px}#fb_dialog_loader_close{float:left}.fb_dialog.fb_dialog_mobile .fb_dialog_close_button{text-shadow:rgba(0, 30, 84, .296875) 0 -1px 0}.fb_dialog.fb_dialog_mobile .fb_dialog_close_icon{visibility:hidden}#fb_dialog_loader_spinner{animation:rotateSpinner 1.2s linear infinite;background-color:transparent;background-image:url(https://static.xx.fbcdn.net/rsrc.php/v3/yD/r/t-wz8gw1xG1.png);background-repeat:no-repeat;background-position:50% 50%;height:24px;width:24px}@keyframes rotateSpinner{0%{transform:rotate(0deg)}100%{transform:rotate(360deg)}}
.fb_iframe_widget{display:inline-block;position:relative}.fb_iframe_widget span{display:inline-block;position:relative;text-align:justify}.fb_iframe_widget iframe{position:absolute}.fb_iframe_widget_fluid_desktop,.fb_iframe_widget_fluid_desktop span,.fb_iframe_widget_fluid_desktop iframe{max-width:100%}.fb_iframe_widget_fluid_desktop iframe{min-width:220px;position:relative}.fb_iframe_widget_lift{z-index:1}.fb_hide_iframes iframe{position:relative;left:-10000px}.fb_iframe_widget_loader{position:relative;display:inline-block}.fb_iframe_widget_fluid{display:inline}.fb_iframe_widget_fluid span{width:100%}.fb_iframe_widget_loader iframe{min-height:32px;z-index:2;zoom:1}.fb_iframe_widget_loader .FB_Loader{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/y9/r/jKEcVPZFk-2.gif) no-repeat;height:32px;width:32px;margin-left:-16px;position:absolute;left:50%;z-index:4}</style></head>

<body id="hr_v2" itemscope="" itemtype="http://schema.org/WebPage" style="zoom: 1;">
      <div class="cdn-error-view" style="display:none;">
  <div class="error-box-wrap">
    <div class="error-icon">
      <svg x="0px" y="0px" width="80px" height="80px" viewBox="0 0 367.011 367.01" style="enable-background:new 0 0 367.011 367.01;" xml:space="preserve">
        <g>
         <g>
          <path d="M365.221,329.641L190.943,27.788c-1.542-2.674-4.395-4.318-7.479-4.318c-3.084,0-5.938,1.645-7.48,4.318L1.157,330.584    c-1.543,2.674-1.543,5.965,0,8.639c1.542,2.674,4.395,4.318,7.48,4.318h349.65c0.028,0,0.057,0,0.086,0    c4.77,0,8.638-3.863,8.638-8.639C367.011,332.92,366.342,331.1,365.221,329.641z M23.599,326.266L183.464,49.381l159.864,276.885    H23.599z"></path>
          <path d="M174.826,136.801v123.893c0,4.773,3.867,8.638,8.638,8.638c4.77,0,8.637-3.863,8.637-8.638V136.801    c0-4.766-3.867-8.637-8.637-8.637C178.693,128.165,174.826,132.036,174.826,136.801z"></path>
          <path d="M183.464,279.393c-5.922,0-10.725,4.8-10.725,10.722s4.803,10.729,10.725,10.729c5.921,0,10.725-4.809,10.725-10.729    C194.189,284.193,189.386,279.393,183.464,279.393z"></path>
         </g>
        </g>
      </svg>
    </div>
    <h2 class="error-title">Something went wrong!</h2>
    <p class="error-message">Some error occured while loading page for you. Please try again.</p>
    <div class="btn-wrap">
      <a href="https://www.hackerrank.com/#" onclick="window.location.reload(true);"><button class="btn-reload">Reload</button></a>
    </div>
  </div>
</div>
<script>
  if(typeof cdnLoaded !== 'undefined' && cdnLoaded === false){
    document.querySelector('.cdn-error-view').style.display = 'block';
  }
</script>

    <script type="text/template" id="navigation">
    <nav class="page-header">
        <div class="container">
            <span class="nav-links"></span>
            <span class="nav-buttons"></span>
        </div>
    </nav>
</script>
<script type="text/template" id="nav-links">
      <ul class="pull-left nav-links-active">
        <li>
          <a href="" class="nav_link backbone logo_mark js_logo_mark" data-analytics="NavBarLogo"><img id="feed-intro" src="<%- asset_path('brand/h_mark_sm.png') %>" alt=""></a>
        </li>
        <li>
            <% if (HR.ABTest && _.contains(['treatment_1_default_route', 'treatment_1_dashboard_route', 'treatment_5_default_route', 'treatment_5_dashboard_route', 'treatment_10_default_route', 'treatment_10_dashboard_route', 'treatment_15_default_route', 'treatment_15_dashboard_route'], HR.ABTest.get_variant("personal-dashboard"))) { %>
                <a href="/dashboard" class="nav_link backbone domains" data-analytics="NavBarDomains">
            <% } else { %>
                <a href="/domains" class="nav_link backbone domains" data-analytics="NavBarDomains">
            <% } %>
              <i class="icon-home"></i>
              <span>Practice</span>
            </a>
        </li>
        <li>
            <a href="/contests" class="nav_link backbone contests" data-analytics="NavBarContests">
              <i class="icon-clock"></i>
              <span>Compete</span>
	        </a>
        </li>
        <li>
            <a href="/jobs?h_l=topNavBar" class="nav_link backbone" data-analytics="NavBarJobs">
                <i class="icon-briefcase"></i>
                <span>Jobs</span>
                <i class="icon-circle js-jobs-notification navigation-highlight-icon hidden"></i>
            </a>
        </li>
        <li>
            <% if (HR.ABTest && HR.ABTest.is_variant("rewards-system","treatment")) { %>
                <a href="/progress" class="nav_link backbone" data-analytics="NavBarMyProgress" id='myprogress-nav-link'>
                    <i class="icon-chart-area"></i>
                    <span>Progress</span>
                </a>
            <% } else { %>
                <a href="/rank" class="nav_link backbone" data-analytics="NavBarMyRank" id='myrank-nav-link'>
                    <i class="icon-award"></i>
                    <span>Rank</span>
                </a>
            <% } %>
        </li>
        <li>
            <a href="/leaderboard" class="nav_link backbone" data-analytics="NavBarLeaderboard" id='leaderboard-nav-link'>
	            <i class="icon-trophy"></i>
	            <span>Leaderboard</span>
	        </a>
        </li>
    </ul>
</script>

<script type="text/template" id="nav-search">
    <div class="hide-in-private-contest search-input input-icon">
        <input type="text" id="search-text" class="search-query" autocomplete="off" data-analytics="NavBarSearchBox">
        <i class="icon-search"></i>
    </div>
    <div class="hide-in-private-contest search-result hide">
        <ul class="unstyled"></ul>
    </div>
</script>

<script type="text/template" id="nav-buttons">
    <ul class="pull-right nav-admin mmL">
        <% if (profile && profile.isLoggedIn()) { %>
            <li class="hide-in-private-contest notify_dropdown dropdown" id="tab-profile-messages">
                <a class="cursor backbone nav_link hr_nav_messages_link" data-toggle="dropdown" data-analytics="NavBarMessageIcon">
                    <i class="icon-chat icon--single"></i>
                    <span class="indicator number-indicator hr_messages_count"></span>
                </a>
                <div class="dropdown-menu large">
                    <header class="psT psB text-center">
                        <strong>Messages</strong>
                    </header>
                        <div id="notify_messages" class="dropdown-body">
                            <ul></ul>
                        </div>
                    <footer class="final text-center">
                        <a class="btn backbone" href="/inbox" data-analytics="NavBarMessageShowAll">Show All</a>
                    </footer>
                </div>
            </li>
            <li class="dropdown notify_dropdown" id="tab-profile-notifs">
                <a class="cursor backbone nav_link hr_nav_notifications_link" data-toggle="dropdown" data-analytics="NavBarNotificationsIcon">
                    <i class="icon-megaphone icon--single"></i>
                    <span class="indicator number-indicator hr_notifications_count"></span>
                </a>
                <div class="dropdown-menu large" id="notify_broadcasts">
                    <header class="psA">
                        <strong>Notifications</strong>
                        <a class="hr_archive_all pull-right" data-analytics="NavBarNotificationsArchiveAll"><i class="icon-folder-open"></i>Archive All</a>
                    </header>
                    <div class="clearfix dropdown-body">
                        <ul class="hr_nav_notifications_list">
                        </ul>
                    </div>
                    <footer class="final">
                        <a class="btn backbone" href="/notifications" data-analytics="NavBarNotificationsShowAll">Show All</a>
                    </footer>
                </div>
            </li>
            <li class="dropdown-auth">
                <div class="dropdown" id="profile-menu">
                    <a class="backbone nav_link dropdown-toggle" href="" data-toggle="dropdown" data-analytics="NavBarProfileDropDown">
                        <img src="<%= _profile.avatar %>" alt="" class="avatar" onerror="this.onerror=null; this.src='https://d3rpyts3de3lx8.cloudfront.net/hackerrank/assets/gravatar.jpg';">
                        <span class="mmR"><%- _profile.username %></span>
                        <span class="team-name"></span>
                        <i class="icon-down-open"></i>
                    </a>
                    <div class="dropdown-menu drop-list pull-right" style="max-width:">
                        <ul>
                            <li class="hide-in-private-contest"><a class="navigation_hackos backbone" href="/<%- _profile.username %>/hackos" data-analytics="NavBarProfileDropDownHackos">Hackos: <span class="navigation_hackos-count"><%= _profile.hacko_amount %></span></a></li>
                            <li class="hide-in-private-contest">
                                <a class="backbone" rel="tooltip" data-placement="left" href="/<%- _profile.username %>" data-analytics="NavBarProfileDropDownProfile">
	                                Profile
	                                <!-- NOTE also add title="x% complete" to profile link-->
                                    <span class="progress-wrapper">
                                        <span class="progress-bar" style="width: <%= _profileProgress %>%;"></span>
                                    </span>
                                </a>
                            </li>
                            <li class="hide-in-private-contest"><a class="backbone" href="/settings" data-analytics="NavBarProfileDropDownSettings">Settings</a></li>
                            <li class="hide-in-private-contest"><a class="backbone" href="/network" data-analytics="NavBarProfileDropDownNetwork">Network</a></li>
                            <li class="hide-in-private-contest"><a class="backbone" href="/submissions" data-analytics="NavBarProfileDropDownSubmissions">Submissions</a></li>
                            <li class="hide-in-private-contest"><a class="backbone" href="/administration" data-analytics="NavBarProfileDropDownAdministration">Administration</a></li>
                            <li><a class="logout-button" data-analytics="NavBarProfileDropDownLogout">Logout</a></li>
                        </ul>
                    </div>
                </div>
            </li>
        <% } else { %>
             <a class="nav-signup pull-right btn btn-primary mmT" data-analytics="NavBarSignupIcon"> Sign Up
             </a>
             <a href="/auth/login/<%= HR.appController.get_current_contest_slug() %>" class="login pull-right btn btn-dark btn-default mmT msR" data-analytics="NavBarLoginIcon"> Log In
             </a>
        <% } %>
    </ul>
    <ul class="pull-right psR">
        <li class="hide-in-private-contest search-input-container input-icon main-hr-search" id="search-span">
          <span class="search_form"></span>
        </li>
    </ul>
</script>

    <script type="text/template" id="breadcrumb">
    <% var counter = 0; %>
    <div class="content-header">
        <div class="container">
            <div class="clearfix">
                <ol itemscope itemtype="http://schema.org/BreadcrumbList" class="pull-left mdT msB pjT bcrumb">
                    <% var breadcrumb_level = 0; %>
                    <% for (var index in level_values) { %>
                        <li itemprop="itemListElement" itemscope itemtype="http://schema.org/ListItem">
                          <% if (counter==0) {
                               counter = counter + 1;
                             } else { %>
                               <i class="icon-right-open mmL"></i>
                          <% } %>
                          <a itemprop="item" href="<%= level_values[index].url %>" class="backbone"
                             data-analytics="Breadcrumb" data-attr1="<%- level_values[index].text %>"
                             data-attr2="<%= index %>" data-attr7="<%= breadcrumb_level += 1 %>"><span itemprop="name"><%- level_values[index].text %></span></a>
                          <meta itemprop="position" content="<%- breadcrumb_level %>" />
                        </li>
                    <% } %>
                </ol>
                <div class="pull-right hide domain-scores">
                    <div class="pull-left badge-progress">
                    </div>
                    <div class="pull-right pdT brcumb-points">
                        <span class="zeta bold">Points: </span><span class="bold domain-score"></span>
                        <span class="domain-rank-span">
                            <span class="zeta bold">Rank: </span><span class="bold msR domain-rank "></span>
                        </span>
                    </div>
                </div>

                <div class="social-share-wrap-2 hide"></div>
            </div>
        </div>
    </div>
</script>


    <div id="wrapper" style="min-height: 454px;">
        <div id="navigation">
    <nav class="page-header">
        <div class="container">
            <span class="nav-links">
      <ul class="pull-left nav-links-active">
        <li>
          <a href="https://www.hackerrank.com/dashboard?h_r=logo" class="nav_link backbone logo_mark js_logo_mark" data-analytics="NavBarLogo"><img id="feed-intro" src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/h_mark_sm-05bceb881aa02b72d688d21db01df5d8.png" alt=""></a>
        </li>
        <li>
            
                <a href="https://www.hackerrank.com/dashboard" class="nav_link backbone domains active" data-analytics="NavBarDomains">
            
              <i class="icon-home"></i>
              <span>Practice</span>
            </a>
        </li>
        <li>
            <a href="https://www.hackerrank.com/contests" class="nav_link backbone contests" data-analytics="NavBarContests">
              <i class="icon-clock"></i>
              <span>Compete</span>
	        </a>
        </li>
        <li>
            <a href="https://www.hackerrank.com/jobs?h_l=topNavBar" class="nav_link backbone" data-analytics="NavBarJobs">
                <i class="icon-briefcase"></i>
                <span>Jobs</span>
                <i class="icon-circle js-jobs-notification navigation-highlight-icon hidden"></i>
            </a>
        </li>
        <li>
            
                <a href="https://www.hackerrank.com/rank" class="nav_link backbone" data-analytics="NavBarMyRank" id="myrank-nav-link">
                    <i class="icon-award"></i>
                    <span>Rank</span>
                </a>
            
        </li>
        <li>
            <a href="https://www.hackerrank.com/leaderboard" class="nav_link backbone" data-analytics="NavBarLeaderboard" id="leaderboard-nav-link">
	            <i class="icon-trophy"></i>
	            <span>Leaderboard</span>
	        </a>
        </li>
    </ul>
</span>
            <span class="nav-buttons">
    <ul class="pull-right nav-admin mmL">
        
            <li class="hide-in-private-contest notify_dropdown dropdown" id="tab-profile-messages">
                <a class="cursor backbone nav_link hr_nav_messages_link" data-toggle="dropdown" data-analytics="NavBarMessageIcon">
                    <i class="icon-chat icon--single"></i>
                    <span class="indicator number-indicator hr_messages_count"></span>
                </a>
                <div class="dropdown-menu large">
                    <header class="psT psB text-center">
                        <strong>Messages</strong>
                    </header>
                        <div id="notify_messages" class="dropdown-body">
                            <ul></ul>
                        </div>
                    <footer class="final text-center">
                        <a class="btn backbone" href="https://www.hackerrank.com/inbox" data-analytics="NavBarMessageShowAll">Show All</a>
                    </footer>
                </div>
            </li>
            <li class="dropdown notify_dropdown" id="tab-profile-notifs">
                <a class="cursor backbone nav_link hr_nav_notifications_link" data-toggle="dropdown" data-analytics="NavBarNotificationsIcon">
                    <i class="icon-megaphone icon--single"></i>
                    <span class="indicator number-indicator hr_notifications_count"></span>
                </a>
                <div class="dropdown-menu large" id="notify_broadcasts">
                    <header class="psA">
                        <strong>Notifications</strong>
                        <a class="hr_archive_all pull-right" data-analytics="NavBarNotificationsArchiveAll"><i class="icon-folder-open"></i>Archive All</a>
                    </header>
                    <div class="clearfix dropdown-body">
                        <ul class="hr_nav_notifications_list">
                        </ul>
                    </div>
                    <footer class="final">
                        <a class="btn backbone" href="https://www.hackerrank.com/notifications" data-analytics="NavBarNotificationsShowAll">Show All</a>
                    </footer>
                </div>
            </li>
            <li class="dropdown-auth">
                <div class="dropdown" id="profile-menu">
                    <a class="backbone nav_link dropdown-toggle" href="https://www.hackerrank.com/" data-toggle="dropdown" data-analytics="NavBarProfileDropDown">
                        <img src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/5bf4a597e79cc34651b3c9a5f3327494" alt="" class="avatar" onerror="this.onerror=null; this.src=&#39;https://d3rpyts3de3lx8.cloudfront.net/hackerrank/assets/gravatar.jpg&#39;;">
                        <span class="mmR">akiakhilesh16</span>
                        <span class="team-name"></span>
                        <i class="icon-down-open"></i>
                    </a>
                    <div class="dropdown-menu drop-list pull-right" style="max-width:">
                        <ul>
                            <li class="hide-in-private-contest"><a class="navigation_hackos backbone" href="https://www.hackerrank.com/akiakhilesh16/hackos" data-analytics="NavBarProfileDropDownHackos">Hackos: <span class="navigation_hackos-count">279</span></a></li>
                            <li class="hide-in-private-contest">
                                <a class="backbone" rel="tooltip" data-placement="left" href="https://www.hackerrank.com/akiakhilesh16" data-analytics="NavBarProfileDropDownProfile">
	                                Profile
	                                <!-- NOTE also add title="x% complete" to profile link-->
                                    <span class="progress-wrapper">
                                        <span class="progress-bar" style="width: 20%;"></span>
                                    </span>
                                </a>
                            </li>
                            <li class="hide-in-private-contest"><a class="backbone" href="https://www.hackerrank.com/settings" data-analytics="NavBarProfileDropDownSettings">Settings</a></li>
                            <li class="hide-in-private-contest"><a class="backbone" href="https://www.hackerrank.com/network" data-analytics="NavBarProfileDropDownNetwork">Network</a></li>
                            <li class="hide-in-private-contest"><a class="backbone" href="https://www.hackerrank.com/submissions" data-analytics="NavBarProfileDropDownSubmissions">Submissions</a></li>
                            <li class="hide-in-private-contest"><a class="backbone" href="https://www.hackerrank.com/administration" data-analytics="NavBarProfileDropDownAdministration">Administration</a></li>
                            <li><a class="logout-button" data-analytics="NavBarProfileDropDownLogout">Logout</a></li>
                        </ul>
                    </div>
                </div>
            </li>
        
    </ul>
    <ul class="pull-right psR">
        <li class="hide-in-private-contest search-input-container input-icon main-hr-search" id="search-span">
          <span class="search_form">
    <div class="hide-in-private-contest search-input input-icon">
        <input type="text" id="search-text" class="search-query ui-autocomplete-input" autocomplete="off" data-analytics="NavBarSearchBox">
        <i class="icon-search"></i>
    </div>
    <div class="hide-in-private-contest search-result hide" style="display: block;">
        <ul class="unstyled"></ul>
    </div>
</span>
        </li>
    </ul>
</span>
        </div>
    </nav>
</div>
        <div id="side-navigation"></div>
        <div id="verifyaccount" class="container"></div>
        <div id="ajax-msg-wrap"><div id="ajax-msg" style="margin-left: -12.5px; display: none;"><span class="ajax-loader ajax-loading"></span><span class="ajax-msg"></span></div></div>
        <!--<div id="countdowntimer" style="display: none;"></div>-->
        <div id="breadcrumb" style="display: block;">
    
    <div class="content-header">
        <div class="container">
            <div class="clearfix">
                <ol itemscope="" itemtype="http://schema.org/BreadcrumbList" class="pull-left mdT msB pjT bcrumb">
                    
                    
                        <li itemprop="itemListElement" itemscope="" itemtype="http://schema.org/ListItem">
                          
                          <a itemprop="item" href="https://www.hackerrank.com/dashboard" class="backbone" data-analytics="Breadcrumb" data-attr1="Dashboard" data-attr2="global" data-attr7="1"><span itemprop="name">Dashboard</span></a>
                          <meta itemprop="position" content="1">
                        </li>
                    
                        <li itemprop="itemListElement" itemscope="" itemtype="http://schema.org/ListItem">
                          
                               <i class="icon-right-open mmL"></i>
                          
                          <a itemprop="item" href="https://www.hackerrank.com/domains/java" class="backbone" data-analytics="Breadcrumb" data-attr1="Java" data-attr2="contest-track" data-attr7="2"><span itemprop="name">Java</span></a>
                          <meta itemprop="position" content="2">
                        </li>
                    
                        <li itemprop="itemListElement" itemscope="" itemtype="http://schema.org/ListItem">
                          
                               <i class="icon-right-open mmL"></i>
                          
                          <a itemprop="item" href="https://www.hackerrank.com/domains/java/java-strings" class="backbone" data-analytics="Breadcrumb" data-attr1="Strings" data-attr2="contest-chapter" data-attr7="3"><span itemprop="name">Strings</span></a>
                          <meta itemprop="position" content="3">
                        </li>
                    
                        <li itemprop="itemListElement" itemscope="" itemtype="http://schema.org/ListItem">
                          
                               <i class="icon-right-open mmL"></i>
                          
                          <a itemprop="item" href="https://www.hackerrank.com/challenges/java-string-reverse" class="backbone" data-analytics="Breadcrumb" data-attr1="Java String Reverse" data-attr2="challenge" data-attr7="4"><span itemprop="name">Java String Reverse</span></a>
                          <meta itemprop="position" content="4">
                        </li>
                    
                </ol>
                <div class="pull-right hide domain-scores" style="display: block;">
                    <div class="pull-left badge-progress">
                    </div>
                    <div class="pull-right pdT brcumb-points">
                        <span class="zeta bold">Points: </span><span class="bold domain-score">138.00</span>
                        <span class="domain-rank-span">
                            <span class="zeta bold">Rank: </span><span class="bold msR domain-rank ">25550</span>
                        </span>
                    </div>
                </div>

                <div class="social-share-wrap-2 hide"></div>
            </div>
        </div>
    </div>
</div>
        <div id="flash"></div>
        <div id="followbanner"></div>
        <div id="submission-success-messages"></div>
        <div id="contestwide-broadcast"></div>
        <div id="content" class="main_content"><div class="challenge-view"><div>
   
    <div class="challenge-header"><div class="container">
    <div class="mdT mmB span10">
        <div class="clearfix">
            <h2 class="hr_tour-challenge-name pull-left mlT">
                Java String Reverse
                
                    <i class="icon-bookmark js-bookmark xxsmall txt-grey"></i>
                
                
            </h2>
            
                <span class="saved-text txt-alt-grey xsmall mmL mjT pmT inline-block">Saved!</span>
            
            
            </div>
            
            <div class="clearfix mlB mmT">
                <img src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/150x150.png" height="25" width="25" class="avatar pull-left msR" onerror="this.onerror=null; this.src=&#39;https://d3rpyts3de3lx8.cloudfront.net/hackerrank/assets/gravatar.jpg&#39;;">
                <span class="small bold">by <a class="backbone color-blue" href="https://www.hackerrank.com/Shafaet" data-analytics="ChallengeViewHeaderAuthor" data-attr1="java-string-reverse" data-attr2="Shafaet">Shafaet</a></span>
            </div>
            
        </div>
        
    </div>

            

<div class="container">
    <ul class="nav-tabs nav mlT">
        <!-- Problem -->
        <li id="problemTab">
            <a class="hr-problem-link" href="https://www.hackerrank.com/challenges/java-string-reverse" data-analytics="ChallengeViewTab" data-attr1="java-string-reverse" data-attr2="Problem">Problem</a>
        </li>

        <!-- Expert (Live) -->
        

        <!-- Submissions -->
        
            <li id="submissionsTab" class="active">
                <a class="hr-submissions-link" href="https://www.hackerrank.com/challenges/java-string-reverse/submissions" data-analytics="ChallengeViewTab" data-attr1="java-string-reverse" data-attr2="Submissions">Submissions</a>
            </li>
        

        <!-- Leadeboard -->
        
            <li id="leaderboardTab">
                <a class="hr-leaderboard-link" href="https://www.hackerrank.com/challenges/java-string-reverse/leaderboard" data-analytics="ChallengeViewTab" data-attr1="java-string-reverse" data-attr2="Leaderboard">Leaderboard</a>
            </li>
        

        <!-- Discussion -->
        
            <li id="forumTab">
                <a class="hr-forum-link" href="https://www.hackerrank.com/challenges/java-string-reverse/forum" data-analytics="ChallengeViewTab" data-attr1="java-string-reverse" data-attr2="Discussions">Discussions</a>
            </li>
        

        <!-- Editorial -->
        
        <li id="editorialTab">
            <a class="hr-editorial-link" href="https://www.hackerrank.com/challenges/java-string-reverse/editorial" data-analytics="ChallengeViewTab" data-attr1="java-string-reverse" data-attr2="Editorial">Editorial </a>
        </li>
        

        <!-- Custom Pages -->
        

        <!-- Topics -->
        
    </ul>
</div>
</div>
    <style></style>
    <section class="challenge-interface">
        <div class="challenge-body">
          <div class="challenge-container-element challenge-container-elements-loading hidden">
            <div class="gray block-center">
              <div style="background: url(https://hackerrank-a.akamaihd.net/hackerrank/assets/hackerrank_spinner_64x64-4f0677160e859e0e7798b44c8f33c3ba.gif); height: 64px; width: 64px; display: inline-block;"></div>
            </div>
          </div>
        <div class="challenge-body-elements-submissions challenge-container-element"><section class="submissions-details container mjB">
    
    <div id="submission-recommend-wrapper"></div>
    
    <div class="plT plB" id="submission-stats-wrapper"><!-- I have commented out the status updates. What should happen is, show QUEUED if queued, then show progress bar, and only then show submitted on...games played...etc, which is currently shown
     If it is not a game, just show the p class stats with the 'submitted on' date -->
<div id="submission-stats-content" class="submission-stats2-content">

<div class="row">
    
    <p class="span9 small bold">Submitted 3 days ago
        
             •
                <strong>Score:</strong>
                10.00
            
        
    </p>
    
    
        <span class="status pull-right bold small color-green psR">
    
    <span class="color-dark">Status:</span> Accepted</span>

</div>
    
        <div class="light-wrap mlT small">
            
                
                <div class="submission_testcases-results ab-testcase testcases-results clearfix" style="padding: 15px;">
                
                    <div class="testcase-card-wrap">
                        <div class="testcase-card" id="testcase-card-0">
                            

                            <div style="width: 25px; display: inline-block;">
                                <i class="testcase-icon icon-ok success"></i>
                            </div>
                            
                            <span class="testcase-num">Test Case #0 
                                    
                            </span>

                            <div class="testcase-message-wrap align-center m">
                                <div class="testcase-message">
                                    
                                        <div class="type">Sample</div>
                                    

                                    

                                    <div class="message-text">
                                      Success
                                      

                                      
                                        0.05s
                                      
                                    </div>

                                    
                                        <a class="js-download-test-case download cursor" testcase-num="0" data-analytics="TestCase Purchase">Download<i class="pmL icon-download"></i></a>
                                    
                                </div>
                            </div>
                        </div>
                    </div>
                
                    <div class="testcase-card-wrap">
                        <div class="testcase-card" id="testcase-card-1">
                            

                            <div style="width: 25px; display: inline-block;">
                                <i class="testcase-icon icon-ok success"></i>
                            </div>
                            
                            <span class="testcase-num">Test Case #1 
                                    
                            </span>

                            <div class="testcase-message-wrap align-center m">
                                <div class="testcase-message">
                                    
                                        <div class="type">Sample</div>
                                    

                                    

                                    <div class="message-text">
                                      Success
                                      

                                      
                                        0.05s
                                      
                                    </div>

                                    
                                        <a class="js-download-test-case download cursor" testcase-num="1" data-analytics="TestCase Purchase">Download<i class="pmL icon-download"></i></a>
                                    
                                </div>
                            </div>
                        </div>
                    </div>
                
                    <div class="testcase-card-wrap">
                        <div class="testcase-card" id="testcase-card-2">
                            

                            <div style="width: 25px; display: inline-block;">
                                <i class="testcase-icon icon-ok success"></i>
                            </div>
                            
                            <span class="testcase-num">Test Case #2 
                                    
                            </span>

                            <div class="testcase-message-wrap align-center m">
                                <div class="testcase-message">
                                    

                                    

                                    <div class="message-text">
                                      Success
                                      

                                      
                                        0.05s
                                      
                                    </div>

                                    
                                        <a class="js-download-test-case download cursor" testcase-num="2" data-analytics="TestCase Purchase">Download<i class="pmL icon-download"></i></a>
                                    
                                </div>
                            </div>
                        </div>
                    </div>
                
                    <div class="testcase-card-wrap">
                        <div class="testcase-card" id="testcase-card-3">
                            

                            <div style="width: 25px; display: inline-block;">
                                <i class="testcase-icon icon-ok success"></i>
                            </div>
                            
                            <span class="testcase-num">Test Case #3 
                                    
                            </span>

                            <div class="testcase-message-wrap align-center m">
                                <div class="testcase-message">
                                    

                                    

                                    <div class="message-text">
                                      Success
                                      

                                      
                                        0.05s
                                      
                                    </div>

                                    
                                        <a class="js-download-test-case download cursor" testcase-num="3" data-analytics="TestCase Purchase">Download<i class="pmL icon-download"></i></a>
                                    
                                </div>
                            </div>
                        </div>
                    </div>
                
                    <div class="testcase-card-wrap">
                        <div class="testcase-card" id="testcase-card-4">
                            

                            <div style="width: 25px; display: inline-block;">
                                <i class="testcase-icon icon-ok success"></i>
                            </div>
                            
                            <span class="testcase-num">Test Case #4 
                                    
                            </span>

                            <div class="testcase-message-wrap align-center m">
                                <div class="testcase-message">
                                    

                                    

                                    <div class="message-text">
                                      Success
                                      

                                      
                                        0.05s
                                      
                                    </div>

                                    
                                        <a class="js-download-test-case download cursor" testcase-num="4" data-analytics="TestCase Purchase">Download<i class="pmL icon-download"></i></a>
                                    
                                </div>
                            </div>
                        </div>
                    </div>
                
                    <div class="testcase-card-wrap">
                        <div class="testcase-card" id="testcase-card-5">
                            

                            <div style="width: 25px; display: inline-block;">
                                <i class="testcase-icon icon-ok success"></i>
                            </div>
                            
                            <span class="testcase-num">Test Case #5 
                                    
                            </span>

                            <div class="testcase-message-wrap align-center m">
                                <div class="testcase-message">
                                    

                                    

                                    <div class="message-text">
                                      Success
                                      

                                      
                                        0.05s
                                      
                                    </div>

                                    
                                        <a class="js-download-test-case download cursor" testcase-num="5" data-analytics="TestCase Purchase">Download<i class="pmL icon-download"></i></a>
                                    
                                </div>
                            </div>
                        </div>
                    </div>
                
                </div>
                
            
        </div>
    
    

</div>
</div>
    
    <br>
    
    
    
        <div id="js-friends-leaderboard"></div>
        <h3 class="plB">Submitted Code</h3>
        <div class="">
            <div class="plL plR psT psB boundT boundR boundL clearfix">
                <div class="pull-left">
                    <p class="msT msB small">Language: Java 7</p>
                </div>
                <div class="pull-right submissions_code-copy msT">
                    <a class="copy_to_clipboard small cursor" data-analytics="SubmissionViewOpenInEditor" data-attr1="java-string-reverse" data-attr2="java" data-attr3="code"><i class="icon-flow-branch"></i> Open in editor</a>
                </div>
            </div>
            <div id="submission-code"><div class="CodeMirror cm-s-default CodeMirror-wrap  CodeMirror-focused"><div style="overflow: hidden; position: relative; width: 3px; height: 0px; top: 525px; left: 34px;"><textarea autocorrect="off" autocapitalize="off" spellcheck="false" style="position: absolute; padding: 0px; width: 1000px; height: 1em; outline: none;" tabindex="0"></textarea></div><div class="CodeMirror-hscrollbar" style="left: 29px;"><div style="height: 100%; min-height: 1px; width: 0px;"></div></div><div class="CodeMirror-vscrollbar" style="bottom: 0px;"><div style="min-width: 1px; height: 0px;"></div></div><div class="CodeMirror-scrollbar-filler"></div><div class="CodeMirror-gutter-filler"></div><div class="CodeMirror-scroll" tabindex="-1"><div class="CodeMirror-sizer" style="margin-left: 29px; min-height: 0px;"><div style="position: relative; top: 0px;"><div class="CodeMirror-lines"><div style="position: relative; outline: none;"><div class="CodeMirror-measure"><pre>x</pre></div><div class="CodeMirror-measure"></div><div style="position: relative; z-index: 1;"><div class="CodeMirror-selected" style="position: absolute; left: 4px; top: 0px; width: 1131px; height: 20px;"></div><div class="CodeMirror-selected" style="position: absolute; left: 4px; top: 520px; width: 0px; height: 20px;"></div><div class="CodeMirror-selected" style="position: absolute; left: 4px; top: 20px; width: 1131px; height: 500px;"></div></div><div class="CodeMirror-cursors" style="visibility: hidden;"></div><div class="CodeMirror-code"><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="position: absolute; left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 20px;">1</div></div><pre class=""><span style="padding-right: 0.1px;"><span class="cm-keyword">import</span> <span class="cm-variable">java</span>.<span class="cm-variable">io</span>.<span class="cm-operator">*</span>;</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="position: absolute; left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 20px;">2</div></div><pre class=""><span style="padding-right: 0.1px;"><span class="cm-keyword">import</span> <span class="cm-variable">java</span>.<span class="cm-variable">util</span>.<span class="cm-operator">*</span>;</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="position: absolute; left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 20px;">3</div></div><pre class=""><span style="padding-right: 0.1px;"><span>​</span></span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="position: absolute; left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 20px;">4</div></div><pre class=""><span style="padding-right: 0.1px;"><span class="cm-keyword">public</span> <span class="cm-keyword">class</span> <span class="cm-variable">Solution</span> {</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="position: absolute; left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 20px;">5</div></div><pre class=""><span style="padding-right: 0.1px;"><span>​</span></span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="position: absolute; left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 20px;">6</div></div><pre class=""><span style="padding-right: 0.1px;"> &nbsp;  <span class="cm-keyword">public</span> <span class="cm-keyword">static</span> <span class="cm-keyword">void</span> <span class="cm-variable">main</span>(<span class="cm-variable">String</span>[] <span class="cm-variable">args</span>) {</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="position: absolute; left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 20px;">7</div></div><pre class=""><span style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp;  </span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="position: absolute; left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 20px;">8</div></div><pre class=""><span style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp;  <span class="cm-variable">Scanner</span> <span class="cm-variable">sc</span><span class="cm-operator">=</span><span class="cm-keyword">new</span> <span class="cm-variable">Scanner</span>(<span class="cm-variable">System</span>.<span class="cm-variable">in</span>);</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="position: absolute; left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 20px;">9</div></div><pre class=""><span style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp;  <span class="cm-variable">String</span> <span class="cm-variable">A</span><span class="cm-operator">=</span><span class="cm-variable">sc</span>.<span class="cm-variable">next</span>();</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="position: absolute; left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 20px;">10</div></div><pre class=""><span style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp;  <span class="cm-comment">/* Enter your code here. Print output to STDOUT. */</span></span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="position: absolute; left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 20px;">11</div></div><pre class=""><span style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp;  <span class="cm-keyword">int</span> <span class="cm-variable">n</span> <span class="cm-operator">=</span> <span class="cm-variable">A</span>.<span class="cm-variable">length</span>();</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="position: absolute; left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 20px;">12</div></div><pre class=""><span style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp;  </span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="position: absolute; left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 20px;">13</div></div><pre class=""><span style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp;  <span class="cm-keyword">if</span>(<span class="cm-variable">A</span>.<span class="cm-variable">equals</span>(<span class="cm-keyword">new</span> <span class="cm-variable">StringBuilder</span>(<span class="cm-variable">A</span>).<span class="cm-variable">reverse</span>().<span class="cm-variable">toString</span>()))</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="position: absolute; left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 20px;">14</div></div><pre><span style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  {</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="position: absolute; left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 20px;">15</div></div><pre class=""><span style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  <span class="cm-variable">System</span>.<span class="cm-variable">out</span>.<span class="cm-variable">println</span>( <span class="cm-string">"Yes"</span>);</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="position: absolute; left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 20px;">16</div></div><pre><span style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp;  }</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="position: absolute; left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 20px;">17</div></div><pre class=""><span style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp;  <span class="cm-keyword">else</span> </span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="position: absolute; left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 20px;">18</div></div><pre class=""><span style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  {</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="position: absolute; left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 20px;">19</div></div><pre class=""><span style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  <span class="cm-variable">System</span>.<span class="cm-variable">out</span>.<span class="cm-variable">println</span>(<span class="cm-string">"No"</span>);</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="position: absolute; left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 20px;">20</div></div><pre class=""><span style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp;  }</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="position: absolute; left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 20px;">21</div></div><pre class=""><span style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp;  </span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="position: absolute; left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 20px;">22</div></div><pre class=""><span style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; </span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="position: absolute; left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 20px;">23</div></div><pre class=""><span style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  </span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="position: absolute; left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 20px;">24</div></div><pre class=""><span style="padding-right: 0.1px;"> &nbsp; &nbsp; &nbsp;  </span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="position: absolute; left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 20px;">25</div></div><pre class=""><span style="padding-right: 0.1px;"> &nbsp;  }</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="position: absolute; left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 20px;">26</div></div><pre class=""><span style="padding-right: 0.1px;">}</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" style="position: absolute; left: -29px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 20px;">27</div></div><pre class=""><span style="padding-right: 0.1px;"><span>​</span></span></pre></div></div></div></div></div></div><div style="position: absolute; height: 30px; width: 1px; top: 0px;"></div><div class="CodeMirror-gutters" style="height: 548px;"><div class="CodeMirror-gutter CodeMirror-linenumbers" style="width: 28px;"></div></div></div></div></div>
        </div>
    
    
</section>

</div></div>
    </section>
</div>
</div></div>
        <div id="hacker"></div>
    </div>
    <div id="autocomplete-container" style="position:absolute; width: 330px; z-index: 2000; padding-top: 1px;"><ul class="ui-autocomplete ui-front ui-menu ui-widget ui-widget-content no-padding" id="ui-id-39" tabindex="0" style="display: none;"></ul></div>
    <footer class="page_footer">
    <div>
        <div class="text-center">
            Join us on IRC at <a target="_blank" class="page_footer-IRC" href="http://webchat.freenode.net/?channels=hackerrank" data-analytics="FooterLinkIRC">#hackerrank</a> on freenode for hugs or bugs.
            <br>
            <p style="font-size: 14px; margin-top: 5px; margin-bottom: 0px;">
              <span class="internal-links">
                <a target="_blank" href="https://www.hackerrank.com/calendar?utm_source=website&amp;utm_medium=footer&amp;utm_campaign=website" class="calendar" data-analytics="FooterLinkCalendar">Contest Calendar</a>
                |
                <a target="_blank" href="https://www.hackerrank.com/domains/tutorials/cracking-the-coding-interview?utm_source=website&amp;utm_medium=footer&amp;utm_campaign=website" class="interview-prep" data-analytics="FooterLinkCalendar">Interview Prep</a>
                |
                <a target="_blank" href="https://blog.hackerrank.com/" class="blog" data-analytics="FooterLinkBlog">Blog</a>
                |
                <a target="_blank" href="https://www.hackerrank.com/scoring" class="scoring" data-analytics="FooterLinkScoring">Scoring</a>
                |
                <a target="_blank" href="https://www.hackerrank.com/environment" class="environment" data-analytics="FooterLinkEnvironment">Environment</a>
                |
                <a target="_blank" href="https://www.hackerrank.com/faq" class="faq" data-analytics="FooterLinkFAQ">FAQ</a>
                |
              </span>
              <a target="_blank" href="https://www.hackerrank.com/aboutus" data-analytics="FooterLinkAboutUs">About Us</a>
              |
              <a target="_blank" href="https://www.hackerrank.com/support" data-analytics="FooterLinkSupport">Support</a>
              |
              <a target="_blank" href="https://www.hackerrank.com/careers" data-analytics="FooterLinkCareers">Careers</a>
              |
              <a target="_blank" href="https://www.hackerrank.com/terms-of-service" data-analytics="FooterLinkTermsOfService">Terms Of Service</a>
              |
              <a target="_blank" href="https://www.hackerrank.com/privacy" data-analytics="FooterLinkPrivacyPolicy">Privacy Policy</a>
              |
              <a href="https://www.hackerrank.com/support/feature" target="_blank" class="featureRequestButton" data-analytics="FooterLinkFeatureRequest">Request a Feature</a>
            </p>
        </div>
    </div>
</footer>

    <ol id="hr_tour-intro-tour" class="hide">
        <li data-class="hr_tour-challenge-name" data-options="tipLocation:bottom"><h5 class="walkthrough-header">Challenge Walkthrough</h5><span class="walkthrough-text">Let's walk through this sample challenge and explore the features of the code editor.</span><span class="walkthrough-progress">1 of 6</span></li>
        <li data-class="hr_tour-problem-statement" data-options="tipLocation:top"><h5 class="walkthrough-header">Review the problem statement</h5><span class="walkthrough-text">Each challenge has a problem statement that includes sample inputs and outputs. Some challenges include additional information to help you out.</span><span class="walkthrough-progress">2 of 6</span></li>
        <li data-class="hr_tour-select-language" data-options="tipLocation:left"><h5 class="walkthrough-header">Choose a language</h5><span class="walkthrough-text">Select the language you wish to use to solve this challenge.</span><span class="walkthrough-progress">3 of 6</span></li>
        <li data-class="hr_tour-code-solution" data-options="tipLocation:top"><h5 class="walkthrough-header">Enter your code</h5><span class="walkthrough-text">Code your solution in our custom editor or code in your own environment and upload your solution as a file.</span><span class="walkthrough-progress">4 of 6</span></li>
        <li data-class="hr_tour-compile-test" data-options="tipLocation:left"><h5 class="walkthrough-header">Test your code</h5><span class="walkthrough-text">You can compile your code and test it for errors and accuracy before submitting.</span><span class="walkthrough-progress">5 of 6</span></li>
        <li data-class="hr_tour-submit-code" data-button="Done" data-options="tipLocation:left"><h5 class="walkthrough-header">Submit to see results</h5><span class="walkthrough-text">When you're ready, submit your solution! Remember, you can go back and refine your code anytime.</span><span class="walkthrough-progress">6 of 6</span></li>
    </ol>
    <ol id="hr_tour-intro-part-2-tour" class="hide">
        <li data-class="hr_tour-leaderboard">Check your score</li>
    </ol>
    <script type="text/javascript">
     // disable forum social interaction
     HR.disable_fsi = false;
    </script>

    <script type="text/javascript">
      // Setting up jobs constants for use in frontend
      // Jobs visa constants - visa's accepted by company
      HR.VISA_TYPE_NONE = 0
      HR.VISA_TYPE_ALL = 1
      HR.VISA_TYPE_US_RESIDENT = 2
    </script>

    <script type="text/javascript">
      HR.REACT_ROUTE_CONFIG = {
  "var1": ["^/leaderboard/?(\\?.*|$)"],
  "var2": ["^/domains/(?!tutorials).*$"],
  "complete": ["^/domains/?(\\?.*|$)", "^/dashboard/?(\\?.*|$)", "^/contests/?((archived|college)(/\\d*)?)?/?(\\?.*|$)", "^/rank/?(domains|contests)?/?(\\?.*|$)", "^/terms-of-service/?(\\?.*|$)", "^/privacy/?(\\?.*|$)"]
}
;
    </script>


  
  <!-- Load Jquery -->
  <script src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/base-9c1fbd41eaf488758b4fbd25af7ffaee.js"></script>



    <script crossorigin="anonymous" src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/hackerrank_libraries-90c4c23f0640be951e1321b6b8f04d2e.js"></script>
    <script crossorigin="anonymous" src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/codeshell-8bc0c76e0bc6d0665b8267102ed129f0.js"></script>
    <script crossorigin="anonymous" src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/hackerrank-7b377bac05870a6eb3dcf894fbd3ffc7.js"></script>
    <script crossorigin="anonymous" src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/set-manifest-a5257ee924589c7c93e0480f548d82bade902ce0.js"></script>
    <script crossorigin="anonymous" src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/require-32b433aa369780f8df904ae67864e48b.js"></script>
    <script crossorigin="anonymous" src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/dashboard-a27e251211ec970f97a96fed836d5ee1.js"></script>




<!-- jsCookies -->


<script type="text/javascript">
  window.extern_script_delay = 0;
  if (window.PRODUCT_NAMESPACE === 'hackerrank' && typeof($) === "function") {
    $(window).on("load", function(){
      if (('performance' in window) && ('timing' in window.performance)) {
        dom_time = window.performance.timing.domInteractive - window.performance.timing.navigationStart;
        if (dom_time > 12000) {
          window.extern_script_delay = 3000;
        } else if (dom_time > 7000) {
          window.extern_script_delay = 2000;
        } else if (dom_time > 6000) {
          window.extern_script_delay = 1000;
        }
      }
    });
  }
</script>

<script>
</script>

<!-- Totango Tracking Code -->
<!-- End Totango Tracking Code -->

<!-- Google Analytics -->
<script type="text/javascript">
  $(window).on("load", function() {
    setTimeout(function() {
    (function() { var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true; ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js'; var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s); })();
    }, window.extern_script_delay);
  });
</script>

<!-- Mixpanel -->
<script type="text/javascript">
  $(window).on("load", function() {
    setTimeout(function() {
    (function(e,b){if(!b.__SV){var a,f,i,g;window.mixpanel=b;a=e.createElement("script");a.type="text/javascript";a.async=!0;a.src=("https:"===e.location.protocol?"https:":"http:")+'//cdn.mxpnl.com/libs/mixpanel-2.2.min.js';f=e.getElementsByTagName("script")[0];f.parentNode.insertBefore(a,f);b._i=[];b.init=function(a,e,d){function f(b,h){var a=h.split(".");2==a.length&&(b=b[a[0]],h=a[1]);b[h]=function(){b.push([h].concat(Array.prototype.slice.call(arguments,0)))}}var c=b;"undefined"!==
typeof d?c=b[d]=[]:d="mixpanel";c.people=c.people||[];c.toString=function(b){var a="mixpanel";"mixpanel"!==d&&(a+="."+d);b||(a+=" (stub)");return a};c.people.toString=function(){return c.toString(1)+".people (stub)"};i="disable track track_pageview track_links track_forms register register_once alias unregister identify name_tag set_config people.set people.increment people.append people.track_charge people.clear_charges people.delete_user".split(" ");for(g=0;g<i.length;g++)f(c,i[g]);b._i.push([a,e,d])};b.__SV=1.2}})(document,window.mixpanel||[]);
    mixpanel.init("bcb75af88bccc92724ac5fd79271e1ff");

      mixpanel.init("86cf4681911d3ff600208fdc823c5ff5", {}, "jobs_test");
    mixpanel.identify(jsCookies.get("hackerrank_mixpanel_token"));
    }, window.extern_script_delay);
  });
</script>

<script type="text/javascript">
  var heap = [];
  var attrs = ["clearEventProperties","identify","setEventProperties","track","unsetEventProperty"];
  for (var attribute in attrs) {
    heap[attrs[attribute]] = function () {};
  }
</script>





<!-- Filepicker -->
<script type="text/javascript">
  $(window).on("load", function() {
    setTimeout(function() {
    (function(a){if(window.filepicker){return}var b=a.createElement("script");b.type="text/javascript";b.async=!0;b.src=("https:"===a.location.protocol?"https:":"http:")+"//api.filepicker.io/v1/filepicker.js";var c=a.getElementsByTagName("script")[0];c.parentNode.insertBefore(b,c);var d={};d._queue=[];var e="pick,pickMultiple,read,write,writeUrl,export,convert,store,storeUrl,remove,stat,setKey,constructWidget,makeDropPane".split(",");var f=function(a,b){return function(){b.push([a,arguments])}};for(var g=0;g<e.length;g++){d[e[g]]=f(e[g],d._queue)}window.filepicker=d})(document);
    filepicker.setKey("ApehXMbvXTWqWab7OmMr9z");
    }, window.extern_script_delay);
  });
</script>

<script type="text/javascript">
  $(window).on("load", function() {
  setTimeout(function() {
    (function() {
      var _fbq = window._fbq || (window._fbq = []);
      if (!_fbq.loaded) {
        var fbds = document.createElement('script');
        fbds.async = true;
        fbds.src = '//connect.facebook.net/en_US/fbds.js';
        var s = document.getElementsByTagName('script')[0];
        s.parentNode.insertBefore(fbds, s);
        _fbq.loaded = true;
      }
    })();
    }, window.extern_script_delay);
  });
</script>

<script type="text/javascript">
adroll_adv_id = 'W2R3HE5UDBBVTJG3E7ZFRP';
adroll_pix_id = 'ATGIUYAAYJEHNKTJDQ43Z4';
  $(window).on("load", function() {
    setTimeout(function() {
    (function () {
      var oldonload = window.onload;
      window.onload = function(){
        __adroll_loaded=true;
        var scr = document.createElement("script");
        var host = (("https:" == document.location.protocol) ? "https://s.adroll.com" : "http://a.adroll.com");
        scr.setAttribute('async', 'true');
        scr.type = "text/javascript";
        scr.src = host + "/j/roundtrip.js";
        ((document.getElementsByTagName('head') || [null])[0] ||
         document.getElementsByTagName('script')[0].parentNode).appendChild(scr);
        if(oldonload){oldonload()}};
    }());
    }, window.extern_script_delay);
  });
</script>

<!-- bizible -->
<script>
  $(window).on("load", function() {
    setTimeout(function() {
    (function(d, t) {
      var g = d.createElement(t),
          s = d.getElementsByTagName(t)[0];
      g.src = '//cdn.bizible.com/scripts/bizible.js';
      s.parentNode.insertBefore(g, s);
    }(document, 'script'));
    }, window.extern_script_delay);
  });
</script>


<script type="text/javascript">

    !function(obj){window.hr_metrics=obj,obj.loaded=!0,obj.config=obj.config||{},obj._b=obj._b||[],obj.init=function(options){this.config=$.extend({product:null,use_cookie:!1,uid_cookie_key:null,session_cookie_key:null,session_id:null,uid_token:null,uid_token_cookie_key:null,uid:Math.floor(1e12*(1+Math.random())).toString(16)},this.config||{},options||{})},obj.get_session_id=function(){return this.config.session_id?this.config.session_id:this.config.session_cookie_key?$.cookie(this.config.session_cookie_key):null},obj.get_uid_data=function(){return this.config.use_cookie?{uid:$.cookie(this.config.uid_cookie_key),uid_token:$.cookie(this.config.uid_token_cookie_key)}:{uid:this.config.uid,uid_token:this.config.uid_token}},obj.track=function(event_name,event_value,attrs,use_beacon){var common_attrs={session_id:this.get_session_id()},attrs=$.extend({},attrs,common_attrs),_tracking_data=$.extend({product:this.config.product,event_name:event_name,event_value:event_value,params:attrs},this.get_uid_data());this._post_tracking_data(_tracking_data,use_beacon)},obj.batch_track=function(event_name,event_value,attrs,use_beacon){this._EVENT_ARRAY=this._EVENT_ARRAY||[];var common_attrs={session_id:this.get_session_id()},attrs=$.extend({},attrs,common_attrs),_tracking_data={event_name:event_name,event_value:event_value,params:attrs};this._EVENT_ARRAY.push({time:(new Date).getTime(),url:document.location.href,track_data:_tracking_data}),this._event_batch_track_id||(this._event_batch_track_id=window.setInterval(function(that){return function(){that.batch_track_record()}}(this),2e3))},obj.batch_track_record=function(use_beacon){if("object"==typeof this._EVENT_ARRAY&&this._EVENT_ARRAY.length>0){var _tracking_data_array=this._EVENT_ARRAY;this._EVENT_ARRAY=[];var _tracking_data=$.extend({product:this.config.product,batch_request:"true",current_time:(new Date).getTime(),data_array:JSON.stringify(_tracking_data_array)},this.get_uid_data());this._post_tracking_data(_tracking_data,use_beacon)}},obj._post_tracking_data=function(data,use_beacon){var metrics_endpoint="https://metrics.hackerrank.com/metrics";if(window.HR&&window.HR.development&&(metrics_endpoint="/metrics"),use_beacon===!0&&"object"==typeof window.navigator&&"function"==typeof window.navigator.sendBeacon){var _json_blob=new Blob([JSON.stringify(data)],{type:"application/json; charset=UTF-8"});window.navigator.sendBeacon(metrics_endpoint,_json_blob)}else $.ajax({type:"POST",url:metrics_endpoint,crossDomain:!0,xhrFields:{withCredentials:!0},beforeSend:function(xhr){return!0},data:data})},function(o){if(Array.isArray(o._b)){for(var i=0;i<o._b.length;i++){var e=o._b[i];o[e[0]]&&"function"==typeof o[e[0]]&&o[e[0]].apply(o,e[1])}o._b=[]}}(obj)}(window.hr_metrics||{});

  (function() {
    hr_metrics.init({
      product: 'hackerrank',
      use_cookie: true,
      uid_cookie_key: 'hackerrank_mixpanel_token',
      uid_token_cookie_key: 'metrics_user_identifier',
      session_cookie_key: 'session_id'
    });
  })();

  //tracking hrutm_ parameters
  $(window).on("load", function() {
    (function(){
      var sPageURL = window.location.search.substring(1);
      var sURLVariables = sPageURL.split('&');
      var trackingData;
      for(var i = 0; i < sURLVariables.length; i++) {
        var sParameterName = sURLVariables[i].split('=');
        if(sParameterName[0] == 'utm_source') {
          trackingData = decodeURIComponent(escape(sParameterName[1]));
          hr_metrics.track(trackingData.event_name, trackingData)
        } else if (sParameterName[0] == 'ad-campaign' && sParameterName[1]=='Mkt1010415') {
          if(typeof HR !== "undefined" && HR !== null && (!HR.PREFETCH_DATA.profile || !HR.PREFETCH_DATA.profile.created_at)){
            document.cookie = "fb_ad_campaign_source="+sParameterName[1]+";path=/";
          }
        }
      }
    })();

    if(typeof HR !== "undefined" && HR !== null && HR.PREFETCH_DATA && HR.PREFETCH_DATA.profile &&  HR.PREFETCH_DATA.profile.created_at) {
      if($.cookie('fb_ad_campaign_source')) {
        window._fbq.push(['track', '6023409928156', {'value':'0.01','currency':'USD'}]);
        $.removeCookie('fb_ad_campaign_source', { path: '/' });
      }
    }
  });
</script>

  <script type="text/javascript">
    window.hr_metrics_extension_track = true;

      !function(obj){window.hr_metrics=obj,obj.externalService=function(event_type,event_value,attrs,service){attrs="undefined"!=typeof attrs?attrs:{},attrs.session_id=this.get_session_id(),service="undefined"!=typeof service?service:"mixpanel:heap",external_services=service.split(":"),-1!=$.inArray("mixpanel",external_services)?mixpanel.push([event_type,event_value,attrs]):-1!=$.inArray("mixpanel_jobs",external_services)&&mixpanel.jobs_test&&mixpanel.jobs_test.push([event_type,event_value,attrs])},obj.app_track=function(key,attrs){window.APP_METRICS=window.APP_METRICS||[],common_attrs={uid:$.cookie("hackerrank_mixpanel_token")},attrs=$.extend({},attrs,common_attrs),window.APP_METRICS.push({key:key,meta_data:attrs}),window.app_track_interval_id||(window.app_track_interval_id=window.setInterval(hr_metrics._send_app_track_data,5e3))},obj._send_app_track_data=function(){if(window.APP_METRICS&&window.APP_METRICS.constructor===Array&&!(window.APP_METRICS.length<=0)){var track_data={data:window.APP_METRICS};window.APP_METRICS=[];var metrics_endpoint="https://metrics.hackerrank.com/app_metrics";window.HR&&window.HR.development&&(metrics_endpoint="/app_metrics"),"function"==typeof moment&&"function"==typeof moment.tz&&(track_data.local_timezone=moment.tz.guess()),track_data.default_cdn_url=jsCookies.get("default_cdn_url"),track_data.document_referrer=document.referrer,$.ajax({type:"POST",url:metrics_endpoint,crossDomain:!0,xhrFields:{withCredentials:!0},beforeSend:function(xhr){return!0},data:JSON.stringify(track_data),dataType:"json",contentType:"application/json"})}},obj.track_dwell_time=function(pathname,use_beacon){if(this._navigation_data&&this._navigation_data.page==pathname){var time_now=(new Date).getTime();this.batch_track("DwellTime",pathname,{attribute7:parseInt((time_now-(this._navigation_data.time||time_now))/1e3)},use_beacon)}},obj.set_navigation_data=function(pathname){this._navigation_data={page:pathname||document.location.pathname,time:(new Date).getTime()}},window.APP_METRIC_TRACKING_ENABLED&&"performance"in window&&"timing"in window.performance&&$(window).on("load",function(){setTimeout(function(){if(timing=window.performance.timing,obj={referring_url:window.location.pathname,fullLoadTime:timing.loadEventEnd-timing.navigationStart,loadTime:timing.loadEventEnd-timing.fetchStart,domReadyTime:timing.domComplete-timing.domInteractive,readyStart:timing.fetchStart-timing.navigationStart,redirectTime:timing.redirectEnd-timing.redirectStart,appcacheTime:timing.domainLookupStart-timing.fetchStart,unloadEventTime:timing.unloadEventEnd-timing.unloadEventStart,lookupDomainTime:timing.domainLookupEnd-timing.domainLookupStart,connectTime:timing.connectEnd-timing.connectStart,requestTime:timing.responseEnd-timing.requestStart,initDomTreeTime:timing.domInteractive-timing.responseEnd,loadEventTime:timing.loadEventEnd-timing.loadEventStart},"navigation"in window.performance&&"getEntries"in window.performance&&(obj.navigationType=window.performance.navigation.type,obj.navigationRedirectCount=window.performance.navigation.redirectCount,obj.fullLoadTime>8e3))try{var entries=window.performance.getEntries();entries[0].toJSON&&(obj.networkRequests=entries.map(function(e){return e.toJSON()}))}catch(e){}hr_metrics.app_track("page-load-metrics",obj)},1e3)})}(window.hr_metrics||{}),function(){"function"==typeof $&&window.hr_metrics_extension_track&&$(window).on("load",function(){var _pathname=document.location.pathname,cdn_url_switched=jsCookies.get("cdn_url_switched");""!==cdn_url_switched&&jsCookies.destroy("cdn_url_switched"),hr_metrics.batch_track("PageLoad",_pathname+document.location.search,{attribute1:_pathname,attribute6:cdn_url_switched,cdn_url:jsCookies.get("cdn_url")}),hr_metrics.track_dwell_time&&(hr_metrics.track_dwell_time(_pathname),hr_metrics.set_navigation_data()),$(window).on("beforeunload",function(){var _pathname=document.location.pathname;hr_metrics.batch_track("PageClose",_pathname+document.location.search,{attribute2:_pathname},!0),hr_metrics.track_dwell_time&&hr_metrics.track_dwell_time(_pathname,!0),window.typingTimeout&&(window.clearTimeout(window.typingTimeout),window.triggerTypingEvent&&window.typingEventEnabled&&window.triggerTypingEvent()),hr_metrics.batch_track_record(!0)})})}();
  </script>

<!-- Load Facebook SDK for JavaScript -->
<script>
;(function(){
  // Function to have a list of functions to load on fbAsyncInit
  var toLoad = []
  window.fbReady = function(func){
    if( typeof func === 'function') {
      if( window.FB ) {
        func.call(window)
      } else {
        toLoad.push(func)
      }
    }
  }

  window.fbAsyncInit = function() {
    FB.init({
      appId      : '347499128655783',
      xfbml      : true,
      version    : 'v2.5',
      caption    : 'HackerRank.com',
    });

    // Execute all the fbAsyncInit functions
    toLoad.forEach(function(func){
      func.call(window)
    })
  };
})();
$(window).on("load", function() {
  setTimeout(function() {
    (function(d, s, id){
       var js, fjs = d.getElementsByTagName(s)[0];
       if (d.getElementById(id)) {return;}
       js = d.createElement(s); js.id = id;
       js.src = "//connect.facebook.net/en_US/sdk.js";
       fjs.parentNode.insertBefore(js, fjs);
    }(document, 'script', 'facebook-jssdk'));
  }, window.extern_script_delay);
});
</script>
<!-- Load Twitter SDK for JavaScript -->
<script>
window.twttr = (function() {
  t = window.twttr || {};
  if (typeof t.ready === 'undefined') {
    t._e = [];
    t.ready = function(f) {
      t._e.push(f);
    };
  }
  return t;
})();
$(window).on("load", function() {
  setTimeout(function() {
    (function(d, s, id){
       var js, fjs = d.getElementsByTagName(s)[0];
       if (d.getElementById(id)) {return;}
       js = d.createElement(s); js.id = id;
       js.src = "https://platform.twitter.com/widgets.js";
       fjs.parentNode.insertBefore(js, fjs);
    }(document, 'script', 'twitter-wjs'));
  }, window.extern_script_delay);
});
</script>

<script type="text/javascript">
    if (typeof($) == "function") {
        $(document).ready(function() {
            function we_are_hiring() {
                lines = [
                    "===============================================================================",
                    ",--.  ,--.              ,--.                 ,------.                 ,--.     ",
                    "|  '--'  | ,--,--. ,---.|  |,-. ,---. ,--.--.|  .--. ' ,--,--.,--,--, |  |,-.  ",
                    "|  .--.  |' ,-.  || .--'|     /| .-. :|  .--'|  '--'.'' ,-.  ||      \\|     /  ",
                    "|  |  |  |\\ '-'  |\\ `--.|  \\  \\\\   --.|  |   |  |\\  \\ \\ '-'  ||  ||  ||  \\  \\  ",
                    "`--'  `--' `--`--' `---'`--'`--'`----'`--'   `--' '--' `--`--'`--''--'`--'`--' ",
                    "===============================================================================",
                    "  You opened the console! Know some code, do you? Want to work for one of the  ",
                    "  best startups around? https://www.hackerrank.com/careers                     ",
                    "==============================================================================="
                ]
                for (i = 0; i < lines.length; i ++) {
                    console.log(lines[i]);
                }
            }
            setTimeout(we_are_hiring, 5000);
            if(window.trackJs) {
              trackJs.track("Page Loaded");
            }
        });
    }
</script>

<!-- Some Black Magic for Internet Explorer -->

<!--[if lt IE 10]>
<script src="https://hackerrank-a.akamaihd.net/hackerrank/assets/jquery-plugins/jQuery.XDomainRequest-dd31ce35d7f8ad068fa6ecc688661a9b.js"></script>
<![endif]-->

<!--[if lt IE 9]>
<script src="https://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.6/html5shiv.min.js" type="text/javascript"></script>
<![endif]-->

<!-- Chrome Frame for IE6 -->
<!--[if lt IE 7 ]>
 <script src="https://ajax.googleapis.com/ajax/libs/chrome-frame/1.0.2/CFInstall.min.js"></script><script>window.attachEvent("onload",function(){CFInstall.check({mode:"overlay"})})</script>
<![endif]-->

<!--[if lte IE 9]>
<script>
    IE_BROWSER = true
</script>
<![endif]-->

<!-- Track button clicks -->
<script type="text/javascript">
    $(document).on('click', 'a, button, input, select, i', null, function(e) {
        var src = e.currentTarget, $src = $(e.currentTarget);
        if ($src.attr('data-analytics')) {
            action = 'Click'; data = $src.attr('data-analytics');
        } else {
            return;
        }

            hr_metrics.track(action, data, (function() {
                var params={};
                for (var _i=1; _i<=12; ++_i){
                    var _attr = 'data-attr'+_i;
                    if ($src.attr(_attr)){
                        params['attribute'+_i] = $src.attr(_attr);
                }}
                var attributes = src.attributes, attr_length = src.attributes.length;
                for (var i = 0; i < attr_length; i++){
                  var attribute = attributes[i];
                  if (attribute.name.indexOf('data-attr-') === 0){
                    param_name = attribute.name.substr('data-attr-'.length);
                    if (param_name.length > 0) {
                      params[param_name] = attribute.value;
                    }
                  }
                }
                return params;
            })());
        // google analytics
        _gaq.push(['_trackEvent', 'Events' , action, data])
    });

    $(document).on('AnalyticsEvent', function(e) {
        action = e.event_type || false
        data = e.event_name || false

        if (!action || !data)
          return

        params = {}
        params['attribute1'] = e.event_value || ""

        if (window.HR && window.HR.current_page)
          params['attribute2'] = window.HR.current_page

        if (window.HR && window.HR.current_contest)
          params['attribute3'] = window.HR.current_contest.get('name')

            hr_metrics.track(action, data, params);
        // google analytics
        _gaq.push(['_trackEvent', 'Events' , action, data])
    });
</script>



<div class="offline-ui offline-ui-up"><div class="offline-ui-content"></div><a href="https://www.hackerrank.com/" class="offline-ui-retry"></a></div><iframe name="filepicker_comm_iframe" id="filepicker_comm_iframe" src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/saved_resource.html" style="display: none;"></iframe><iframe name="fpapi_comm_iframe" id="fpapi_comm_iframe" src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/saved_resource(1).html" style="display: none;"></iframe><img src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/ipv" style="display: none;"><iframe id="rufous-sandbox" scrolling="no" frameborder="0" allowtransparency="true" allowfullscreen="true" style="position: absolute; visibility: hidden; display: none; width: 0px; height: 0px; padding: 0px; border: none;" title="Twitter analytics iframe" src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/saved_resource(2).html"></iframe><div id="fb-root" class=" fb_reset"><div style="position: absolute; top: -10000px; height: 0px; width: 0px;"><div></div></div><div style="position: absolute; top: -10000px; height: 0px; width: 0px;"><div><iframe name="fb_xdm_frame_https" frameborder="0" allowtransparency="true" allowfullscreen="true" scrolling="no" id="fb_xdm_frame_https" aria-hidden="true" title="Facebook Cross Domain Communication Frame" tabindex="-1" src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/D6ZfFsLEB4F.html" style="border: none;"></iframe></div></div></div><img src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/ipv(1)" style="display: none;"><img src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/ipv(2)" style="display: none;"><img src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/ipv(3)" style="display: none;"><link rel="stylesheet" href="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/animate-4267c4170ac844175bf3e58c90c38cb8.css" media="all"><img src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/ipv(4)" style="display: none;"><img src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/ipv(5)" style="display: none;"><img src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/ipv(6)" style="display: none;"><img src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/ipv(7)" style="display: none;"><img src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/ipv(8)" style="display: none;"><span role="status" aria-live="assertive" aria-relevant="additions" class="ui-helper-hidden-accessible"></span><img src="./Java String Reverse Submission #35398614 _ Java Question _ HackerRank_files/ipv(9)" style="display: none;"></body></html>