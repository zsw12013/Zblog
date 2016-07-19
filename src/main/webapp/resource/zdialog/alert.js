zdialog={
  _create:function(){
	var _mask=document.createElement("div");
    _mask.setAttribute("class","alert_mask");
    _mask.style.width = $(document).width()+"px";
    _mask.style.height = $(document).height()+"px";
    _mask.style.display = "block";
    document.body.appendChild(_mask);
  },
  show:function(id){
    this._create();
    var box=$("#"+id);
    box.css("top",($(window).height()-box.height())/2);
    box.css("left",($(window).width()-box.width())/2);
    box.show();
  },
  edit:function(id){
	  alert("暂时不提供此功能");
	  return;
	    this._create();
	    var select = $("#tree .node-selected").text();
	    $("#editCategory").val(select);
	    var box=$("#"+id);
	    console.log(select);
	    box.css("top",($(window).height()-box.height())/2);
	    box.css("left",($(window).width()-box.width())/2);
	    box.show();
	  },
  
  hide:function(id){
    $(".alert_mask").remove();
    $("#"+id).hide();
  }
}