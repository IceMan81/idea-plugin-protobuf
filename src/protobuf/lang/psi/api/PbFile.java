package protobuf.lang.psi.api;

import com.intellij.psi.PsiFile;
import protobuf.lang.psi.api.PbPsiElement;
import protobuf.lang.psi.api.declaration.PbImportDef;
import protobuf.lang.psi.api.declaration.PbMessageDef;
import protobuf.lang.psi.api.declaration.PbPackageDef;

/**
 * author: Nikolay Matveev
 */

public interface PbFile extends PsiFile, PbPsiElement{        

    PbPackageDef getPackageDefinition();

    String getPackageName();

    PbImportDef[] getImportDefinitions();

    PbMessageDef getDummyMessage();

}
