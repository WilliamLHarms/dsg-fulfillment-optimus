<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<style>
.AlignLeft { text-align: left; }
.AlignCenter { text-align: center; }
.AlignRight { text-align: right; }
body { font-family: sans-serif; font-size: 11pt; }
td { vertical-align: top; padding-left: 4px; padding-right: 4px; }

tr.SectionGap td { font-size: 4px; border-left: none; border-top: none; border-bottom: 1px solid Black; border-right: 1px solid Black; }
tr.SectionAll td { border-left: none; border-top: none; border-bottom: 1px solid Black; border-right: 1px solid Black; }
tr.SectionBegin td { border-left: none; border-top: none; border-right: 1px solid Black; }
tr.SectionEnd td { border-left: none; border-top: none; border-bottom: 1px solid Black; border-right: 1px solid Black; }
tr.SectionMiddle td { border-left: none; border-top: none; border-right: 1px solid Black; }
tr.SubsectionAll td { border-left: none; border-top: none; border-bottom: 1px solid Gray; border-right: 1px solid Black; }
tr.SubsectionEnd td { border-left: none; border-top: none; border-bottom: 1px solid Gray; border-right: 1px solid Black; }
table.fc { border-top: 1px solid Black; border-left: 1px solid Black; width: 100%; font-family: monospace; font-size: 10pt; }
td.TextItemInsigAdd { color: #000000; background-color: #EFEFFF; }
td.TextItemInsigDel { color: #000000; background-color: #EFEFFF; text-decoration: line-through; }
td.TextItemInsigDiffMod { color: #000000; background-color: #EFEFFF; }
td.TextItemInsigLeftMod { color: #000000; background-color: #EFEFFF; }
td.TextItemInsigRightMod { color: #000000; background-color: #EFEFFF; }
td.TextItemNum { color: #827357; background-color: #F2F2F2; }
td.TextItemSame { color: #000000; background-color: #FFFFFF; }
td.TextItemSigAdd { color: #000000; background-color: #FFE3E3; }
td.TextItemSigDel { color: #000000; background-color: #FFE3E3; text-decoration: line-through; }
td.TextItemSigDiffMod { color: #000000; background-color: #FFE3E3; }
td.TextItemSigLeftMod { color: #000000; background-color: #FFE3E3; }
td.TextItemSigRightMod { color: #000000; background-color: #FFE3E3; }
.TextSegInsigDiff { color: #0000FF; }
.TextSegReplacedDiff { color: #0000FF; font-style: italic; }
.TextSegSigDiff { color: #FF0000; }
.TextSegElementKeyword { font-weight: bold; }
.TextSegElementIdentifier { }
.TextSegElementOperator { }
</style>
<title>ItemAvailability.java</title>
</head>
<body>
ItemAvailability.java<br/>
Produced: 4/6/2018 8:55:48 AM<br/>
&nbsp; &nbsp;
<br/>
Mode:&nbsp; All &nbsp;
<br/>
Left file: X:\git\BRANCH\dsg-fulfillment-optimus-master\dsg-fulfillment-optimus\src\main\java\com\dcsg\fulfillment\optimus\ItemAvailability.java &nbsp;
<br/>
Right file: X:\git\dsg-fulfillment-optimus\dsg-fulfillment-optimus\src\main\java\com\dcsg\fulfillment\optimus\ItemAvailability.java &nbsp;
<br/>
<table class="fc" cellspacing="0" cellpadding="0">
<tr class="SectionBegin">
<td class="TextItemNum AlignRight">1</td>
<td class="TextItemSame"><span class="TextSegElementKeyword">package</span> <span class="TextSegElementIdentifier">com</span><span class="TextSegElementOperator">.</span><span class="TextSegElementIdentifier">dcsg</span><span class="TextSegElementOperator">.</span><span class="TextSegElementIdentifier">fulfillment</span><span class="TextSegElementOperator">.</span><span class="TextSegElementIdentifier">optimus</span><span class="TextSegElementOperator">;</span></td>
<td class="AlignCenter">=</td>
<td class="TextItemNum AlignRight">1</td>
<td class="TextItemSame"><span class="TextSegElementKeyword">package</span> <span class="TextSegElementIdentifier">com</span><span class="TextSegElementOperator">.</span><span class="TextSegElementIdentifier">dcsg</span><span class="TextSegElementOperator">.</span><span class="TextSegElementIdentifier">fulfillment</span><span class="TextSegElementOperator">.</span><span class="TextSegElementIdentifier">optimus</span><span class="TextSegElementOperator">;</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">2</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">2</td>
<td class="TextItemSame">&nbsp;</td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">3</td>
<td class="TextItemSame"><span class="TextSegElementKeyword">public</span> <span class="TextSegElementKeyword">class</span> <span class="TextSegElementIdentifier">ItemAvailability</span> <span class="TextSegElementOperator">{</span></td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">3</td>
<td class="TextItemSame"><span class="TextSegElementKeyword">public</span> <span class="TextSegElementKeyword">class</span> <span class="TextSegElementIdentifier">ItemAvailability</span> <span class="TextSegElementOperator">{</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">4</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">4</td>
<td class="TextItemSame">&nbsp;</td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">5</td>
<td class="TextItemSame">&nbsp; &nbsp; <span class="TextSegElementKeyword">private</span> <span class="TextSegElementKeyword">int</span> <span class="TextSegElementIdentifier">storeGroupQuantity</span><span class="TextSegElementOperator">;</span></td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">5</td>
<td class="TextItemSame">&nbsp; &nbsp; <span class="TextSegElementKeyword">private</span> <span class="TextSegElementKeyword">int</span> <span class="TextSegElementIdentifier">storeGroupQuantity</span><span class="TextSegElementOperator">;</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">6</td>
<td class="TextItemSame">&nbsp; &nbsp; <span class="TextSegElementKeyword">private</span> <span class="TextSegElementKeyword">int</span> <span class="TextSegElementIdentifier">supplierGroupQuantity</span><span class="TextSegElementOperator">;</span></td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">6</td>
<td class="TextItemSame">&nbsp; &nbsp; <span class="TextSegElementKeyword">private</span> <span class="TextSegElementKeyword">int</span> <span class="TextSegElementIdentifier">supplierGroupQuantity</span><span class="TextSegElementOperator">;</span></td>
</tr>
<tr class="SectionEnd">
<td class="TextItemNum AlignRight">7</td>
<td class="TextItemSame">&nbsp; &nbsp; <span class="TextSegElementKeyword">private</span> <span class="TextSegElementKeyword">int</span> <span class="TextSegElementIdentifier">dcGroupQuantity</span><span class="TextSegElementOperator">;</span></td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">7</td>
<td class="TextItemSame">&nbsp; &nbsp; <span class="TextSegElementKeyword">private</span> <span class="TextSegElementKeyword">int</span> <span class="TextSegElementIdentifier">dcGroupQuantity</span><span class="TextSegElementOperator">;</span></td>
</tr>
<tr class="SectionBegin">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">-+</td>
<td class="TextItemNum AlignRight">8</td>
<td class="TextItemSigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; </span><span class="TextSegSigDiff">private</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">String</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">itemDepartment</span><span class="TextSegSigDiff">;</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">9</td>
<td class="TextItemSigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; </span><span class="TextSegSigDiff">private</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">String</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">itemSubDepartment</span><span class="TextSegSigDiff">;</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">10</td>
<td class="TextItemSigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; </span><span class="TextSegSigDiff">private</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">String</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">itemClass</span><span class="TextSegSigDiff">;</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">11</td>
<td class="TextItemSigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; </span><span class="TextSegSigDiff">private</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">String</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">itemSubClass</span><span class="TextSegSigDiff">;</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">12</td>
<td class="TextItemInsigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; </span></td>
</tr>
<tr class="SectionEnd">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">13</td>
<td class="TextItemInsigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; </span></td>
</tr>
<tr class="SectionBegin">
<td class="TextItemNum AlignRight">8</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">=</td>
<td class="TextItemNum AlignRight">14</td>
<td class="TextItemSame">&nbsp;</td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">9</td>
<td class="TextItemSame">&nbsp; &nbsp; <span class="TextSegElementKeyword">public</span> <span class="TextSegElementKeyword">int</span> <span class="TextSegElementIdentifier">getStoreGroupQuantity</span><span class="TextSegElementOperator">(</span><span class="TextSegElementOperator">)</span> <span class="TextSegElementOperator">{</span></td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">15</td>
<td class="TextItemSame">&nbsp; &nbsp; <span class="TextSegElementKeyword">public</span> <span class="TextSegElementKeyword">int</span> <span class="TextSegElementIdentifier">getStoreGroupQuantity</span><span class="TextSegElementOperator">(</span><span class="TextSegElementOperator">)</span> <span class="TextSegElementOperator">{</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">10</td>
<td class="TextItemSame">&nbsp; &nbsp; &nbsp; &nbsp; <span class="TextSegElementKeyword">return</span> <span class="TextSegElementIdentifier">storeGroupQuantity</span><span class="TextSegElementOperator">;</span></td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">16</td>
<td class="TextItemSame">&nbsp; &nbsp; &nbsp; &nbsp; <span class="TextSegElementKeyword">return</span> <span class="TextSegElementIdentifier">storeGroupQuantity</span><span class="TextSegElementOperator">;</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">11</td>
<td class="TextItemSame">&nbsp; &nbsp; <span class="TextSegElementOperator">}</span></td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">17</td>
<td class="TextItemSame">&nbsp; &nbsp; <span class="TextSegElementOperator">}</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">12</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">18</td>
<td class="TextItemSame">&nbsp;</td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">13</td>
<td class="TextItemSame">&nbsp; &nbsp; <span class="TextSegElementKeyword">public</span> <span class="TextSegElementKeyword">void</span> <span class="TextSegElementIdentifier">setStoreGroupQuantity</span><span class="TextSegElementOperator">(</span><span class="TextSegElementKeyword">int</span> <span class="TextSegElementIdentifier">storeGroupQuantity</span><span class="TextSegElementOperator">)</span> <span class="TextSegElementOperator">{</span></td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">19</td>
<td class="TextItemSame">&nbsp; &nbsp; <span class="TextSegElementKeyword">public</span> <span class="TextSegElementKeyword">void</span> <span class="TextSegElementIdentifier">setStoreGroupQuantity</span><span class="TextSegElementOperator">(</span><span class="TextSegElementKeyword">int</span> <span class="TextSegElementIdentifier">storeGroupQuantity</span><span class="TextSegElementOperator">)</span> <span class="TextSegElementOperator">{</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">14</td>
<td class="TextItemSame">&nbsp; &nbsp; &nbsp; &nbsp; <span class="TextSegElementKeyword">this</span><span class="TextSegElementOperator">.</span><span class="TextSegElementIdentifier">storeGroupQuantity</span> <span class="TextSegElementOperator">=</span> <span class="TextSegElementIdentifier">storeGroupQuantity</span><span class="TextSegElementOperator">;</span></td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">20</td>
<td class="TextItemSame">&nbsp; &nbsp; &nbsp; &nbsp; <span class="TextSegElementKeyword">this</span><span class="TextSegElementOperator">.</span><span class="TextSegElementIdentifier">storeGroupQuantity</span> <span class="TextSegElementOperator">=</span> <span class="TextSegElementIdentifier">storeGroupQuantity</span><span class="TextSegElementOperator">;</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">15</td>
<td class="TextItemSame">&nbsp; &nbsp; <span class="TextSegElementOperator">}</span></td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">21</td>
<td class="TextItemSame">&nbsp; &nbsp; <span class="TextSegElementOperator">}</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">16</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">22</td>
<td class="TextItemSame">&nbsp;</td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">17</td>
<td class="TextItemSame">&nbsp; &nbsp; <span class="TextSegElementKeyword">public</span> <span class="TextSegElementKeyword">int</span> <span class="TextSegElementIdentifier">getSupplierGroupQuantity</span><span class="TextSegElementOperator">(</span><span class="TextSegElementOperator">)</span> <span class="TextSegElementOperator">{</span></td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">23</td>
<td class="TextItemSame">&nbsp; &nbsp; <span class="TextSegElementKeyword">public</span> <span class="TextSegElementKeyword">int</span> <span class="TextSegElementIdentifier">getSupplierGroupQuantity</span><span class="TextSegElementOperator">(</span><span class="TextSegElementOperator">)</span> <span class="TextSegElementOperator">{</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">18</td>
<td class="TextItemSame">&nbsp; &nbsp; &nbsp; &nbsp; <span class="TextSegElementKeyword">return</span> <span class="TextSegElementIdentifier">supplierGroupQuantity</span><span class="TextSegElementOperator">;</span></td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">24</td>
<td class="TextItemSame">&nbsp; &nbsp; &nbsp; &nbsp; <span class="TextSegElementKeyword">return</span> <span class="TextSegElementIdentifier">supplierGroupQuantity</span><span class="TextSegElementOperator">;</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">19</td>
<td class="TextItemSame">&nbsp; &nbsp; <span class="TextSegElementOperator">}</span></td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">25</td>
<td class="TextItemSame">&nbsp; &nbsp; <span class="TextSegElementOperator">}</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">20</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">26</td>
<td class="TextItemSame">&nbsp;</td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">21</td>
<td class="TextItemSame">&nbsp; &nbsp; <span class="TextSegElementKeyword">public</span> <span class="TextSegElementKeyword">void</span> <span class="TextSegElementIdentifier">setSupplierGroupQuantity</span><span class="TextSegElementOperator">(</span><span class="TextSegElementKeyword">int</span> <span class="TextSegElementIdentifier">supplierGroupQuantity</span><span class="TextSegElementOperator">)</span> <span class="TextSegElementOperator">{</span></td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">27</td>
<td class="TextItemSame">&nbsp; &nbsp; <span class="TextSegElementKeyword">public</span> <span class="TextSegElementKeyword">void</span> <span class="TextSegElementIdentifier">setSupplierGroupQuantity</span><span class="TextSegElementOperator">(</span><span class="TextSegElementKeyword">int</span> <span class="TextSegElementIdentifier">supplierGroupQuantity</span><span class="TextSegElementOperator">)</span> <span class="TextSegElementOperator">{</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">22</td>
<td class="TextItemSame">&nbsp; &nbsp; &nbsp; &nbsp; <span class="TextSegElementKeyword">this</span><span class="TextSegElementOperator">.</span><span class="TextSegElementIdentifier">supplierGroupQuantity</span> <span class="TextSegElementOperator">=</span> <span class="TextSegElementIdentifier">supplierGroupQuantity</span><span class="TextSegElementOperator">;</span></td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">28</td>
<td class="TextItemSame">&nbsp; &nbsp; &nbsp; &nbsp; <span class="TextSegElementKeyword">this</span><span class="TextSegElementOperator">.</span><span class="TextSegElementIdentifier">supplierGroupQuantity</span> <span class="TextSegElementOperator">=</span> <span class="TextSegElementIdentifier">supplierGroupQuantity</span><span class="TextSegElementOperator">;</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">23</td>
<td class="TextItemSame">&nbsp; &nbsp; <span class="TextSegElementOperator">}</span></td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">29</td>
<td class="TextItemSame">&nbsp; &nbsp; <span class="TextSegElementOperator">}</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">24</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">30</td>
<td class="TextItemSame">&nbsp;</td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">25</td>
<td class="TextItemSame">&nbsp; &nbsp; <span class="TextSegElementKeyword">public</span> <span class="TextSegElementKeyword">int</span> <span class="TextSegElementIdentifier">getDcGroupQuantity</span><span class="TextSegElementOperator">(</span><span class="TextSegElementOperator">)</span> <span class="TextSegElementOperator">{</span></td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">31</td>
<td class="TextItemSame">&nbsp; &nbsp; <span class="TextSegElementKeyword">public</span> <span class="TextSegElementKeyword">int</span> <span class="TextSegElementIdentifier">getDcGroupQuantity</span><span class="TextSegElementOperator">(</span><span class="TextSegElementOperator">)</span> <span class="TextSegElementOperator">{</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">26</td>
<td class="TextItemSame">&nbsp; &nbsp; &nbsp; &nbsp; <span class="TextSegElementKeyword">return</span> <span class="TextSegElementIdentifier">dcGroupQuantity</span><span class="TextSegElementOperator">;</span></td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">32</td>
<td class="TextItemSame">&nbsp; &nbsp; &nbsp; &nbsp; <span class="TextSegElementKeyword">return</span> <span class="TextSegElementIdentifier">dcGroupQuantity</span><span class="TextSegElementOperator">;</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">27</td>
<td class="TextItemSame">&nbsp; &nbsp; <span class="TextSegElementOperator">}</span></td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">33</td>
<td class="TextItemSame">&nbsp; &nbsp; <span class="TextSegElementOperator">}</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">28</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">34</td>
<td class="TextItemSame">&nbsp;</td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">29</td>
<td class="TextItemSame">&nbsp; &nbsp; <span class="TextSegElementKeyword">public</span> <span class="TextSegElementKeyword">void</span> <span class="TextSegElementIdentifier">setDcGroupQuantity</span><span class="TextSegElementOperator">(</span><span class="TextSegElementKeyword">int</span> <span class="TextSegElementIdentifier">dcGroupQuantity</span><span class="TextSegElementOperator">)</span> <span class="TextSegElementOperator">{</span></td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">35</td>
<td class="TextItemSame">&nbsp; &nbsp; <span class="TextSegElementKeyword">public</span> <span class="TextSegElementKeyword">void</span> <span class="TextSegElementIdentifier">setDcGroupQuantity</span><span class="TextSegElementOperator">(</span><span class="TextSegElementKeyword">int</span> <span class="TextSegElementIdentifier">dcGroupQuantity</span><span class="TextSegElementOperator">)</span> <span class="TextSegElementOperator">{</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">30</td>
<td class="TextItemSame">&nbsp; &nbsp; &nbsp; &nbsp; <span class="TextSegElementKeyword">this</span><span class="TextSegElementOperator">.</span><span class="TextSegElementIdentifier">dcGroupQuantity</span> <span class="TextSegElementOperator">=</span> <span class="TextSegElementIdentifier">dcGroupQuantity</span><span class="TextSegElementOperator">;</span></td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">36</td>
<td class="TextItemSame">&nbsp; &nbsp; &nbsp; &nbsp; <span class="TextSegElementKeyword">this</span><span class="TextSegElementOperator">.</span><span class="TextSegElementIdentifier">dcGroupQuantity</span> <span class="TextSegElementOperator">=</span> <span class="TextSegElementIdentifier">dcGroupQuantity</span><span class="TextSegElementOperator">;</span></td>
</tr>
<tr class="SectionEnd">
<td class="TextItemNum AlignRight">31</td>
<td class="TextItemSame">&nbsp; &nbsp; <span class="TextSegElementOperator">}</span></td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">37</td>
<td class="TextItemSame">&nbsp; &nbsp; <span class="TextSegElementOperator">}</span></td>
</tr>
<tr class="SectionBegin">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">-+</td>
<td class="TextItemNum AlignRight">38</td>
<td class="TextItemInsigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; </span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">39</td>
<td class="TextItemInsigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; </span><span class="TextSegInsigDiff">/** Getters and Setters for DEPT-SUBD-CLASS-SUBC - used for ship alones**/</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">40</td>
<td class="TextItemSigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; </span><span class="TextSegSigDiff">public</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">void</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">setItemDepartment</span><span class="TextSegSigDiff">(</span><span class="TextSegSigDiff">String</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">itemDepartment</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">)</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">{</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">41</td>
<td class="TextItemSigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; &nbsp; &nbsp; </span><span class="TextSegSigDiff">this</span><span class="TextSegSigDiff">.</span><span class="TextSegSigDiff">itemDepartment</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">=</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">itemDepartment</span><span class="TextSegSigDiff">;</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">42</td>
<td class="TextItemInsigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; &nbsp; &nbsp; </span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">43</td>
<td class="TextItemSigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; </span><span class="TextSegSigDiff">}</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">44</td>
<td class="TextItemInsigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; </span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">45</td>
<td class="TextItemSigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; </span><span class="TextSegSigDiff">public</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">String</span><span class="TextSegInsigDiff">&nbsp; </span><span class="TextSegSigDiff">getItemDepartment</span><span class="TextSegSigDiff">(</span><span class="TextSegSigDiff">)</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">{</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">46</td>
<td class="TextItemSigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; &nbsp; &nbsp; </span><span class="TextSegSigDiff">return</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">itemDepartment</span><span class="TextSegSigDiff">;</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">47</td>
<td class="TextItemSigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; </span><span class="TextSegSigDiff">}</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">48</td>
<td class="TextItemInsigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; </span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">49</td>
<td class="TextItemInsigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; </span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">50</td>
<td class="TextItemSigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; </span><span class="TextSegSigDiff">public</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">void</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">setItemSubDepartment</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">(</span><span class="TextSegSigDiff">String</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">itemSubDepartment</span><span class="TextSegSigDiff">)</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">{</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">51</td>
<td class="TextItemSigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; &nbsp; &nbsp; </span><span class="TextSegSigDiff">this</span><span class="TextSegSigDiff">.</span><span class="TextSegSigDiff">itemSubDepartment</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">=</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">itemSubDepartment</span><span class="TextSegSigDiff">;</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">52</td>
<td class="TextItemSigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; </span><span class="TextSegSigDiff">}</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">53</td>
<td class="TextItemInsigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; </span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">54</td>
<td class="TextItemSigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; </span><span class="TextSegSigDiff">public</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">String</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">getItemSubDepartment</span><span class="TextSegSigDiff">(</span><span class="TextSegSigDiff">)</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">{</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">55</td>
<td class="TextItemSigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; &nbsp; &nbsp; </span><span class="TextSegSigDiff">return</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">itemDepartment</span><span class="TextSegSigDiff">;</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">56</td>
<td class="TextItemSigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; </span><span class="TextSegSigDiff">}</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">57</td>
<td class="TextItemInsigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; </span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">58</td>
<td class="TextItemSigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; </span><span class="TextSegSigDiff">public</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">void</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">setItemClass</span><span class="TextSegSigDiff">(</span><span class="TextSegSigDiff">String</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">itemClass</span><span class="TextSegSigDiff">)</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">{</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">59</td>
<td class="TextItemSigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; &nbsp; &nbsp; </span><span class="TextSegSigDiff">this</span><span class="TextSegSigDiff">.</span><span class="TextSegSigDiff">itemClass</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">=</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">itemClass</span><span class="TextSegSigDiff">;</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">60</td>
<td class="TextItemSigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; </span><span class="TextSegSigDiff">}</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">61</td>
<td class="TextItemInsigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; </span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">62</td>
<td class="TextItemSigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; </span><span class="TextSegSigDiff">public</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">String</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">getItemClass</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">(</span><span class="TextSegSigDiff">)</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">{</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">63</td>
<td class="TextItemSigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; &nbsp; &nbsp; </span><span class="TextSegSigDiff">return</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">itemClass</span><span class="TextSegSigDiff">;</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">64</td>
<td class="TextItemSigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; </span><span class="TextSegSigDiff">}</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">65</td>
<td class="TextItemInsigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; </span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">66</td>
<td class="TextItemSigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; </span><span class="TextSegSigDiff">public</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">void</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">setItemSubClass</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">(</span><span class="TextSegSigDiff">String</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">itemSubClass</span><span class="TextSegSigDiff">)</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">{</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">67</td>
<td class="TextItemSigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; &nbsp; &nbsp; </span><span class="TextSegSigDiff">this</span><span class="TextSegSigDiff">.</span><span class="TextSegSigDiff">itemSubClass</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">=</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">itemSubClass</span><span class="TextSegSigDiff">;</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">68</td>
<td class="TextItemSigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; </span><span class="TextSegSigDiff">}</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">69</td>
<td class="TextItemInsigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; </span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">70</td>
<td class="TextItemSigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; </span><span class="TextSegSigDiff">public</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">String</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">getItemSubClass</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">(</span><span class="TextSegSigDiff">)</span><span class="TextSegInsigDiff"> </span><span class="TextSegSigDiff">{</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">71</td>
<td class="TextItemSigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; &nbsp; &nbsp; </span><span class="TextSegSigDiff">return</span><span class="TextSegInsigDiff">&nbsp; </span><span class="TextSegSigDiff">itemSubClass</span><span class="TextSegSigDiff">;</span></td>
</tr>
<tr class="SectionMiddle">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">72</td>
<td class="TextItemSigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; </span><span class="TextSegSigDiff">}</span></td>
</tr>
<tr class="SectionEnd">
<td class="TextItemNum AlignRight">&nbsp;</td>
<td class="TextItemSame">&nbsp;</td>
<td class="AlignCenter">&nbsp;</td>
<td class="TextItemNum AlignRight">73</td>
<td class="TextItemInsigRightMod"><span class="TextSegInsigDiff">&nbsp; &nbsp; </span></td>
</tr>
<tr class="SectionAll">
<td class="TextItemNum AlignRight">32</td>
<td class="TextItemSame"><span class="TextSegElementOperator">}</span></td>
<td class="AlignCenter">=</td>
<td class="TextItemNum AlignRight">74</td>
<td class="TextItemSame"><span class="TextSegElementOperator">}</span></td>
</tr>
</table>
<br/>
</body>
</html>
