<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="/js/echarts.min.js"></script>
<link rel="stylesheet" href="/css/layui.css" />
<link rel="stylesheet" href="/css/laydate.css" />
<script type="text/javascript">
	onload=function(){
		
	}
</script>
<style type="text/css">
.layui-table td, .layui-table th {
    position: relative;
    padding: 0px 0px;
    min-height: 20px;
    line-height: 20px;	
    font-size: 14px;
    text-align: center;
}
.layui-tab-title {
    line-height: 26px;
}
</style>
<body>
<div class="layui-row">
			<div class="layui-col-xs8">
				<div class="grid-demo grid-demo-bg1" style="margin-left: 10px;">
					<div class="layui-tab layui-tab-card">
						<ul class="layui-tab-title" style="background-color: #CBECF9;height: 35px;">
							<li><strong>概要分析</strong></li>
						</ul>
						<div class="layui-tab-content" style="height: 530px;">

							<div id="container1" style="height: 250px;width: 1000px;"></div>
							<div id="container2" style="height: 250px;margin-top: 30px;width: 1000px;"></div>
							
						</div>
					</div>
				</div>
			</div>
			<div class="layui-col-xs4">
				<div class="layui-col-md12">
					<div class="grid-demo grid-demo-bg1" style="margin-left: 10px;margin-right: 10px;">
						<div class="layui-tab layui-tab-card">
							<ul class="layui-tab-title" style="height: 25px;background-color: #CBECF9;">
								<li style="padding: 0px;line-height: 20px;min-width: 20px;"> <span class="layui-badge-dot layui-bg-blue"></span></li>
								<li style="padding: 0px;line-height: 20px;"><strong>最新公告</strong></li>
								<li style="padding: 0px;line-height: 20px;min-width: 400px;text-align: right;"> >>更多</li>
								
							</ul>
							<!-- -->
							<div class="layui-form">
							  <table class="layui-table" lay-skin="line" style="height: 100px;">
							    <tbody>
							      <tr>
							        <td style="text-align: left;width: 30px;">&nbsp;&nbsp;<i class="layui-icon layui-icon-notice"></i> </td>
							        <td style="text-align: left; color: #000000;">
							        	暂无公告信息
							        </td>
							      </tr>
							    </tbody>
							  </table>
							</div>
							<!-- -->
						</div>
					</div>
				</div>
				<div class="layui-col-md12">
					<div class="grid-demo grid-demo-bg2" style="margin-left: 10px;margin-right: 10px;">
						<div class="layui-tab layui-tab-card" style="margin: 0px;">
							<ul class="layui-tab-title" style="height: 25px;background-color: #CBECF9;">
								<li style="padding: 0px;line-height: 20px;min-width: 20px;"> <span class="layui-badge-dot layui-bg-blue"></span></li>
								<li style="padding: 0px;line-height: 20px;"><strong>概要信息</strong></li>
							</ul>
							
							<!-- table生成区域 -->
							<div class="layui-form">
							  <table class="layui-table">
							    <thead>
							    	<tr style="background-color: #F9F8CB;color: #F38F47;">
							        <th colspan="4"><strong>共建档 0人（以下数据为截止昨天统计）</strong></th>
							      </tr>
							    	<tr style="background-color: #F9F8CB;color: #F38F47;">
							        <th colspan="4"><strong>本月建档 0 人（本月指：建档日期） </strong></th>
							      </tr>
							      <tr style="background-color: #E8FBFB;color: #074f86;">
							        <th>分类(已管理)</th>
							        <th>人数</th>
							        <th>分类(已管理)</th>
							        <th>人数</th>
							      </tr> 
							    </thead>
							    <tbody>
							      <tr style="color: #074f86;">
							        <td>儿童</td>
							        <td>0</td>
							        <td>高血压</td>
							        <td>0</td>
							      </tr>
							      <tr style="color: #074f86;">
							        <td>孕产妇</td>
							        <td>0</td>
							        <td>糖尿病</td>
							        <td>0</td>
							      </tr>
							      <tr style="color: #074f86;">
							        <td>老年人</td>
							        <td>0</td>
							        <td>精神病</td>
							        <td>0</td>
							      </tr>
							    </tbody>
							  </table>
							</div>
							<!-- -->
							
						</div>
					</div>
				</div>
				<div class="layui-col-md12">
					<div class="grid-demo grid-demo-bg3" style="margin-left: 10px;margin-right: 10px;">
						<div class="layui-tab layui-tab-card">
							<ul class="layui-tab-title" style="height: 25px;background-color: #CBECF9;">
								<li style="padding: 0px;line-height: 20px;min-width: 20px;"> <span class="layui-badge-dot layui-bg-blue"></span></li>
								<li style="padding: 0px;line-height: 20px;"><strong>预警信息</strong></li>
							</ul>
							<!-- -->
							<div class="layui-form">
							  <table class="layui-table" lay-skin="line">
							    <tbody>
							      <tr style="color: #074f86;">
							        <td style="text-align: left;">&nbsp;&nbsp;慢病随访预警</td>
							        <td style="width: 150px;">
							        	<button class="layui-btn layui-btn-primary layui-btn-xs" style="border: 0px;">
							        		<i class="layui-icon layui-icon-layer"></i> 
							        	</button>
							        	<button class="layui-btn layui-btn-primary layui-btn-xs" style="border: 0px;">
							        		<i class="layui-icon layui-icon-set"></i> 
							        	</button>
							        	<button class="layui-btn layui-btn-primary layui-btn-xs" style="border: 0px;">
							        		<i class="layui-icon layui-icon-cellphone"></i> 
							        	</button>
							        </td>
							      </tr>
							      <tr style="color: #074f86;">
							        <td style="text-align: left;">&nbsp;&nbsp;重点人群</td>
							        <td>
							        	<button class="layui-btn layui-btn-primary layui-btn-xs" style="border: 0px;">
							        		<i class="layui-icon layui-icon-layer"></i> 
							        	</button>
							        	<button class="layui-btn layui-btn-primary layui-btn-xs" style="border: 0px;">
							        		<i class="layui-icon layui-icon-set"></i> 
							        	</button>
							        	<button class="layui-btn layui-btn-primary layui-btn-xs" style="border: 0px;">
							        		<i class="layui-icon layui-icon-cellphone"></i> 
							        	</button>
							        </td>
							      </tr>
							      <tr style="color: #074f86;">
							        <td style="text-align: left;">&nbsp;&nbsp;预防接种预警 </td>
							        <td>
							        	<button class="layui-btn layui-btn-primary layui-btn-xs" style="border: 0px;">
							        		<i class="layui-icon layui-icon-layer"></i> 
							        	</button>
							        	<button class="layui-btn layui-btn-primary layui-btn-xs" style="border: 0px;">
							        		<i class="layui-icon layui-icon-set"></i> 
							        	</button>
							        	<button class="layui-btn layui-btn-primary layui-btn-xs" style="border: 0px;">
							        		<i class="layui-icon layui-icon-cellphone"></i> 
							        	</button>
							        </td>
							      </tr>
							      <tr style="color: #074f86;">
							        <td style="text-align: left;">&nbsp;&nbsp;未建档</td>
							        <td>
							        	<button class="layui-btn layui-btn-primary layui-btn-xs" style="border: 0px;">
							        		<i class="layui-icon layui-icon-layer"></i> 
							        	</button>
							        	<button class="layui-btn layui-btn-primary layui-btn-xs" style="border: 0px;">
							        		<i class="layui-icon layui-icon-set"></i> 
							        	</button>
							        	<button class="layui-btn layui-btn-primary layui-btn-xs" style="border: 0px;">
							        		<i class="layui-icon layui-icon-cellphone"></i> 
							        	</button>
							        </td>
							      </tr>
							    </tbody>
							  </table>
							</div>
							<!-- -->
						</div>
					</div>
				</div>
				<div class="layui-col-md12">
					<div class="grid-demo grid-demo-bg4" style="margin-left: 10px;margin-right: 10px;">
						<div class="layui-tab layui-tab-card" style="margin: 0px;">
							<ul class="layui-tab-title" style="height: 25px;background-color: #CBECF9;">
								<li style="padding: 0px;line-height: 20px;min-width: 20px;"> <span class="layui-badge-dot layui-bg-blue"></span></li>
								<li style="padding: 0px;line-height: 20px;"><strong>工具箱</strong></li>
							</ul>
							<!-- -->
							<div class="layui-form">
							  <table class="layui-table" lay-skin="line">
							    <tbody>
							      <tr style="color: #074f86;">
							        <td style="text-align: left;width: 30px;">&nbsp;&nbsp;<i class="layui-icon layui-icon-link"></i> </td>
							        <td style="text-align: left;">
							        	河南省居民健康卡接口安装程序
							        </td>
							      </tr>
							      <tr style="color: #074f86;">
							        <td style="text-align: left;">&nbsp;&nbsp;<i class="layui-icon layui-icon-link"></i> </td>
							        <td style="text-align: left;">
							        	报表插件下载
							        </td>
							      </tr>
							      <tr style="color: #074f86;">
							        <td style="text-align: left;">&nbsp;&nbsp;<i class="layui-icon layui-icon-link"></i> </td>
							        <td style="text-align: left;">
							        	医生端APP18_09_13下载
							        </td>
							      </tr>
							    </tbody>
							  </table>
							</div>
							<!-- -->
						</div>
					</div>
				</div>
			</div>
		</div>
</body>
<script type="text/javascript" src="/js/one.js"></script>
	<script type="text/javascript" src="/js/two.js"></script>
	<script type="text/javascript" src="/js/layui.js"></script>
</html>