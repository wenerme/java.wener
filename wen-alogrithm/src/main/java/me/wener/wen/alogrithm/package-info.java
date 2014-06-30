package me.wener.wen.alogrithm;

/**
 <p>
 <h2>Color space</h2>
 <ul>
 CIE
 <li>CIEXYZ CIELAB CIECAM02 CIELUV Yuv CIEUVW CIE RGB</li>

 RGB
 <li>color spaces sRGB RG chromaticity Adobe Wide Gamut ProPhoto scRGB Rec. 709 Rec. 2020</li>

 YUV
 <li>YUV (PAL) YDbDr (SECAM) YIQ (NTSC) YCbCr (Rec. 601 Rec. 709) YPbPr xvYCC</li>

 Other
 <li>CcMmYK CMYK Coloroid LMS Hexachrome HSL, HSV Imaginary color OSA-UCS PCCS RG RYB</li>
 </ul>
 </p>

 <p>
 <h2>Value Range</h2>
 <table border="1" width="100%" bordercolordark="white" bordercolorlight="black" cellspacing="0">
 <tbody><tr>
 <td nowrap="">
 <p><i>Applications</i></p>
 </td>
 <td width="18%" nowrap="">
 <p align="center">Space</p>
 </td>
 <td width="18%" nowrap="">
 <p align="center"><b>H</b> Range</p>
 </td>
 <td width="18%" nowrap="">
 <p align="center"><b>S</b> Range</p>
 </td>
 <td width="22%" nowrap="" colspan="2">
 <p align="center"><b>L/V/B</b> Range</p>
 </td>
 </tr>
 <tr>
 <td nowrap="">
 <p><b>Paint Shop Pro</b></p>
 </td>
 <td width="18%" nowrap="">
 <p align="center">HSL</p>
 <iframe id="tmp_downloadhelper_iframe" style="display: none;"></iframe></td>
 <td width="18%" nowrap="">
 <p align="center">0 - 255</p>
 </td>
 <td width="18%" nowrap="">
 <p align="center">0 - 255</p>
 </td>
 <td width="4%" nowrap="">
 <p align="center"><b>L</b></p>
 </td>
 <td width="18%" nowrap="">
 <p align="center">0 - 255</p>
 </td>
 </tr>
 <tr>
 <td nowrap="">
 <p><b>Gimp</b></p>
 </td>
 <td width="18%" nowrap="">
 <p align="center">HSV</p>
 </td>
 <td width="18%" nowrap="">
 <p align="center">0 - 360°</p>
 </td>
 <td width="18%" nowrap="">
 <p align="center">0 - 100</p>
 </td>
 <td width="4%" nowrap="">
 <p align="center"><b>V</b></p>
 </td>
 <td width="18%" nowrap="">
 <p align="center">0 - 100</p>
 </td>
 </tr>
 <tr>
 <td nowrap="">
 <p><b>Photoshop</b></p>
 </td>
 <td width="18%" nowrap="">
 <p align="center">HSV</p>
 </td>
 <td width="18%" nowrap="">
 <p align="center">0 - 360°</p>
 </td>
 <td width="18%" nowrap="">
 <p align="center">0 - 100%</p>
 </td>
 <td width="4%" nowrap="">
 <p align="center"><b>B</b></p>
 </td>
 <td width="18%" nowrap="">
 <p align="center">0 - 100%</p>
 </td>
 </tr>
 <tr>
 <td nowrap="">
 <p><b>Windows</b></p>
 </td>
 <td width="18%" nowrap="">
 <p align="center">HSL</p>
 </td>
 <td width="18%" nowrap="">
 <p align="center">0 - 240</p>
 </td>
 <td width="18%" nowrap="">
 <p align="center">0 - 240</p>
 </td>
 <td width="4%" nowrap="">
 <p align="center"><b>L</b></p>
 </td>
 <td width="18%" nowrap="">
 <p align="center">0 - 240</p>
 </td>
 </tr>
 <tr>
 <td nowrap="">
 <p><b>Linux / KDE</b></p>
 </td>
 <td width="18%" nowrap="">
 <p align="center">HSV</p>
 </td>
 <td width="18%" nowrap="">
 <p align="center">0 - 360°</p>
 </td>
 <td width="18%" nowrap="">
 <p align="center">0 - 255</p>
 </td>
 <td width="4%" nowrap="">
 <p align="center"><b>V</b></p>
 </td>
 <td width="18%" nowrap="">
 <p align="center">0 - 255</p>
 </td>
 </tr>
 <tr>
 <td nowrap="">
 <p><b>GTK</b></p>
 </td>
 <td width="18%" nowrap="">
 <p align="center">HSV</p>
 </td>
 <td width="18%" nowrap="">
 <p align="center">0 - 360°</p>
 </td>
 <td width="18%" nowrap="">
 <p align="center">0 - 1.0</p>
 </td>
 <td width="4%" nowrap="">
 <p align="center"><b>V</b></p>
 </td>
 <td width="18%" nowrap="">
 <p align="center">0 - 1.0</p>
 </td>
 </tr>
 <tr>
 <td nowrap="">
 <p><b>Java (awt.Color)</b></p>
 </td>
 <td width="18%" nowrap="">
 <p align="center">HSV</p>
 </td>
 <td width="18%" nowrap="">
 <p align="center">0 - 1.0</p>
 </td>
 <td width="18%" nowrap="">
 <p align="center">0 - 1.0</p>
 </td>
 <td width="4%" nowrap="">
 <p align="center"><b>B</b></p>
 </td>
 <td width="18%" nowrap="">
 <p align="center">0 - 1.0</p>
 </td>
 </tr>
 <tr>
 <td nowrap="">
 <p><b>Apple</b></p>
 </td>
 <td width="18%" nowrap="">
 <p align="center">HSV</p>
 </td>
 <td width="18%" nowrap="">
 <p align="center">0 - 360°</p>
 </td>
 <td width="18%" nowrap="">
 <p align="center">0 - 100%</p>
 </td>
 <td width="4%" nowrap="">
 <p align="center"><b>L</b></p>
 </td>
 <td width="18%" nowrap="">
 <p align="center">0 - 100%</p>
 </td>
 </tr>
 </tbody></table>
 </p>

 <p>

 </p>
 */