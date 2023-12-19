<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
 <div class="row">
  <div class="col-md-6 col-md-offset-3 ">
   <div class="panel panel-primary">
    <div class="panel-heading">Añadir tarea</div>
    <div class="panel-body">
     <form:form method="post" modelAttribute="todo">
      <form:hidden path="id" />
      <fieldset class="form-group">
       <form:label path="nametodo">Nombre Tarea</form:label>
       <form:input path="nametodo" type="text" class="form-control"
        required="required" />
       <form:errors path="nametodo" cssClass="text-warning" />
      </fieldset>
      
      <fieldset class="form-group">
       <form:label path="duration">Duración</form:label>
       <form:input path="duration" type="text" class="form-control"
        required="required" />
       <form:errors path="duration" cssClass="text-warning" />
      </fieldset>
      
      <fieldset class="form-group">
       <form:label path="priority">Prioridad</form:label>
       <form:input path="priority" type="text" class="form-control"
        required="required" />
       <form:errors path="priority" cssClass="text-warning" />
      </fieldset>
      
      <fieldset class="form-group">
       <form:label path="listname">Lista de Tareas</form:label>
       <form:input path="listname" list="listtodo" class="form-control"
        required="required" />
       <form:errors path="listname" cssClass="text-warning" />
      </fieldset>
      
      <fieldset class="form-group">
       <form:label path="description">Description</form:label>
       <form:input path="description" type="text" class="form-control"
        required="required" />
       <form:errors path="description" cssClass="text-warning" />
      </fieldset>

      <button type="submit" class="btn btn-success">Guardar</button>
     </form:form>
     <datalist>
     </datalist>
    </div>
   </div>
  </div>
 </div>
</div>
<%@ include file="common/footer.jspf"%>