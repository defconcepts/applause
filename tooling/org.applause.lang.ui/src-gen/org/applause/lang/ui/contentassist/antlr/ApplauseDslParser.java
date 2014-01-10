/*
* generated by Xtext
*/
package org.applause.lang.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.applause.lang.services.ApplauseDslGrammarAccess;

public class ApplauseDslParser extends AbstractContentAssistParser {
	
	@Inject
	private ApplauseDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.applause.lang.ui.contentassist.antlr.internal.InternalApplauseDslParser createParser() {
		org.applause.lang.ui.contentassist.antlr.internal.InternalApplauseDslParser result = new org.applause.lang.ui.contentassist.antlr.internal.InternalApplauseDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getNamedElementAccess().getAlternatives(), "rule__NamedElement__Alternatives");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getKeywordedIDAccess().getAlternatives(), "rule__KeywordedID__Alternatives");
					put(grammarAccess.getRESTURLAccess().getAlternatives(), "rule__RESTURL__Alternatives");
					put(grammarAccess.getUrlFragmentAccess().getAlternatives(), "rule__UrlFragment__Alternatives");
					put(grammarAccess.getReferrableElementAccess().getAlternatives(), "rule__ReferrableElement__Alternatives");
					put(grammarAccess.getUIActionSpecificationAccess().getAlternatives(), "rule__UIActionSpecification__Alternatives");
					put(grammarAccess.getUIComponentOrDataTypeAccess().getAlternatives(), "rule__UIComponentOrDataType__Alternatives");
					put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
					put(grammarAccess.getRESTVerbAccess().getAlternatives(), "rule__RESTVerb__Alternatives");
					put(grammarAccess.getScreenKindAccess().getAlternatives(), "rule__ScreenKind__Alternatives");
					put(grammarAccess.getGestureKindAccess().getAlternatives(), "rule__GestureKind__Alternatives");
					put(grammarAccess.getActionVerbAccess().getAlternatives(), "rule__ActionVerb__Alternatives");
					put(grammarAccess.getUIActionKindAccess().getAlternatives(), "rule__UIActionKind__Alternatives");
					put(grammarAccess.getDataTypeAccess().getGroup(), "rule__DataType__Group__0");
					put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
					put(grammarAccess.getEntityAccess().getGroup_3(), "rule__Entity__Group_3__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getPlatformAccess().getGroup(), "rule__Platform__Group__0");
					put(grammarAccess.getTypeMappingAccess().getGroup(), "rule__TypeMapping__Group__0");
					put(grammarAccess.getDataSourceAccess().getGroup(), "rule__DataSource__Group__0");
					put(grammarAccess.getDataSourceAccessMethodAccess().getGroup(), "rule__DataSourceAccessMethod__Group__0");
					put(grammarAccess.getDataSourceAccessMethodAccess().getGroup_2(), "rule__DataSourceAccessMethod__Group_2__0");
					put(grammarAccess.getDataSourceAccessMethodAccess().getGroup_2_1(), "rule__DataSourceAccessMethod__Group_2_1__0");
					put(grammarAccess.getRESTSpecificationAccess().getGroup(), "rule__RESTSpecification__Group__0");
					put(grammarAccess.getRESTSpecificationAccess().getGroup_2(), "rule__RESTSpecification__Group_2__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getAbsoluteRESTURLAccess().getGroup(), "rule__AbsoluteRESTURL__Group__0");
					put(grammarAccess.getAbsoluteRESTURLAccess().getGroup_3(), "rule__AbsoluteRESTURL__Group_3__0");
					put(grammarAccess.getAbsoluteRESTURLAccess().getGroup_4(), "rule__AbsoluteRESTURL__Group_4__0");
					put(grammarAccess.getRelativeRESTURLAccess().getGroup(), "rule__RelativeRESTURL__Group__0");
					put(grammarAccess.getRelativeRESTURLAccess().getGroup_3(), "rule__RelativeRESTURL__Group_3__0");
					put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getScreenAccess().getGroup(), "rule__Screen__Group__0");
					put(grammarAccess.getScreenAccess().getGroup_3(), "rule__Screen__Group_3__0");
					put(grammarAccess.getScreenAccess().getGroup_5(), "rule__Screen__Group_5__0");
					put(grammarAccess.getScreenAccess().getGroup_6(), "rule__Screen__Group_6__0");
					put(grammarAccess.getScreenAccess().getGroup_11(), "rule__Screen__Group_11__0");
					put(grammarAccess.getScreenSectionAccess().getGroup(), "rule__ScreenSection__Group__0");
					put(grammarAccess.getScreenSectionAccess().getGroup_2(), "rule__ScreenSection__Group_2__0");
					put(grammarAccess.getScreenSectionAccess().getGroup_3(), "rule__ScreenSection__Group_3__0");
					put(grammarAccess.getScreenSectionItemsAccess().getGroup(), "rule__ScreenSectionItems__Group__0");
					put(grammarAccess.getScreenListItemCellAccess().getGroup(), "rule__ScreenListItemCell__Group__0");
					put(grammarAccess.getScreenListItemCellAccess().getGroup_2(), "rule__ScreenListItemCell__Group_2__0");
					put(grammarAccess.getScreenListItemCellAccess().getGroup_5(), "rule__ScreenListItemCell__Group_5__0");
					put(grammarAccess.getUIActionAccess().getGroup(), "rule__UIAction__Group__0");
					put(grammarAccess.getUIActionAccess().getGroup_2(), "rule__UIAction__Group_2__0");
					put(grammarAccess.getUIActionAccess().getGroup_3(), "rule__UIAction__Group_3__0");
					put(grammarAccess.getUIActionAccess().getGroup_7(), "rule__UIAction__Group_7__0");
					put(grammarAccess.getUIActionAccess().getGroup_8(), "rule__UIAction__Group_8__0");
					put(grammarAccess.getUIActionNavigateActionAccess().getGroup(), "rule__UIActionNavigateAction__Group__0");
					put(grammarAccess.getUIActionDeleteActionAccess().getGroup(), "rule__UIActionDeleteAction__Group__0");
					put(grammarAccess.getListItemCellDeclarationAccess().getGroup(), "rule__ListItemCellDeclaration__Group__0");
					put(grammarAccess.getUIComponentDeclarationAccess().getGroup(), "rule__UIComponentDeclaration__Group__0");
					put(grammarAccess.getUIComponentMemberDeclarationAccess().getGroup(), "rule__UIComponentMemberDeclaration__Group__0");
					put(grammarAccess.getRESTMethodCallAccess().getGroup(), "rule__RESTMethodCall__Group__0");
					put(grammarAccess.getDataSourceCallAccess().getGroup(), "rule__DataSourceCall__Group__0");
					put(grammarAccess.getUIComponentMemberConfigurationAccess().getGroup(), "rule__UIComponentMemberConfiguration__Group__0");
					put(grammarAccess.getUIComponentMemberCallAccess().getGroup(), "rule__UIComponentMemberCall__Group__0");
					put(grammarAccess.getUIComponentMemberCallAccess().getGroup_1(), "rule__UIComponentMemberCall__Group_1__0");
					put(grammarAccess.getEntityMemberCallAccess().getGroup(), "rule__EntityMemberCall__Group__0");
					put(grammarAccess.getEntityMemberCallTailAccess().getGroup(), "rule__EntityMemberCallTail__Group__0");
					put(grammarAccess.getModelAccess().getElementsAssignment(), "rule__Model__ElementsAssignment");
					put(grammarAccess.getDataTypeAccess().getNameAssignment_1(), "rule__DataType__NameAssignment_1");
					put(grammarAccess.getEntityAccess().getAbstractAssignment_0(), "rule__Entity__AbstractAssignment_0");
					put(grammarAccess.getEntityAccess().getNameAssignment_2(), "rule__Entity__NameAssignment_2");
					put(grammarAccess.getEntityAccess().getSuperTypeAssignment_3_1(), "rule__Entity__SuperTypeAssignment_3_1");
					put(grammarAccess.getEntityAccess().getAttributesAssignment_5(), "rule__Entity__AttributesAssignment_5");
					put(grammarAccess.getAttributeAccess().getTypeAssignment_0(), "rule__Attribute__TypeAssignment_0");
					put(grammarAccess.getAttributeAccess().getManyAssignment_1(), "rule__Attribute__ManyAssignment_1");
					put(grammarAccess.getAttributeAccess().getNameAssignment_2(), "rule__Attribute__NameAssignment_2");
					put(grammarAccess.getPlatformAccess().getNameAssignment_1(), "rule__Platform__NameAssignment_1");
					put(grammarAccess.getPlatformAccess().getMappingsAssignment_3(), "rule__Platform__MappingsAssignment_3");
					put(grammarAccess.getTypeMappingAccess().getTypeAssignment_1(), "rule__TypeMapping__TypeAssignment_1");
					put(grammarAccess.getTypeMappingAccess().getSimpleNameAssignment_3(), "rule__TypeMapping__SimpleNameAssignment_3");
					put(grammarAccess.getDataSourceAccess().getNameAssignment_1(), "rule__DataSource__NameAssignment_1");
					put(grammarAccess.getDataSourceAccess().getBaseUrlAssignment_5(), "rule__DataSource__BaseUrlAssignment_5");
					put(grammarAccess.getDataSourceAccess().getResourceTypeAssignment_8(), "rule__DataSource__ResourceTypeAssignment_8");
					put(grammarAccess.getDataSourceAccess().getMethodsAssignment_9(), "rule__DataSource__MethodsAssignment_9");
					put(grammarAccess.getDataSourceAccessMethodAccess().getNameAssignment_0(), "rule__DataSourceAccessMethod__NameAssignment_0");
					put(grammarAccess.getDataSourceAccessMethodAccess().getDeclaredParametersAssignment_2_0(), "rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_0");
					put(grammarAccess.getDataSourceAccessMethodAccess().getDeclaredParametersAssignment_2_1_1(), "rule__DataSourceAccessMethod__DeclaredParametersAssignment_2_1_1");
					put(grammarAccess.getDataSourceAccessMethodAccess().getReturnsManyAssignment_4(), "rule__DataSourceAccessMethod__ReturnsManyAssignment_4");
					put(grammarAccess.getDataSourceAccessMethodAccess().getRestSpecificationAssignment_5(), "rule__DataSourceAccessMethod__RestSpecificationAssignment_5");
					put(grammarAccess.getRESTSpecificationAccess().getVerbAssignment_0(), "rule__RESTSpecification__VerbAssignment_0");
					put(grammarAccess.getRESTSpecificationAccess().getPathAssignment_1(), "rule__RESTSpecification__PathAssignment_1");
					put(grammarAccess.getRESTSpecificationAccess().getBodyAssignment_2_1(), "rule__RESTSpecification__BodyAssignment_2_1");
					put(grammarAccess.getDataSourceBodySpecificationAccess().getBodycontentsAssignment(), "rule__DataSourceBodySpecification__BodycontentsAssignment");
					put(grammarAccess.getParameterAccess().getTypeAssignment_0(), "rule__Parameter__TypeAssignment_0");
					put(grammarAccess.getParameterAccess().getNameAssignment_1(), "rule__Parameter__NameAssignment_1");
					put(grammarAccess.getAbsoluteRESTURLAccess().getHostAssignment_2(), "rule__AbsoluteRESTURL__HostAssignment_2");
					put(grammarAccess.getAbsoluteRESTURLAccess().getPortAssignment_3_1(), "rule__AbsoluteRESTURL__PortAssignment_3_1");
					put(grammarAccess.getAbsoluteRESTURLAccess().getFragmentsAssignment_4_1(), "rule__AbsoluteRESTURL__FragmentsAssignment_4_1");
					put(grammarAccess.getRelativeRESTURLAccess().getFragmentsAssignment_2(), "rule__RelativeRESTURL__FragmentsAssignment_2");
					put(grammarAccess.getRelativeRESTURLAccess().getFragmentsAssignment_3_1(), "rule__RelativeRESTURL__FragmentsAssignment_3_1");
					put(grammarAccess.getUrlPathFragmentAccess().getNameAssignment(), "rule__UrlPathFragment__NameAssignment");
					put(grammarAccess.getVariableAccess().getParameterReferenceAssignment_1(), "rule__Variable__ParameterReferenceAssignment_1");
					put(grammarAccess.getScreenAccess().getKindAssignment_1(), "rule__Screen__KindAssignment_1");
					put(grammarAccess.getScreenAccess().getNameAssignment_2(), "rule__Screen__NameAssignment_2");
					put(grammarAccess.getScreenAccess().getInputParameterAssignment_3_1(), "rule__Screen__InputParameterAssignment_3_1");
					put(grammarAccess.getScreenAccess().getTitleAssignment_5_2(), "rule__Screen__TitleAssignment_5_2");
					put(grammarAccess.getScreenAccess().getDatasourceAssignment_6_2(), "rule__Screen__DatasourceAssignment_6_2");
					put(grammarAccess.getScreenAccess().getSectionsAssignment_9(), "rule__Screen__SectionsAssignment_9");
					put(grammarAccess.getScreenAccess().getActionsAssignment_11_2(), "rule__Screen__ActionsAssignment_11_2");
					put(grammarAccess.getScreenSectionAccess().getTitleAssignment_2_2(), "rule__ScreenSection__TitleAssignment_2_2");
					put(grammarAccess.getScreenSectionAccess().getDatasourceAssignment_3_2(), "rule__ScreenSection__DatasourceAssignment_3_2");
					put(grammarAccess.getScreenSectionAccess().getItemsAssignment_4(), "rule__ScreenSection__ItemsAssignment_4");
					put(grammarAccess.getScreenSectionItemsAccess().getItemsAssignment_3(), "rule__ScreenSectionItems__ItemsAssignment_3");
					put(grammarAccess.getScreenListItemCellAccess().getTypeAssignment_1(), "rule__ScreenListItemCell__TypeAssignment_1");
					put(grammarAccess.getScreenListItemCellAccess().getRestMethodAssignment_2_1(), "rule__ScreenListItemCell__RestMethodAssignment_2_1");
					put(grammarAccess.getScreenListItemCellAccess().getVariableAssignment_2_3(), "rule__ScreenListItemCell__VariableAssignment_2_3");
					put(grammarAccess.getScreenListItemCellAccess().getConfigurationsAssignment_4(), "rule__ScreenListItemCell__ConfigurationsAssignment_4");
					put(grammarAccess.getScreenListItemCellAccess().getActionsAssignment_5_2(), "rule__ScreenListItemCell__ActionsAssignment_5_2");
					put(grammarAccess.getLoopVariableAccess().getNameAssignment(), "rule__LoopVariable__NameAssignment");
					put(grammarAccess.getUIActionAccess().getTitleAssignment_2_2(), "rule__UIAction__TitleAssignment_2_2");
					put(grammarAccess.getUIActionAccess().getIconAssignment_3_2(), "rule__UIAction__IconAssignment_3_2");
					put(grammarAccess.getUIActionAccess().getActionAssignment_6(), "rule__UIAction__ActionAssignment_6");
					put(grammarAccess.getUIActionAccess().getGestureAssignment_7_2(), "rule__UIAction__GestureAssignment_7_2");
					put(grammarAccess.getUIActionAccess().getOrderAssignment_8_2(), "rule__UIAction__OrderAssignment_8_2");
					put(grammarAccess.getUIActionNavigateActionAccess().getTargetScreenAssignment_1(), "rule__UIActionNavigateAction__TargetScreenAssignment_1");
					put(grammarAccess.getUIActionNavigateActionAccess().getActionVerbAssignment_3(), "rule__UIActionNavigateAction__ActionVerbAssignment_3");
					put(grammarAccess.getUIActionNavigateActionAccess().getVariableAssignment_5(), "rule__UIActionNavigateAction__VariableAssignment_5");
					put(grammarAccess.getListItemCellDeclarationAccess().getNameAssignment_1(), "rule__ListItemCellDeclaration__NameAssignment_1");
					put(grammarAccess.getListItemCellDeclarationAccess().getMembersAssignment_3(), "rule__ListItemCellDeclaration__MembersAssignment_3");
					put(grammarAccess.getUIComponentDeclarationAccess().getNameAssignment_1(), "rule__UIComponentDeclaration__NameAssignment_1");
					put(grammarAccess.getUIComponentDeclarationAccess().getMembersAssignment_3(), "rule__UIComponentDeclaration__MembersAssignment_3");
					put(grammarAccess.getUIComponentMemberDeclarationAccess().getTypeAssignment_0(), "rule__UIComponentMemberDeclaration__TypeAssignment_0");
					put(grammarAccess.getUIComponentMemberDeclarationAccess().getNameAssignment_1(), "rule__UIComponentMemberDeclaration__NameAssignment_1");
					put(grammarAccess.getRESTMethodCallAccess().getDatasourceAssignment_0(), "rule__RESTMethodCall__DatasourceAssignment_0");
					put(grammarAccess.getRESTMethodCallAccess().getRestMethodAssignment_2(), "rule__RESTMethodCall__RestMethodAssignment_2");
					put(grammarAccess.getDataSourceCallAccess().getDatasourceAssignment_0(), "rule__DataSourceCall__DatasourceAssignment_0");
					put(grammarAccess.getDataSourceCallAccess().getNameAssignment_2(), "rule__DataSourceCall__NameAssignment_2");
					put(grammarAccess.getUIComponentMemberConfigurationAccess().getTypeAssignment_0(), "rule__UIComponentMemberConfiguration__TypeAssignment_0");
					put(grammarAccess.getUIComponentMemberConfigurationAccess().getValueAssignment_2(), "rule__UIComponentMemberConfiguration__ValueAssignment_2");
					put(grammarAccess.getUIComponentMemberCallAccess().getComponentAssignment_0(), "rule__UIComponentMemberCall__ComponentAssignment_0");
					put(grammarAccess.getUIComponentMemberCallAccess().getMemberAssignment_1_1(), "rule__UIComponentMemberCall__MemberAssignment_1_1");
					put(grammarAccess.getEntityMemberCallAccess().getHeadAssignment_0(), "rule__EntityMemberCall__HeadAssignment_0");
					put(grammarAccess.getEntityMemberCallAccess().getTailAssignment_1(), "rule__EntityMemberCall__TailAssignment_1");
					put(grammarAccess.getEntityMemberCallTailAccess().getHeadAssignment_1(), "rule__EntityMemberCallTail__HeadAssignment_1");
					put(grammarAccess.getEntityMemberCallTailAccess().getTailAssignment_2(), "rule__EntityMemberCallTail__TailAssignment_2");
					put(grammarAccess.getAttributeReferenceAccess().getValueAssignment(), "rule__AttributeReference__ValueAssignment");
					put(grammarAccess.getStringLiteralAccess().getValueAssignment(), "rule__StringLiteral__ValueAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.applause.lang.ui.contentassist.antlr.internal.InternalApplauseDslParser typedParser = (org.applause.lang.ui.contentassist.antlr.internal.InternalApplauseDslParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ApplauseDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ApplauseDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
