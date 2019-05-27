<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>5dg46dfg64</name>
   <tag></tag>
   <elementGuidId>6718b4f4-601f-4e81-b364-b001b217ca41</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//body</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>body</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>skin-light fixed sidebar-mini pace-done</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
  





  
  
    
      
        
        
                  
          
              
    

    
          Editando Tipo de Acción &quot;Prueba Calidad&quot;


  
    Tipos de AcciónEditando Tipo de Acción &quot;Prueba Calidad&quot;  

  
      
      
              
    
      
        Cristian Henao      
      
        Ingeniero SQA      
    
    
      
        
          
            
                          
                      
        
        
          
            
                Perfil            
          
          
            
                Cerrar sesión            
          
        
      
    
  
      
    
  

  
  
    

  
    
  
  
    
          
        
          
            
            
            
          
          Tareas
        
        
          $(function () {
            $.getJSON('/app.php/staff/amount_tasks', function (data) {
              if (data.amount > 0) {
                $('path.icon-tasks-amount').show();
                $('text.icon-tasks-amount').text(data.amount).show();
              }
            });
          });
        
      
      
        
          
        
        Portal
        
          
        
      
      
                                    
                                            
                                            
                Documentos              
                                                
                Indicadores              
                                                
            Videos          
              
      
    
  
  
  

Planes de acción
    
      
        Índex
      
      
        Todos
      
      
        Planeación
      
      
        Ejecución
      
      
        Informes
      
      
        separator
      
      
        
  

Configuración
        
          
            Tipos
          
          
            Orígenes planes de acción
          
          
            Tipos de Acción
          
          
            Priorización de causas
          
          
            Impactos
          
        
      
    
  
  
  
  
  
  
  

    
    
    

    
                                        

                  
      
  

  
    
  
  
    
  
  
    
  



  

  
  
    
          
  
  
    
                
  


  
  
                                
        
          


  
  
  
    

    
    
      


      &lt;h1 title='Editando Tipo de Acción &quot;Prueba Calidad&quot;' class=&quot;no-tipsy&quot;>Editando Tipo de Acción &quot;Prueba Calidad&quot;
&lt;/h1>
&lt;div class=&quot;header__breadcrumb-container&quot;>
  &lt;ol class=&quot;breadcrumb&quot;>
    &lt;li>&lt;a class=&quot;tq_self_none&quot; style=&quot;overflow:hidden;&quot; href=&quot;/app.php/staff/ap_action_type&quot;>Tipos de Acción&lt;/a>&lt;/li>&lt;li  class=&quot;active ellipsis_text&quot;  title=&quot;Editando Tipo de Acción 'Prueba Calidad'&quot;>Editando Tipo de Acción &quot;Prueba Calidad&quot;&lt;/li>  &lt;/ol>
&lt;/div>
  


        &lt;div
    class=&quot;col-sm-12 titlebar__spacer titlebar__spacer--top&quot;
    >&lt;/div>
  &lt;div class=&quot;titlebar__spacer-cleaner &quot;>&lt;/div>
  &lt;div class=&quot;record-history col-sm-12&quot;>
    &lt;ul class=&quot;rh-nav-pills&quot;>
                &lt;/ul>
  &lt;/div>

&lt;div class=&quot;header-actions&quot;>
  
  &lt;div class=&quot;link-options&quot;>
                                &lt;!-- original pos -->
        
          &lt;/div>
&lt;/div>

  &lt;div class=&quot;titlebar__spacer-cleaner &quot;>&lt;/div>
  &lt;div
    class=&quot;col-sm-12 titlebar__spacer titlebar__spacer--bottom&quot;
    >&lt;/div>
  



  
  
      

  
    
  $(function() {
    var getFCWords = function  (str) {
      var rcTmp = str.split(' '),
          nuCont = rcTmp.length,
          result = '';
      for (var i=0; i&lt;nuCont; i++) {
        result += rcTmp[i].substr(0, 1);
      }
      return result.toUpperCase();
    };
    $('input[id*=name]').keyup(function() {
      $('input[id*=abbr]').attr({'value': getFCWords($('input[id*=name]').attr('value'))});
    });
  });


      
    
          
  
            
        
      Tipo
      
        
                  Ingrese el Tipo de Acción
              
    
  
            
        
      Tipos de plan de acción
      
                
                  Seleccionar los tipos de planes relacionados a este tipo de acción.
              
    
  
            
        
      Descripción
      
        Estamos planteando una alternativa para pruebas.
                  Breve descripción del tipo de acción
              
    
  
            
        
      Estado
      
        
                  Es un tipo activo?
              
    
  
  
    
    
  Eliminar  Regresar    
  

  

  
      


    
    
  
  

  
  
    
      
        www.darumasoftware.com
      
    
  
  

  
  
    
      
        
      
    
    
      
        
        
        
      
    
  
  

  
  
      
    
      
        
          
            
          
          Lista de módulos
        
        
          
                                                                                                                  
                                    
                    
                      
                    
                  
                  
  
  
  
  
  
  

                  Organización                
                                                                                                                        
                                    
                    
                      
                    
                  
                  
  

                  Configuración                
                                                                                                                        
                                    
                    
                      
                    
                  
                  
  
  
  
  
  
  
  

                  Accidentes                
                                                                                                                        
                                    
                    
                      
                    
                  
                  
  
  

                  Acreditación                
                                                                                                                        
                                    
                    
                      
                    
                  
                  
  
  
  
  
  
  

                  Actas                
                                                                                                                        
                                    
                    
                      
                    
                  
                  
  
  

                  ARD                
                                                                                                                        
                                    
                    
                      
                    
                  
                  
  

                  Auditorías                
                                                                                                                        
                                    
                    
                      
                    
                  
                  
  
  

                  Aud. Comp.                
                                                                                                                        
                                    
                    
                      
                    
                  
                  
  
  
  
  

                  Docs. legales y externos                
                                                                                                                        
                                    
                    
                      
                    
                  
                  
  
  

                  Documentos                
                                                                                                                        
                                    
                    
                      
                    
                  
                  
  
  
  
  
  
  

                  Encuesta                
                                                                                                                        
                                    
                    
                      
                    
                  
                  
  
  
  

                  Equipos                
                                                                                                                        
                                    
                    
                      
                    
                  
                  
  
  
  
  

                  Estrategia                
                                                                                                                        
                                    
                    
                      
                    
                  
                  
  

                  Eventos                
                                                                                                                        
                                    
                    
                      
                    
                  
                  
  

                  Habilitación                
                                                                                                                        
                                    
                    
                      
                    
                  
                  
  
  
  

                  Herramientas                
                                                                                                                        
                                    
                    
                      
                    
                  
                  
  
  
  
  
  
  
  
  
  

                  Incidentes                
                                                                                                                        
                                    
                    
                      
                    
                  
                  
  
  

                  Indicadores                
                                                                                                                        
                                    
                    
                      
                    
                  
                  
  
  
  

                  Informes                
                                                                                                                                                          
                                    
                    
                      
                    
                  
                  
  
  
  

                  Oportunidades                
                                                                                                                        
                                    
                    
                      
                    
                  
                  
  
  

                  PAMEC                
                                                                                                                        
                                    
                    
                      
                    
                  
                  
  

                  Admin. Portal                
                                                                                                                        
                                    
                    
                      
                    
                  
                  
  
  
  

                  Planes de acción                
                                                                                                                        
                                    
                    
                      
                    
                  
                  
  
  
  
  
  
  

                  Productos                
                                                                                                                        
                                    
                    
                      
                    
                  
                  
  
  
  
  
  

                  Procesos                
                                                                                                                        
                                    
                    
                      
                    
                  
                  
  

                  Proveedores                
                                                                                                                        
                                    
                    
                      
                    
                  
                  
  

                  Proyectos                
                                                                                                                        
                                    
                    
                      
                    
                  
                  
  
  
  

                  Riesgos                
                                                                                                                        
                                    
                    
                      
                    
                  
                  
  
  

                  Satisfacción                
                                                                                                                        
                                    
                    
                      
                    
                  
                  
  
  
  
  
  
  
  
  
  

                  Situaciones                
                                                                                                                        
                                    
                    
                      
                    
                  
                  
  
  
  
  
  
  
  

                  Tableros de Mando                
                                                                                                                        
                                    
                    
                      
                    
                  
                  
  
  
  
  

                  T. Humano                
                                                                                                                        
                                    
                    
                      
                    
                  
                  
  
  
  
  
  
  
  
  
  
  

                  Work flow                
                                                                                                                        
                                    
                    
                      
                    
                  
                  
  
  
  

                  Servicio No Conforme                
                                            
      
      
    
    
  

  
    
      
      
      
      
      
      
      
      
      
      
    
  
  
  




Seleccionar TodoQuitar Selección   Seleccionar TodoQuitar Selección   id(&quot;ap_action_type_notes&quot;)Seleccionar TodoQuitar Selección   </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[@class=&quot;tablesaw-enhanced&quot;]/body[@class=&quot;skin-light fixed sidebar-mini pace-done&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//body</value>
   </webElementXpaths>
</WebElementEntity>
